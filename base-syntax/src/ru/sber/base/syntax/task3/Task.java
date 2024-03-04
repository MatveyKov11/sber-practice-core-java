package ru.sber.base.syntax.task3;

public class Task {
    public static void main(String[] args) {
        int n = 8;
        int m = 13;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print((i+j)%2 == 0 ? '*' : ' ');
            }
            System.out.println();
        }
    }
}
