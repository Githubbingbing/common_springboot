package com.example.springboot.service;

import com.example.springboot.base.service.BaseService;
import com.example.springboot.mapper.LoginLogMapper;
import com.example.springboot.model.TLoginLog;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service
public class LoginLogService extends BaseService<LoginLogMapper, TLoginLog> {

}