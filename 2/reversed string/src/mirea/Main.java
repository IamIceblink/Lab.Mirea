package mirea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] a = {"one", "two", "three", "four", "five"};
        System.out.println("Deffault text: ");
        for (int i = 0;i<a.length;++i){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int z = a.length;
        String temp;
        for (int i = 0; i<z/2;++i){
            temp = a[z-i-1];
            a[z-i-1] = a[i];
            a[i] = temp;
        }
        System.out.println("The new text: ");
        for (int i = 0; i<a.length;++i){
            System.out.print(a[i] + " ");
        }


    }
}