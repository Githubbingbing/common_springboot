package com.example.springboot.service;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.futuredata.cloud.codegen.mapper.TCityMapper;
import com.futuredata.cloud.codegen.entity.TCity;
import com.futuredata.cloud.web.common.service.BaseService;


@Service
public class TCityService  extends BaseService<TCityMapper,TCity> {

}