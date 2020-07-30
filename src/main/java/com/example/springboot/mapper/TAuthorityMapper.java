package com.example.springboot.mapper;

import com.futuredata.cloud.codegen.entity.TAuthority;
import tk.mybatis.mapper.common.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 权限表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface TAuthorityMapper extends Mapper<TAuthority> {
	
}
