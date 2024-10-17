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
public class BT6 {
    static Scanner sc = new Scanner (System.in);
    
    static void nhapHeSo (int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap he so thu %d: ", i+1);
            a[i] = sc.nextInt();
        }
    }
    
    static int tinhDaThuc(int[] a, int n, int x){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i] * (int) Math.pow(x, i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[] a= new int [100];
        nhapHeSo(a, n + 1);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        int kq = tinhDaThuc(a, n + 1, x);
        System.out.printf("Ket qua cua da thuc: %d", kq);
    }
}
