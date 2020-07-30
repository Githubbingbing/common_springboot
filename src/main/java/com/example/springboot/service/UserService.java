package com.example.springboot.service;

import com.example.springboot.base.service.BaseService;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.TUser;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service
public class UserService extends BaseService<UserMapper, TUser> {

}