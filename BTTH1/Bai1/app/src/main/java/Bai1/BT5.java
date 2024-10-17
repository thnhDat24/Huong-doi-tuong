/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT5 {
    static final int MAX = 100;
    static Scanner sc = new Scanner (System.in);
    
    static void nhapMang(int[] a, int n) {
        for(int i = 0 ;i < n; i++){
            System.out.printf("Nhap a[%d]: \n", i);
            a[i] = sc.nextInt();
        }
    }
    
    static void xuatMang(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = %d \n", i, a[i]);
        }
    }
    
    static int sumPrime(int[] a, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(BT4.isPrime(a[i]))
                sum += a[i];
        }
        return sum;
    }
    
    static void viTri(int[] a, int n, int x){
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                System.out.printf("Vi tri cua %d trong mang: %d", x, i);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[MAX];
        nhapMang(a, n);
        xuatMang(a, n);
        System.out.printf("Tong cac so nguyen to trong mang: %d", sumPrime(a, n));
        System.out.println("Nhap gia tri can tim: ");
        int x = sc.nextInt();
        viTri(a, n, x);
    }
}
