package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.model.TLoginLog;
import org.springframework.stereotype.Repository;
/**
 * 登录日志表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface LoginLogMapper extends BaseMapper<TLoginLog> {
	
}
