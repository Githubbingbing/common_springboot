package com.example.springboot.base.aspect;

import com.example.springboot.base.annotation.Log;
import com.example.springboot.base.utils.HttpContextUtils;
import com.example.springboot.base.utils.IPUtils;
import com.example.springboot.base.utils.JSONUtils;
import com.example.springboot.mapper.SystemLogMapper;
import com.example.springboot.model.TSystemLog;
import com.example.springboot.model.TUser;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 日志aop
 *
 * @author guibing.lin
 * @date 2020/7/30
 */
@Slf4j
@Aspect
@Component
@AllArgsConstructor
public class LogAspect {

    private SystemLogMapper systemLogMapper;

    @Pointcut("@annotation(com.example.springboot.base.annotation.Log)")
    public void logPointCut() {
    }

    /**
     * 获取自定义注解内参数时，around里的annotation里的systemLog与方法参数中的自定义注解别名systemLog需一致
     *
     * @param point     :切点
     * @param systemLog :系统日志注解
     * @return java.lang.Object
     */
    @Around("logPointCut() && @annotation(systemLog)")
//    @Async("asyncServiceExecutor")
    public Object around(ProceedingJoinPoint point, Log systemLog) throws Throwable {
        //开始时间
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        log.info("测试注解切面--------" + time);
        String logType = systemLog.type();
        String logValue = systemLog.value();
        savaSystemLog(point, time, logType, logValue);
        return result;
    }


    public void savaSystemLog(ProceedingJoinPoint joinPoint, long time, String logType, String logValue) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        TSystemLog systemLog = new TSystemLog();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        String params = null;
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        if (request != null) {
            systemLog.setMethod(request.getMethod() + " " + request.getRequestURI());
            Map<String, String[]> parameterMap = request.getParameterMap();
            params = JSONUtils.beanToJson(parameterMap);
            systemLog.setIp(IPUtils.getIpAddr(request));
        } else {
            systemLog.setMethod(className + "." + methodName + "()");
            Object[] args = joinPoint.getArgs();
            params = JSONUtils.beanToJson(args);
        }
        systemLog.setParams(params);

        TUser tUser = null;// 待权限系统完善后进行补充
        if (tUser == null) {
            systemLog.setUserId("-1");
            systemLog.setUsername("");
        } else {
            systemLog.setUsername(tUser.getLoginName());
            systemLog.setUserId(tUser.getUserId());
        }
        systemLog.setTime((int) time);
        systemLog.setCreateTime(new Date());
        systemLog.setType(logType);
        systemLog.setOperation(logValue);
        systemLogMapper.insert(systemLog);

    }

}
