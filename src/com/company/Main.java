package com.company;

public class Main {

    public static void main(String[] args) {
    Car myCar=new Car(6,4);
    Car herCar= new Car(4,4);
    Motocycle hisMotocycle=new Motocycle(2,300);
    Motocycle theirMotocycle=new Motocycle(2,200);
    myCar.printInfo();
    herCar.printInfo();
    hisMotocycle.printInfo();
    theirMotocycle.printInfo();
    }
}
