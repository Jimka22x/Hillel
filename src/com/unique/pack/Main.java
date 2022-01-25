package com.unique.pack;

public class Main {

    public static void main(String[] args) {
        digitalClockMirroring();
    }

    private static void digitalClockMirroring() {
//        1) Электронные часы показывают время в формате от 00:00 до 23:59.
//        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
//        для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
        System.out.println("Task 1. (digitalClockMirroring)");
        int count = 0;
        String zeroHours = "";
        String zeroMinutes = "";
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 24; j++) {
                if (i % 10 == j / 10 && i / 10 == j % 10) {
                    if (i / 10 == 0) {
                        zeroMinutes = "0";
                    } else {
                        zeroMinutes = "";
                    }
                    if (j / 10 == 0) {
                        zeroHours = "0";
                    } else {
                        zeroHours = "";
                    }
                    System.out.println(zeroHours + j + ":" + zeroMinutes + i);
                    count++;
                }
            }
        }
        System.out.println("Количество возможных вариантов c зеркальным отображением чисел времени в сутках: " + count);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}