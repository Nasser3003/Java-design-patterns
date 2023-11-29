package org.abdo;


import org.abdo.decorator.*;

public class Main {
    public static void main(String[] args) {

        Drink coffeeDrink = new CoffeeDrink();
        Drink coffeeSugar1 = new RealSugar(coffeeDrink);
        Drink coffeeSugar2 = new RealSugar(coffeeSugar1);
        Drink coffeeCowMilk = new RealMilk(coffeeSugar2);

        Drink teaDrink = new TeaDrink();
        Drink teaSugar1 = new RealSugar(teaDrink);
        Drink teaCowMilk = new RealMilk(teaSugar1);

        System.out.println(coffeeCowMilk.description());
        System.out.println(coffeeCowMilk.cost());

        System.out.println(teaCowMilk.description());
        System.out.println(teaCowMilk.cost());

    }
}