package com.Resturants.Resturant.Services;

import com.Resturants.Resturant.Dto.ResturantDto;
import com.Resturants.Resturant.Entity.ResturantDemo;
import com.Resturants.Resturant.Repository.ResturantRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ResturantService implements DemoService {
    @Autowired
    private ResturantRepo rep;

    @Override
    public ResturantDto saveResturantDemo(ResturantDto A) {
        ResturantDemo s1=new ResturantDemo(
            A.getrId(),
            A.getrName(),
            A.getrLoc(),
            A.getrItems(),
            A.getrOrders()
        );

        ResturantDemo s2=rep.save(s1);
        ResturantDto s=new ResturantDto(
                s2.getrId(),
                s2.getrName(),
                s2.getrLoc(),
                s2.getrItems(),
                s2.getrOrders()
        );
        return s;
    }

   @Override
    public ResturantDto getResturant(Integer rId) {
        ResturantDto Res=rep.findByrId(rId)
                .orElseThrow(()->new RuntimeException("The resturent is not print:"+rId));
        ResturantDto s3=new ResturantDto(
               Res.getrId(),
                Res.getrName(),
                Res.getrLoc(),
                Res.getrItems(),
                Res.getrOrders()
        );
        return s3;
    }

    @Override
    public ResturantDto updateResturant(Integer rId, ResturantDto resturantDto) {
        ResturantDemo restaurantDemo = rep.findById(rId)
                .orElseThrow(() -> new RuntimeException("The restaurant is not present: " + rId));

        restaurantDemo.setrName(resturantDto.getrName());
        restaurantDemo.setrName(resturantDto.getrName());
        restaurantDemo.setrItems(resturantDto.getrItems());
        restaurantDemo.setrLoc(resturantDto.getrLoc());
        restaurantDemo.setrOrders(resturantDto.getrOrders());

        ResturantDemo updateResturant=rep.save(restaurantDemo);
        return new ResturantDto(
                updateResturant.getrId(),
                updateResturant.getrName(),
                updateResturant.getrLoc(),
                updateResturant.getrItems(),
                updateResturant.getrOrders()
        );
    }

    @Override
    public ResturantDemo deleteResturant(Integer rId) {
        ResturantDemo resturantDemo=rep.findById(rId)
                .orElseThrow(()->new RuntimeException("The Resturant is not present :"+rId));
        rep.deleteById(rId);
        return resturantDemo;
    }


}
