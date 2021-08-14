package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        for (i =0; i< size; i++){
            System.out.println("Value of array["+i+"] is: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhap so can xoa: ");
        int number = sc.nextInt();
        int index = indexOfDel(arr,number);
        if(index != -1) {
            for (i = index; i < size-1; i++){
                arr[i] = arr[i+1];
            }
            arr[size-1] = 0;

            for (int x: arr){
                System.out.print( x + "  ");
            }
        }else {
            System.out.println("Khong nam trong mang");
        }

    }

    public static int indexOfDel(int[] arr, int number){
        int index = -1;
        for(int i = 0; i <  arr.length; i++) {
            if (number == arr[i]) {
                index = i;
            }
        }
        return index;
    }
}
