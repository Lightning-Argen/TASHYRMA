package com.company;

public class Dog {
    private String Name;
    private String Paroda;
    private int Age;
    private String Color;
    private String Growth;


     public Dog (int age,String name,String paroda,String color,String growth) {
         this.Age = age;
         this.Name = name;
         this.Paroda = paroda;
         this.Color = color;
         this.Growth = growth;
     }

    void setName(String DogName) {
        this.Name = DogName;
    }

    void setParoda(String DogParoda) {
        this.Paroda = DogParoda;
    }

    void setAge(int DogAge) {
        this.Age = DogAge;
    }

    void setColor(String DogColor) {
        this.Color = DogColor;
    }

    void setGrowth(String DogGrowth) {
        this.Growth = DogGrowth;
    }

    String getName() {
        return Name;
    }

    String getParoda() {
        return Paroda;
    }

    int getAge() {
        return Age;
    }

    String getColor() {
        return Color;
    }

    String getGrowth() {
        return Growth;
    }

    void DogCan() {
        System.out.println("Хорошо поддаются дрессировк");
        System.out.println("Отлично ладит с детьми и животными");
        System.out.println("Охотиться");
    }
}
