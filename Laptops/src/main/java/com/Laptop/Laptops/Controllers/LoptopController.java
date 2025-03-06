package com.Laptop.Laptops.Controllers;

import com.Laptop.Laptops.Dto.LaptopDto;
import com.Laptop.Laptops.Entity.LaptopEntity;
import com.Laptop.Laptops.Services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptops")
public class LoptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping("/savelaptop")
    public ResponseEntity<LaptopDto>saveLaptop(@RequestBody LaptopDto laptopDto){
    LaptopDto laptopDto1=laptopService.saveLaptop(laptopDto);
        return new ResponseEntity<>(laptopDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<LaptopDto>getLaptop(@PathVariable Long id){
      LaptopDto laptopDto=laptopService.getLaptop(id);
        return new ResponseEntity<>(laptopDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<LaptopDto>updateLaptop(
            @PathVariable Long id,
            @RequestBody LaptopDto laptopDto) {
        LaptopDto laptopDto1=laptopService.updateLaptop(id,laptopDto);
        return new ResponseEntity<>(laptopDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<LaptopEntity>deleteLaptop(@PathVariable Long id){
        LaptopEntity laptopEntity=laptopService.deleteLaptop(id);
        return new ResponseEntity<>(laptopEntity,HttpStatus.OK);
    }
}
