/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BTTH1_Bai14 {
     static Scanner sc = new Scanner(System.in);
     
     public static void nhapMaTran(int[][] a, int m, int n){
         for (int i = 0; i < m; i++){
             for (int j = 0; j < n; j++){
                 System.out.printf("a[%d][%d]: ", m, n);
                 a[i][j] = sc.nextInt();
             }
         }
     }
     
     public static void xuatMaTran(int[][] a, int m, int n){
         for (int i = 0; i < m; i++){
             
         }
     }
     
    public static void main(String[] args) {
        int[][] a = new int[100][100];
        int m, n;
        System.out.println("Nhap m: ");
        m = sc.nextInt();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        
    }
}
