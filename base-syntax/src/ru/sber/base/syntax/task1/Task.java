package ru.sber.base.syntax.task1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
