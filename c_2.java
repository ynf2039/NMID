package com.company;

/**
 * 第二类车类
 */
public class c_2 extends Car {
    public c_2(int Serial_Number,String name,double burden,int price){
        this.Serial_Number = Serial_Number;
        this.name = name;
        this.burden = burden;
        this.price = price;
    }
    public String toString(){
        return new String(Serial_Number+"   "+name +'\t'+ "*" +'\t'+"人" +'\t'+ burden +'\t'+ "吨"+'\t'+ price + '\t'+"元/天");
    }
}
