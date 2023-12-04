//package org.abdo;
//
//
//import org.abdo.decorator.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Beverage coffeeDrink = new CoffeeBeverage();
//        Beverage coffeeSugar1 = new RealSugar(coffeeDrink);
//        Beverage coffeeSugar2 = new RealSugar(coffeeSugar1);
//        Beverage coffeeCowMilk = new RealMilk(coffeeSugar2);
//
//        Beverage teaDrink = new TeaBeverage();
//        Beverage teaSugar1 = new RealSugar(teaDrink);
//        Beverage teaCowMilk = new RealMilk(teaSugar1);
//
//        System.out.println(coffeeCowMilk.description());
//        System.out.println(coffeeCowMilk.cost());
//
//        System.out.println(teaCowMilk.description());
//        System.out.println(teaCowMilk.cost());
//
//    }
//}