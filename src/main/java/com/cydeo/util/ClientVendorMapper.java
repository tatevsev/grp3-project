package com.cydeo.util;

import com.cydeo.dto.ClientVendorDto;
import com.cydeo.dto.CompanyDto;
import com.cydeo.entity.ClientVendor;
import com.cydeo.entity.Company;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ClientVendorMapper {

    private final ModelMapper modelMapper;

    public ClientVendorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ClientVendor convertToEntity(ClientVendorDto dto){
        return modelMapper.map(dto,ClientVendor.class);
    }

    public ClientVendorDto convertToDto(ClientVendor entity){
        return modelMapper.map(entity,ClientVendorDto.class);
    }
}
