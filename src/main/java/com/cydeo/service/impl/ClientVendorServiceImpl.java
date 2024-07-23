package com.cydeo.service.impl;

import com.cydeo.dto.ClientVendorDto;
import com.cydeo.entity.ClientVendor;
import com.cydeo.repository.ClientVendorRepository;
import com.cydeo.service.ClientVendorService;
import com.cydeo.util.ClientVendorMapper;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientVendorServiceImpl implements ClientVendorService {

    private final ClientVendorRepository clientVendorRepository;
    private final MapperUtil mapperUtil;
    private final ClientVendorMapper clientVendorMapper;

    public ClientVendorServiceImpl(ClientVendorRepository clientVendorRepository, MapperUtil mapperUtil, ClientVendorMapper clientVendorMapper) {
        this.clientVendorRepository = clientVendorRepository;
        this.mapperUtil = mapperUtil;
        this.clientVendorMapper = clientVendorMapper;
    }

    @Override
    public List<ClientVendorDto> listAllClientVendors() {

        List<ClientVendor> clientVendorList=clientVendorRepository.findAll();
        return clientVendorList.stream().map(clientVendor -> mapperUtil.convert(clientVendor,new ClientVendorDto())).collect(Collectors.toList());
    }

    @Override
    public ClientVendorDto findByClientVendorName(String name) {
        return clientVendorMapper.convertToDto(clientVendorRepository.findByClientVendorName(name));
    }
}
