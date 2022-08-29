package org.example;

public class PickupProductionLine implements ProductionLine{
    public Car work() {
        return new Car("Пикап");
    }
}
