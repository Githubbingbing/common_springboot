package com.example.springboot.service;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.futuredata.cloud.codegen.mapper.TLoginLogMapper;
import com.futuredata.cloud.codegen.entity.TLoginLog;
import com.futuredata.cloud.web.common.service.BaseService;


@Service
public class TLoginLogService  extends BaseService<TLoginLogMapper,TLoginLog> {

}