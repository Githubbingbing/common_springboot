package com.example.springboot.service;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.futuredata.cloud.codegen.mapper.TDictionaryMapper;
import com.futuredata.cloud.codegen.entity.TDictionary;
import com.futuredata.cloud.web.common.service.BaseService;


@Service
public class TDictionaryService  extends BaseService<TDictionaryMapper,TDictionary> {

}