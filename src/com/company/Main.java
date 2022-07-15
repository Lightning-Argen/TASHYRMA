package com.company;

public class Main {
    public static void main(String[] args) {
        fish fish = new fish("Анабас", "в озерах, илистых прудах, канавах, на рисовых полях, а также в солоноватых водоемах.","Анабас живет в неволе не более 5 лет");
        System.out.println(fish.getName());
        System.out.println(fish.getHabitat());
        System.out.println(fish.getHowlonglive());
        System.out.println();
        fish.FishCan();

        Cat cat = new Cat(2,"Murka","Магическая","Рыжий");
        System.out.println(cat.getName());
        System.out.println(cat.getParoda());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println();
        cat.canCat();



        Dog dog = new Dog(10,"Рекс","Лабрадор ретривер","желтый (считается от кремово-белого до лисьего)","56-57 сантиметров");
        System.out.println(dog.getName());
        System.out.println(dog.getParoda());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());
        System.out.println(dog.getGrowth());
        System.out.println();
        dog.DogCan();
    }
}