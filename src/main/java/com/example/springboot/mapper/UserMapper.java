package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.model.TUser;
import org.springframework.stereotype.Repository;
/**
 * 用户表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface UserMapper extends BaseMapper<TUser> {
	
}
