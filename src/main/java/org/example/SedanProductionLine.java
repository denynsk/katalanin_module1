package org.example;

public class SedanProductionLine implements ProductionLine{
    public Car work() {
        return new Car("Седан");
//        System.out.println("Седан выпущен");
    }
}
