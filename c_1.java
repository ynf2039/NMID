package com.company;

/**
 * 第一类车类
 */
public class c_1 extends Car {
    public c_1(int Serial_Number,String name,int patronage,int price){
        this.Serial_Number = Serial_Number;
        this.name = name;
        this.patronage = patronage;
        this.price = price;

    }
    public String toString(){
        return new String(Serial_Number+"   "+name +'\t'+ patronage +'\t'+"人" +'\t'+ "*" +'\t'+ "吨"+'\t'+ price + '\t'+"元/天");
    }
}
