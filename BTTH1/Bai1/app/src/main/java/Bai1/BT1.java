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
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.printf("Xin chao %s, ban %d tuoi", name, age);
    }
    
}
