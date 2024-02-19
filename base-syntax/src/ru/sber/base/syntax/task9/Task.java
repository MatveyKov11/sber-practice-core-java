package ru.sber.base.syntax.task9;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char let = (char)('A' + Math.round(Math.random()*26));
        System.out.println("Угадайте символ");
        char c = in.next().charAt(0);
        while(c != let){
            if(c < 'A' || c > 'Z'){
                System.out.println("Введен недопустимый символ");
            }else {
                if (c < let) {
                    System.out.println("Ищи букву, которая после нее в алфавите");
                }else{
                    System.out.println("Ищи букву, которая перед ней в алфавите");
                }
            }
            System.out.println("Угадайте символ");
            c = in.next().charAt(0);
        }
        System.out.println("Верно!");
    }
}
