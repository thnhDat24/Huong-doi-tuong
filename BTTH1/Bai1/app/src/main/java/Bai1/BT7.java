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
public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ho: ");
        String ho = sc.nextLine();
        System.out.println("Nhap ten lot: ");
        String tenLot = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        
        String hoTen = ho + " " + tenLot + " " + ten;
        
        
        System.out.printf("Xin chao, %s", hoTen);
    }
}
