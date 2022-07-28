package com.company;

import java.util.Scanner;
public class task2 {

/*
    На вход программы подаётся строка, в
    результате должно быть выведено является
    ли входная строка палиндромом.
*/

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String result = getPalindrome();
        System.out.println("result = :" + result);
    }

    static String getPalindrome() {
        System.out.print("Введите слово: ");
        String s = scanner.next();
        if(s.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

        return  s;
    }

}
