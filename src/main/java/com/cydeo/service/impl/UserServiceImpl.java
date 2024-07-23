package com.cydeo.service.impl;


import com.cydeo.converter.UserDtoConverter;
import com.cydeo.dto.UserDto;
import com.cydeo.entity.User;
import com.cydeo.repository.UserRepository;
import com.cydeo.service.UserService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;
    private final MapperUtil mapperUtil;

    public UserServiceImpl(UserRepository userRepository, UserDtoConverter userDtoConverter, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public UserDto findByUsername(String username) {
        return null;
    }

    @Override
    public List<UserDto> listAllUsers() {

        List<User> userList = userRepository.findAll();

        return userList.stream()
                .map(user -> mapperUtil.convert(user,new UserDto()))
                .collect(Collectors.toList());
    }
}
