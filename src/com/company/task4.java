package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {

/*
    На вход подаётся номер билета, необходимо
    проверить является ли он счастливым.
    Билет является счастливым если сумма первой
    половины чисел равна сумме второй половины
*/

    static Scanner scanner = new Scanner(System.in);

    // молодёжное решение)

    public static void main(String[] args) {

        boolean result = isLucky();
        System.out.println("result: " + result);
    }

    static private boolean isLucky() {

        System.out.println("Номер билета: ");
        String ticket = scanner.next();

        try {
            return Arrays.stream(ticket.split("")).limit(ticket.length() / 2).mapToInt(Integer::parseInt).sum() ==
                    Arrays.stream(ticket.split("")).skip(ticket.length() / 2).mapToInt(Integer::parseInt).sum();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return false;
        }
    }
}

// Arrays.stream = Создание стрима из массива
// split = разделяем строку регуляркой
// limit = Позволяет ограничить выборку определенным количеством первых элементов.
// mapToInt = числовой стрим
// sum = Возвращает сумму всех чисел
// skip = Позволяет пропустить N первых элементов.