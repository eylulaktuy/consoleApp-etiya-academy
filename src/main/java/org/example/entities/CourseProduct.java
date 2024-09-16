package org.example.entities;


import org.example.dataAccess.IEntity;

public class CourseProduct implements IEntity {
    private int id;
    private String name;
    private String lecturer;


    public CourseProduct() {
    }

    public CourseProduct(int id, String name, String lecturer) {
        this.id = id;
        this.name = name;
        this.lecturer = lecturer;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }


}
