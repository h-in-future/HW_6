package com.company;

import com.company.interfaces.Costable;

public abstract class Vehicle {
    protected int wheelCount;
    protected void wheelCount(int wheelCount){
        this.wheelCount=wheelCount;
    }
    abstract protected void printInfo();
}
