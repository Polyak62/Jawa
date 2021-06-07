package ru.sbt.appgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game table = new Game();
        Scanner scanner = new Scanner(System.in);

        table.creatTable();
        System.out.println("Выберите стартовые ячейки");

        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        table.fillTable(arr);

        for (int i = 0; i < 10; i++) {
            table.game();
        }

    }
}
