package org.example.core;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println(data+ " is logged into the database server.");
    }


}
