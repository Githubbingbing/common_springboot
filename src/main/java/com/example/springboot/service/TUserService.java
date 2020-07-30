package com.example.springboot.service;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.futuredata.cloud.codegen.mapper.TUserMapper;
import com.futuredata.cloud.codegen.entity.TUser;
import com.futuredata.cloud.web.common.service.BaseService;


@Service
public class TUserService  extends BaseService<TUserMapper,TUser> {

}