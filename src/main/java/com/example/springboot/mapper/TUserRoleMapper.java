package com.example.springboot.mapper;

import com.futuredata.cloud.codegen.entity.TUserRole;
import tk.mybatis.mapper.common.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 用户角色表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface TUserRoleMapper extends Mapper<TUserRole> {
	
}
