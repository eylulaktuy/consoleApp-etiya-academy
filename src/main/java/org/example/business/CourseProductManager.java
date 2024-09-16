package org.example.business;

import org.example.core.Logger;
import org.example.dataAccess.IEntityRepository;
import org.example.dataAccess.InMemoryDal;
import org.example.entities.CourseProduct;

import java.util.ArrayList;

public class CourseProductManager {
    private IEntityRepository entityRepository;
    private Logger[] loggers;


    public CourseProductManager(InMemoryDal courseProductDal, Logger[] loggers){
        this.entityRepository=courseProductDal;
        this.loggers=loggers;
    }

    public void add(CourseProduct courseProduct){
        entityRepository.add(courseProduct);
        System.out.println(courseProduct.getName());
        for(Logger logger:loggers){
            logger.log(courseProduct.getName());
        }
    }
    public void list(CourseProduct courseProduct){
        entityRepository.list(courseProduct);
        for(Logger logger:loggers){
            logger.log(courseProduct.getName());
        }
    }
    public void delete(CourseProduct courseProduct){
        entityRepository.delete(courseProduct);
        System.out.println(courseProduct.getName());
        for(Logger logger:loggers){
            logger.log(courseProduct.getName());
        }
    }
}
