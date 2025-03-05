package com.Companies.Company.Repository;

import com.Companies.Company.Dto.CompanyDto;
import com.Companies.Company.Entity.DemoCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepo extends JpaRepository<DemoCompany,Integer> {
    Optional<DemoCompany> findBycId(Integer cId);

}
