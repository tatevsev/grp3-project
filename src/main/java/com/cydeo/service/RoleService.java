package com.cydeo.service;


import com.cydeo.dto.RoleDto;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {


    RoleDto findById(Long id);

}
