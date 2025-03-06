package com.Laptop.Laptops.Services;

import com.Laptop.Laptops.Dto.LaptopDto;
import com.Laptop.Laptops.Entity.LaptopEntity;
import com.Laptop.Laptops.Repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService implements LaptopServices {
      @Autowired
      private LaptopRepo laptopRepo;

    @Override
    public LaptopDto saveLaptop(LaptopDto laptopDto) {
        LaptopEntity laptopEntity=new LaptopEntity(
                laptopDto.getVid(),
                laptopDto.getName(),
                laptopDto.getModel(),
                laptopDto.getStorage(),
                laptopDto.getPixels()
        );
        LaptopEntity laptopEntity1=laptopRepo.save(laptopEntity);
        LaptopDto laptopDto1=new LaptopDto(
                laptopEntity1.getVid(),
                laptopEntity1.getName(),
                laptopEntity1.getModel(),
                laptopEntity1.getStorage(),
                laptopEntity1.getPixels()

        );
        return laptopDto1;
    }

    @Override
    public LaptopDto getLaptop(Long id) {
        LaptopEntity laptopEntity=laptopRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The Laptop id is not found :"+id));
        LaptopDto laptopDto=new LaptopDto(
                laptopEntity.getVid(),
                laptopEntity.getName(),
                laptopEntity.getModel(),
                laptopEntity.getStorage(),
                laptopEntity.getPixels()
        );
        return laptopDto;

    }

    @Override
    public LaptopDto updateLaptop(Long id, LaptopDto laptopDto) {
        LaptopEntity laptopEntity=laptopRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The laptop id is not found:"+id));
        laptopEntity.setName(laptopDto.getName());
        laptopEntity.setModel(laptopDto.getModel());
        laptopEntity.setStorage(laptopDto.getStorage());
        laptopEntity.setPixels(laptopDto.getPixels());
        LaptopEntity laptopEntity1=laptopRepo.save(laptopEntity);
        return new LaptopDto(
              laptopEntity1.getVid(),
              laptopEntity1.getName(),
              laptopEntity1.getModel(),
              laptopEntity1.getStorage(),
              laptopEntity1.getPixels()
        );
    }

    @Override
    public LaptopEntity deleteLaptop(Long id) {
        LaptopEntity laptopEntity=laptopRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The laptop id is not found :"+id));
        laptopRepo.deleteById(id);
        return laptopEntity;
    }
}
