package com.unique.pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        digitalClockMirroring();
        luckyTickets();
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

    private static void luckyTickets() {
//        2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
//        (те у которых сумма первых 3 цифр равна сумме последних 3)
        System.out.println("Task 1. (luckyTickets)");
        System.out.print("Укажите какое количество билетов было выпущенно(в диапазоне от 1000 до 999999: ");
        Scanner scanner = new Scanner(System.in);
        int releasedTickets = scanner.nextInt();
        System.out.printf("Среди указанного количества былетов %s счастливых.",
                calculateLuckyTickets(releasedTickets) - 1);
    }

    private static int calculateLuckyTickets(int releasedTickets) {
        int count = 0;
        for (int i = 0; i <= releasedTickets / 1000; i++) {
            for (int j = 0; j <= 999; j++) {
                if (i / 100 + i % 100 / 10 + i % 100 % 10 == j / 100 + j % 100 / 10 + j % 100 % 10) {
                    count++;
                }
            }
        }
        return count;
    }

//        *) Результат скинуть как ссылка на github, без лишних файлов (out, .idea, project.iml)
//        где каждое задание отдельным коммитом, и у каждого коммита нормальное сообщение,
//        которое отображает что в этом коммите добавилось нового.
//        Т.е. должно быть 3 коммита примерно так:
//        Initial commit
//        Task1
//        Task2

}