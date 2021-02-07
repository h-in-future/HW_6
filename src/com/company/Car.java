package com.company;

import com.company.interfaces.Costable;


public class Car extends Vehicle implements Costable{
    private int doorsCount;
    public Car(int wheelCount,int doorsCount){
       this.wheelCount=wheelCount;this.doorsCount=doorsCount;
    }
    @Override
    public int getCost(){return 40000;}
    @Override
    protected void printInfo(){
        int cost;
    System.out.println("Транспортное средство: Машина: количество дверей = "+this.doorsCount+"; количество колёс = "+this.wheelCount+
            ". Стоит "+this.getCost()+" рублей");
    }



}
