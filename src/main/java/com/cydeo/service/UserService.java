package com.cydeo.service;


import com.cydeo.dto.UserDto;
import com.cydeo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDto findByUsername(String username);

    List<UserDto> listAllUsers();
}
