package org.example;
import org.example.business.CourseProductManager;
import org.example.core.Logger;
import org.example.core.DatabaseLogger;
import org.example.core.ConsoleLogger;
import org.example.dataAccess.CourseDatabaseDal;
import org.example.dataAccess.InMemoryDal;
import org.example.entities.CourseProduct;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {


        Logger[] loggers={};

        CourseProductManager courseProductManager= new CourseProductManager(new InMemoryDal(),loggers);

        CourseProduct course=new CourseProduct(4,"Go course","Lecturer2");


        System.out.println("List of courses:");
        courseProductManager.list(course);
        System.out.println("There will be an adding course:");
        courseProductManager.add(course);
        //courseProductManager.delete(course);
        System.out.println("New list of courses:");
        courseProductManager.list(course);











    }
}