package com.example.springboot.service;

import com.example.springboot.base.service.BaseService;
import com.example.springboot.mapper.DictionaryMapper;
import com.example.springboot.model.TDictionary;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service
public class DictionaryService extends BaseService<DictionaryMapper, TDictionary> {

}