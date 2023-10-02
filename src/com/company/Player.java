package com.company;

public class Player {    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;  // = new Weapon[] {new BigGun(), new WaterPistol()};

    public Player() {
        weaponSlots = new Weapon[]{new BigGun("Машинган"), new WaterPistol()}; // Заполняем индексы оружием
    }

    public int getSlotsCount() { // Метод для получения кол-ва слотов
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot >= weaponSlots.length) {  // Вводимое с консоли число проверяем на то чтобы не вышло за границы индекса массива
            throw new IllegalArgumentException("Неверный номер слота"); // если выходит, то выбрасываем исключение
        }
        Weapon weapon = weaponSlots[slot]; // Вводимое число с консоли равно индексу(оружия в массиве) и назначаем это оружие переменной weapon к примеру BigGun
        System.out.println("Выбран - " + weapon);
        weapon.shot(); // weapon(BigGun) использует метод shot класса BigGun
        System.out.println();
    }
}
