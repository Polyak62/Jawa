package ru.sbt.appgame;

public class Game {
    final int SIZE = 20;
    String[][] arr = new String[SIZE][SIZE];

    public void showTable() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public void creatTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = "o";
            }
        }
        showTable();
    }

    public void fillTable(int... numb) {
        for (int i = 0; i < numb.length; i++) {
            int column = numb[i] % SIZE;
            int row = numb[i] / SIZE;
            arr[row][column] = "x";
        }
        showTable();
    }


    public void game() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j].equals("o")) {
                    int count = 0;
                    if (i != 0 && arr[i - 1][j].equals("x")) {
                        count++;
                    }
                    if (i != SIZE - 1 && arr[i + 1][j].equals("x")) {
                        count++;
                    }
                    if (j != 0 && arr[i][j - 1].equals("x")) {
                        count++;
                    }
                    if (j != SIZE - 1 && arr[i][j + 1].equals("x")) {
                        count++;
                    }
                    if (i != 0 && j != 0 && arr[i - 1][j - 1].equals("x")) {
                        count++;
                    }
                    if (i != SIZE - 1 && j != 0 && arr[i + 1][j - 1].equals("x")) {
                        count++;
                    }
                    if (j != SIZE - 1 && i != 0 && arr[i - 1][j + 1].equals("x")) {
                        count++;
                    }
                    if (j != SIZE - 1 && i != SIZE - 1 && arr[i + 1][j + 1].equals("x")) {
                        count++;
                    }
                    if (count == 3) {
                        arr[i][j] = "#";
                    }
                }
            }
        }
        // showTable();


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j].equals("x")) {
                    int count = 0;
                    if (i != 0 && (arr[i - 1][j].equals("x") || arr[i - 1][j].equals("!"))) {
                        count++;
                    }
                    if (i != SIZE - 1 && (arr[i + 1][j].equals("x") || arr[i + 1][j].equals("!"))) {
                        count++;
                    }
                    if (j != 0 && (arr[i][j - 1].equals("x") || arr[i][j - 1].equals("!"))) {
                        count++;
                    }
                    if (j != SIZE - 1 && (arr[i][j + 1].equals("x") || arr[i][j + 1].equals("!"))) {
                        count++;
                    }
                    if (i != 0 && j != 0 && (arr[i - 1][j - 1].equals("x") || arr[i - 1][j - 1].equals("!"))) {
                        count++;
                    }
                    if (i != SIZE - 1 && j != 0 && (arr[i + 1][j - 1].equals("x") || arr[i + 1][j - 1].equals("!"))) {
                        count++;
                    }
                    if (j != SIZE - 1 && i != 0 && (arr[i - 1][j + 1].equals("x") || arr[i - 1][j + 1].equals("!"))) {
                        count++;
                    }
                    if (j != SIZE - 1 && i != SIZE - 1 && (arr[i + 1][j + 1].equals("x") || arr[i + 1][j + 1].equals("!"))) {
                        count++;
                    }
                    if (count != 2 && count != 3) {
                        arr[i][j] = "!";
                    }
                }
            }
        }
        // showTable();


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j].equals("#")) {
                    arr[i][j] = ("x");
                }
            }
        }
        //showTable();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j].equals("!")) {
                    arr[i][j] = ("o");
                }
            }
        }
        showTable();
    }
}
