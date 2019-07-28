package com.company;

/**
 * 第三类车类
 */
public class c_3 extends Car{
    public c_3(int Serial_Number,String name ,int patronage,double burden, int price){
        this.Serial_Number =Serial_Number;
        this.name = name;
        this.patronage = patronage;
        this.burden = burden;
        this.price = price;
    }
    public String toString(){
        return new String(Serial_Number+"   "+name +'\t'+ patronage +'\t'+"人" +'\t'+ burden +'\t'+ "吨"+'\t'+ price + '\t'+"元/天");
    }
}
