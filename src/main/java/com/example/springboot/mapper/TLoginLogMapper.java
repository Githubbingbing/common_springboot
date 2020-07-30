package com.example.springboot.mapper;

import com.futuredata.cloud.codegen.entity.TLoginLog;
import tk.mybatis.mapper.common.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 登录日志表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface TLoginLogMapper extends Mapper<TLoginLog> {
	
}
