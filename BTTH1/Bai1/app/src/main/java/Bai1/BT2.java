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
public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ban kinh: ");
        int banKinh = sc.nextInt();
        double dienTich = Math.PI * Math.pow((double)banKinh, 2);
        double chuVi = Math.PI * 2 * banKinh;
        System.out.printf("Dien tich hinh tron: %08.3f\n", dienTich);
        System.out.printf("Chu vi hinh tron: %f", chuVi);
        
    }
    
}
