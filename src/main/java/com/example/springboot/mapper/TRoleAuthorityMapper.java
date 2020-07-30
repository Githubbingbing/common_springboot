package com.example.springboot.mapper;

import com.futuredata.cloud.codegen.entity.TRoleAuthority;
import tk.mybatis.mapper.common.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 角色权限关联表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface TRoleAuthorityMapper extends Mapper<TRoleAuthority> {
	
}
