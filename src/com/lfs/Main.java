package com.lfs;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1,2,3,4,5,6};
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        System.out.println("вывод суммы через for: " + sum);
        int i = 0;
        sum = 0;
        while (i<a.length){
            sum+=a[i];
            i++;
        }
        System.out.println("вывод суммы через while: " +sum);
        i = 0; sum = 0;
        do{
            sum+=a[i];
            i++;
        }while (i < a.length);
        System.out.println("вывод суммы через do while: " +sum);
        System.out.println("Факториал 5: " + fact(5));

        int[] mas = new int[5];
        System.out.println("Рандомный массив через Math:");
        for (int k = 0; k < mas.length; k++ ){
            mas[k] = (int) (Math.random() * 100);
        }
        for(int k : mas) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        Arrays.sort(mas);
        for(int k : mas) {
            System.out.print(k + " ");
        }
        System.out.print("\n");

        System.out.println("Рандомный массив через Random");
        for (int k = 0; k < mas.length; k++ ){
            mas[k] = new Random().nextInt(100);
        }
        for(int k : mas) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        Arrays.sort(mas);
        for(int k : mas) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
    }

    private static int fact(int n){
        if(n == 1)
            return 1;
        return n*fact(n-1);
    }
}
