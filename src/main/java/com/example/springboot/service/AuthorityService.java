package com.example.springboot.service;

import com.example.springboot.base.service.BaseService;
import com.example.springboot.mapper.AuthorityMapper;
import com.example.springboot.model.TAuthority;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service
public class AuthorityService extends BaseService<AuthorityMapper, TAuthority> {

}