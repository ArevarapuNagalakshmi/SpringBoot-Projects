package com.Laptop.Laptops.Services;

import com.Laptop.Laptops.Dto.LaptopDto;
import com.Laptop.Laptops.Entity.LaptopEntity;

public interface LaptopServices {
    LaptopDto saveLaptop(LaptopDto laptopDto);
    LaptopDto getLaptop(Long id);
    LaptopDto updateLaptop(Long id,LaptopDto laptopDto);
    LaptopEntity deleteLaptop(Long id);
}
