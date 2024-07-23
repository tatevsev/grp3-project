package com.cydeo.service.impl;

import com.cydeo.dto.CompanyDto;
import com.cydeo.entity.Company;
import com.cydeo.enums.CompanyStatus;
import com.cydeo.repository.CompanyRepository;
import com.cydeo.service.CompanyService;
import com.cydeo.util.CompanyMapper;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final MapperUtil mapperUtil;
    private final CompanyMapper companyMapper;

    public CompanyServiceImpl(CompanyRepository companyRepository, MapperUtil mapperUtil, CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.mapperUtil = mapperUtil;
        this.companyMapper = companyMapper;
    }


    @Override
    public List<CompanyDto> listAllCompanies() {

        List<Company> companyList = companyRepository.findAll();
        return companyList.stream().map(company -> mapperUtil.convert(company, new CompanyDto())).collect(Collectors.toList());
    }

    @Override
    public CompanyDto findById(Long id) {
        return companyMapper.convertToDto(companyRepository.findById(id).get());
    }

    @Override
    public void create(CompanyDto dto) {

        dto.setCompanyStatus(CompanyStatus.PASSIVE);
        Company company = companyMapper.convertToEntity(dto);
        companyRepository.save(company);

    }

    @Override
    public void update(CompanyDto dto) {

        Company company = companyRepository.findCompaniesById(dto.getId());

        Company convertedCompany = companyMapper.convertToEntity(dto);

        convertedCompany.setId(company.getId());

        convertedCompany.setCompanyStatus(CompanyStatus.ACTIVE);

        companyRepository.save(convertedCompany);

    }
}
