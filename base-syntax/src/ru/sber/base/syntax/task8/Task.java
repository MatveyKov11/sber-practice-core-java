package ru.sber.base.syntax.task8;

public class Task {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for(int i = 0; i < 30; ++i){
            arr[i] = (int) Math.round(Math.random()*1000);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 28; ++i){
            for(int j = 0; j < 29-i; ++j){
                if(arr[j] > arr[j+1]){
                    int d = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = d;
                }
            }
        }
        for(int i = 0; i < 30; ++i){
            System.out.print(arr[i] + " ");
        }
    }
}
