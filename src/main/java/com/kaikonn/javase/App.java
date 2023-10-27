package com.kaikonn.javase;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for(int i = 1 ; i < n ; i *= 2){
            for(int j = 0 ; j < i ; j++){
                sum++;
            }
        }
    }
}