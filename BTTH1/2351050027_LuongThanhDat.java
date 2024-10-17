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
public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, secretNumber;
        secretNumber = (int) (Math.random()*100)+1;
        do{
            System.out.println("Nhap: ");
            n = sc.nextInt();
            if(n>secretNumber)
                System.out.println("So ban doan lon hon");
            else if(n<secretNumber)
                System.out.println("So ban doan nho hon");
            else
                System.out.println("Ban da doan dung");
        }while(n!=secretNumber);
    }
}
