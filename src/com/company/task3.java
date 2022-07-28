package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {

/*
    На вход подаётся строка из нулей и единиц,
    необходимо посчитать максимальное количество
    подряд идущих нулей.
    Java урок 2 Строки, Random,
*/

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int result = getNum();
        System.out.println("result :" + result);
    }

    static int  getNum() {
        System.out.println("Напиши число в двузначной системе счисления");
        String bits = scanner.next();
        String[] split = bits.split("1");
        System.out.println(Arrays.toString(split));
        Arrays.sort(split);
        System.out.println(Arrays.toString(split));

        int maxLength = split[split.length -1].length();
        return maxLength;
    }

}

