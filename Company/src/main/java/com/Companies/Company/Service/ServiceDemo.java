package com.Companies.Company.Service;

import com.Companies.Company.Dto.CompanyDto;
import com.Companies.Company.Entity.DemoCompany;
import com.Companies.Company.Repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public  class ServiceDemo implements CompanyService {
    @Autowired
    private  CompanyRepo repo;


    @Override
    public CompanyDto saveCompany(CompanyDto companyDto) {
        DemoCompany s1 = new DemoCompany(
                companyDto.getcId(),
                companyDto.getcName(),
                companyDto.getcRole()

        );
        DemoCompany A = repo.save(s1);
        CompanyDto s2 = new CompanyDto(
                A.getcId(),
                A.getcName(),
                A.getcRole()
        );
        return s2;
    }
    @Override
    public CompanyDto getCompanyBycId(Integer cId) {
        DemoCompany company = repo.findBycId(cId)
                .orElseThrow(() -> new RuntimeException("Company not found with ID: " + cId));

        return new CompanyDto(
                company.getcId(),
                company.getcName(),
                company.getcRole());
    }

  @Override
    public CompanyDto updateCompany(Integer cId, CompanyDto companyDto) {
        DemoCompany eCompany = repo.findBycId(cId)
                .orElseThrow(() -> new RuntimeException("The ID is not present: " + cId));
        eCompany.setcName(companyDto.getcName());
        eCompany.setcRole(companyDto.getcRole());

        DemoCompany updateCompany=repo.save(eCompany);
        return new CompanyDto(
                updateCompany.getcId(),
                updateCompany.getcName(),
                updateCompany.getcRole()
        );
    }

    @Override
    public DemoCompany deleteCompany(Integer cId) {
        DemoCompany demoCompany=repo.findBycId(cId)
                .orElseThrow(()->new RuntimeException("The Id is not present:"+cId));
        repo.deleteById(cId);
        return demoCompany;
    }


}

