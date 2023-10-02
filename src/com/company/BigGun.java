package com.company;

public class BigGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Бах-Бах");
    }

    String name;

    public BigGun(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}