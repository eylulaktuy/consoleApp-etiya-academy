package org.example.core;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Console: " + data);
    }
}
