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
public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap thang: ");
        int month = sc.nextInt();
        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Thang co 31 ngay");
            case 2 -> System.out.println("Thang co 28 hoac 29 ngay");
            case 4, 6, 9, 11 -> System.out.println("Thang co 30 ngay");
            default -> System.out.println("Thang khong hop le"); 
        }
    }
}
