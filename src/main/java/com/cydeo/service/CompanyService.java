package com.cydeo.service;

import com.cydeo.dto.CompanyDto;

import java.util.List;

public interface CompanyService {

    List<CompanyDto> listAllCompanies();

    List<CompanyDto>findAllExcludingCompanyWithIdAndSorted(Long id);

    CompanyDto findById(Long id);

    void create(CompanyDto dto);

    void update(CompanyDto dto);


}
