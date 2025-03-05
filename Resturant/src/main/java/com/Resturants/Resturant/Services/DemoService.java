package com.Resturants.Resturant.Services;

import com.Resturants.Resturant.Dto.ResturantDto;
import com.Resturants.Resturant.Entity.ResturantDemo;

public interface DemoService {
    ResturantDto saveResturantDemo(ResturantDto resturantDto);
    ResturantDto getResturant(Integer rId);
    ResturantDto updateResturant(Integer rId,ResturantDto resturantDto);
    ResturantDemo deleteResturant(Integer rId);

}
