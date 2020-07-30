package com.example.springboot.service;

import com.example.springboot.base.service.BaseService;
import com.example.springboot.mapper.CityMapper;
import com.example.springboot.model.TCity;
import org.springframework.stereotype.Service;


@Service
public class CityService extends BaseService<CityMapper, TCity> {

}