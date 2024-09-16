package org.example.dataAccess;

import org.example.entities.CourseProduct;

import java.util.ArrayList;

public class InMemoryDal implements IEntityRepository<CourseProduct>{

    private ArrayList<CourseProduct> courseProducts;


    public InMemoryDal() {
        this.courseProducts = new ArrayList<>();

        CourseProduct courseProducts1 =new CourseProduct(1, "Java Course", "Lecturer1");
        this.courseProducts.add(courseProducts1);
        courseProducts.add(new CourseProduct(2,".NET Course","Lecturer2"));
        courseProducts.add(new CourseProduct(3,"C# Course","Lecturer1"));


    }



    @Override
    public void add(CourseProduct entity) {
        courseProducts.add(entity);
    }

    @Override
    public void list(CourseProduct entity) {
        for(CourseProduct courseProduct: courseProducts){
            System.out.println(courseProduct.getName());
        }
    }

    @Override
    public void delete(CourseProduct entity) {
        courseProducts.remove(entity);
    }
}
