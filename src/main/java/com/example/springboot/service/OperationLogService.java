package com.example.springboot.service;

import com.example.springboot.base.service.BaseService;
import com.example.springboot.mapper.OperationLogMapper;
import com.example.springboot.model.TOperationLog;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class OperationLogService extends BaseService<OperationLogMapper, TOperationLog> {

}