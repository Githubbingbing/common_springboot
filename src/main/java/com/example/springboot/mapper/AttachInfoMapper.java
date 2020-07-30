package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.model.TAttachInfo;
import org.springframework.stereotype.Repository;
/**
 * 附件信息表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Repository
public interface AttachInfoMapper extends BaseMapper<TAttachInfo> {
	
}
