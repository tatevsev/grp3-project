package com.cydeo.util;

import com.cydeo.dto.RoleDto;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    private final ModelMapper modelMapper;

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Role convertToEntity(RoleDto dto){
        return modelMapper.map(dto, Role.class);
    }

    public RoleDto convertToDto(Role entity){
        return modelMapper.map(entity, RoleDto.class);
    }


}
