package com.Companies.Company.Controller;

import com.Companies.Company.Dto.CompanyDto;
import com.Companies.Company.Entity.DemoCompany;
import com.Companies.Company.Service.CompanyService;
import com.Companies.Company.Service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company") // ✅ Base URL for the controller
public class DemoController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/saveCompany") // ✅ Endpoint for saving company
    public ResponseEntity<CompanyDto> saveCompany(@RequestBody CompanyDto companyDto) {
        CompanyDto savedCompany = companyService.saveCompany(companyDto);
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
    @GetMapping("/{cId}")
    public ResponseEntity<CompanyDto> getStudent(@PathVariable Integer cId){
        CompanyDto companyDto= companyService.getCompanyBycId(cId);
        return new ResponseEntity<>(companyDto, HttpStatus.OK);
    }
    @PutMapping("/{cId}")
    public ResponseEntity<CompanyDto> updateCompany(
            @PathVariable Integer cId,
            @RequestBody CompanyDto companyDto){
        CompanyDto updatedCompany= companyService.updateCompany(cId,companyDto);
        return  new ResponseEntity<>(updatedCompany,HttpStatus.OK);
    }
    @DeleteMapping("/{cId}")
    public ResponseEntity<DemoCompany>deleteCompany(@PathVariable Integer cId){
        DemoCompany demoCompany=companyService.deleteCompany(cId);
        return new ResponseEntity<>(demoCompany,HttpStatus.OK);
    }

}






