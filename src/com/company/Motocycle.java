package com.company;

public class Motocycle extends Vehicle{
    private int maxSpeed;
    public Motocycle(int wheelCount, int maxSpeed){
        this.wheelCount=wheelCount;this.maxSpeed=maxSpeed;
    }
    @Override
    protected void printInfo(){
        System.out.println("Транспортное средство: Мотоцикл: количество колёс = "+this.wheelCount+"; максимальная скорость = "+this.maxSpeed);
    }
}
