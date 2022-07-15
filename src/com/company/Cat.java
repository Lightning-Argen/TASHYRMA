package com.company;

public class Cat {
    private String name;
    private String paroda;
    private int age;
    private String color;

    public Cat (int age,String name,String paroda,String color){
        this.age = age;
        this.name = name;
        this.paroda = paroda;
        this.color = color;

    }


    void setName(String CatName) {
        this.name = CatName;
    }

    void setParoda(String CatParoda) {
        this.paroda = CatParoda;
    }

    void setAge(int CatAge) {
        this.age = CatAge;
    }

    void setColor(String CatColor) {
        this.color = CatColor;
    }

    String getName() {
        return name;
    }

    String getParoda() {
        return paroda;
    }

    int getAge() {
        return age;
    }

    String getColor() {
        return color;
    }

    void canCat() {
        System.out.println("Ловить мышей");
        System.out.println("Царапать и лежать целыми днями на одном месте ");
    }
}
