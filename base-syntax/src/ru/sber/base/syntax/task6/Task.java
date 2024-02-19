package ru.sber.base.syntax.task6;

public class Task {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < 100; ++i){
            arr[i] = (int) Math.round(Math.random()*1000);
        }
        int X = -1;
        int Z = -1;
        float sum = 0;
        for(int i = 0; i < 100; ++i){
            sum += arr[i];
            if(arr[i] > X){
                X = arr[i];
                Z = i;
            }
        }
        for(int i = 0; i < 100; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение = " + X + " находится в элементе под индексом " + Z);
        System.out.println("Среднее значение = " + sum/100);
    }
}
