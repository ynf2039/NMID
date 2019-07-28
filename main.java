package com.company;


import sun.plugin.net.cookie.Netscape4CookieHandler;
import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException
    {
    //展示车辆信息
     c_1 car = new c_1(1,"小轿车",4 , 40);
     c_1 Van = new c_1(2,"面包车",7 ,65);
     c_1 Bus = new c_1(3,"大巴车",20 ,180);
     c_2 Low_Car = new c_2(4,"低栏车",1.5,30);
     c_2 Middle_Car = new c_2(5,"高栏车",2.5,47);
     c_2 High_Car = new c_2(6,"厢式车",4.5,80);
     c_3 Japanese_Pickup_Truck = new c_3(7,"日式皮卡车",5,1,60);
     c_3 America_Pickup_Truck = new c_3(8,"美式皮卡车",2,3,60);
     System.out.println("欢迎使用租车系统");
     System.out.println("以下是车辆信息");
     System.out.println("序号\t\t汽车名称\t载客量\t载货量\t租金\t");
     System.out.println("---------------------------------");
     System.out.println(car.toString());
        System.out.println(Van.toString());
        System.out.println(Bus.toString());
        System.out.println(Low_Car.toString());
        System.out.println(Middle_Car.toString());
        System.out.println(High_Car.toString());
        System.out.println(Japanese_Pickup_Truck.toString());
        System.out.println(America_Pickup_Truck.toString());
        System.out.println("请输入要租赁的车辆种类数量");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入租车种类");
            int i = sc.nextInt();
            if (i >= 1 && i <= 8) {
                int Lent_1 = 0;int Lent_2 = 0;;int Lent_3 = 0;int Lent_4 = 0;int Lent_5 = 0;int Lent_6 = 0;int Lent_7 = 0;int Lent_8 = 0;
                double burden_1 = 0;double burden_2 = 0;double burden_3 = 0;double burden_4 = 0;double burden_5 = 0;double burden_6 = 0;double burden_7 = 0;double burden_8 = 0;
                int patronage_1 = 0;int patronage_2 = 0;;int patronage_3 = 0;int patronage_4 = 0;int patronage_5 = 0;int patronage_6 = 0;int patronage_7 = 0;int patronage_8 = 0;
            for(int a = 0; a<i; a++) {
                System.out.println("请输入车辆序号");
                int k = sc.nextInt();
                if(k>=1 && k<=8){
                    switch (k) {
                    case 1:
                        System.out.println("请输入租车数目");
                        int Num_1 = sc.nextInt();
                        if(Num_1>=0){
                            System.out.println("请输入租车天数");
                            int Day_1 = sc.nextInt();
                            if(Day_1>=0){
                            patronage_1 = 4 * Num_1;
                            Lent_1 = 40 * Num_1 * Day_1;}else
                            {
                                System.out.println("输入错误");
                            }
                            }
                        else {
                            System.out.println("输入错误");
                            }
                        break;
                    case 2:
                        System.out.println("请输入租车数目");
                        int Num_2 = sc.nextInt();
                        if(Num_2>=0){
                            System.out.println("请输入租车天数");
                            int Day_2 = sc.nextInt();
                            if(Day_2>=0){
                            patronage_2 = 7 * Num_2;
                            Lent_2 = 65 * Num_2 * Day_2;}
                            else {
                                System.out.println("输入错误");
                            }
                        }else{
                            System.out.println("输入错误");

                        }
                        break;
                    case 3:
                        System.out.println("请输入租车数目");
                        int Num_3 = sc.nextInt();
                        if(Num_3>=0){
                            System.out.println("请输入租车天数");
                            int Day_3 = sc.nextInt();
                            if(Day_3>=0){
                            patronage_3 = 20 * Num_3;
                            Lent_3 = 180 * Num_3 * Day_3;}
                        else {
                                System.out.println("输入错误");
                            }
                        }else{
                            System.out.println("输入错误");

                        }
                        break;
                    case 4:
                        System.out.println("请输入租车数目");
                        int Num_4 = sc.nextInt();
                        if(Num_4>=0){
                            System.out.println("请输入租车天数");
                            int Day_4 = sc.nextInt();
                            if(Day_4>=0){
                            burden_4 = 1.5 * Num_4;
                            Lent_4 = 30 * Num_4 * Day_4;}else {
                                System.out.println("输入错误");
                            }
                        }else{
                            System.out.println("输入错误");

                        }break;
                    case 5:
                        System.out.println("请输入租车数目");
                        int Num_5 = sc.nextInt();
                        if(Num_5>=0){
                            System.out.println("请输入租车天数");
                            int Day_5 = sc.nextInt();
                            if(Day_5>=0){
                            burden_5 = 2.5 * Num_5;
                            Lent_5 = 47 * Num_5 * Day_5;}else {
                                System.out.println("输入错误");
                            }
                        }else{
                            System.out.println("输入错误");
                        }break;
                    case 6:
                        System.out.println("请输入租车数目");
                        int Num_6 = sc.nextInt();
                        if (Num_6>=0){
                            System.out.println("请输入租车天数");
                            int Day_6 = sc.nextInt();
                            if(Day_6>=0){
                            burden_6 = 4.5 * Num_6;
                            Lent_6 = 80 * Num_6 * Day_6;}else {
                                System.out.println("输入错误");
                            }
                        }else{
                            System.out.println("输入错误");
                        }break;
                    case 7:
                        System.out.println("请输入租车数目");
                        int Num_7 = sc.nextInt();
                        if(Num_7>=0){
                            System.out.println("请输入租车天数");
                            int Day_7 = sc.nextInt();
                            if(Day_7>=0){
                            patronage_7 = 5 * Num_7;
                            burden_7 = 1.0 * Num_7;
                            Lent_7 = 60 * Num_7 * Day_7;}else {
                                System.out.println("输入错误");
                            }
                        }else{
                            System.out.println("输入错误");
                        }break;
                    case 8:
                        System.out.println("请输入租车数目");
                        int Num_8 = sc.nextInt();
                        if(Num_8>=0){
                            System.out.println("请输入租车天数");
                            int Day_8 = sc.nextInt();
                            if(Day_8>=0){
                            patronage_8 = 2 * Num_8;
                            burden_8 = 3.0 * Num_8;
                            Lent_8 = 60 * Num_8 * Day_8;}else {
                                System.out.println("输入错误");
                            }
                            }else{
                            System.out.println("输入错误");
                        }break;

                }

                }else {
                    System.out.println("输入有误，请重新输入");
                }

                }
        int All_Money = Lent_1+Lent_2+Lent_3+Lent_4+Lent_5+Lent_6+Lent_7+Lent_8;
            double All_Burden = burden_1+burden_2+burden_3+burden_4+burden_5+burden_6+burden_7+burden_8;
            int ALL_patronage = patronage_1+patronage_2+patronage_3+patronage_4+patronage_5+patronage_6+patronage_7+patronage_8;
                System.out.println("总租金为"+All_Money+"  "+"总载客量为"+ALL_patronage+"  "+"总载重为"+All_Burden);
                System.out.println("按下回车键退出程序");
                if(System.in.read() =='\n'){
                    System.exit(0);}
            }else
                {
                    System.out.println("输入有误，请重新输入");
                }
                }




    }
}
