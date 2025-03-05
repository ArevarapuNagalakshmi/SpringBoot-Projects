package com.Companies.Company.Service;

import com.Companies.Company.Dto.CompanyDto;
import com.Companies.Company.Entity.DemoCompany;

public interface CompanyService {
    CompanyDto saveCompany(CompanyDto companyDto);

    CompanyDto getCompanyBycId(Integer cId);

    CompanyDto updateCompany(Integer cId, CompanyDto companyDto);
    DemoCompany deleteCompany(Integer cId);

}
