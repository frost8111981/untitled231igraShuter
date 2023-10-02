package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        while (true) {
            System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n", player.getSlotsCount());
            int slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over!");
                break;
            }
            player.shotWithWeapon(slot);
        }
    }
}
