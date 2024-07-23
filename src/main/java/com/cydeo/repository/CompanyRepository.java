package com.cydeo.repository;

import com.cydeo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    Company findCompaniesById(Long id);
    @Query("SELECT c FROM Company c where c.id!= :excludeId ORDER BY case when c.companyStatus='Active' then 1 else 2 end , c.title desc ")
    List<Company>findAllExcludingCompanyWithIdAndSorted(@Param("excludeId")Long excludeId);


}
