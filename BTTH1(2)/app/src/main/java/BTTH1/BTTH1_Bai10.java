/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BTTH1_Bai10 {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\numbers.txt");
            Scanner sc = new Scanner (f);
            String line = sc.nextLine();
            String[] a = line.split(" ");
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for(String n : a){
                int number = Integer.parseInt(n);
                sum += number;
                if(number > max)
                    max = number;
            }
            double avg = (double) sum / a.length;
            System.out.printf("So lon nhat trong mang la: %d\n", max);
            System.out.printf("Trung binh cua mang: %.2f\n", avg);
        }catch (FileNotFoundException e){
                System.out.println("Khong tim thay file");
        }
    }
}
