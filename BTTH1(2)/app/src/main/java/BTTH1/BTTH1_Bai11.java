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
public class BTTH1_Bai11 {
    public static void main(String[] args) {
        try{
        File f = new File ("D:\\SV-HS-CD.txt");
        Scanner sc = new Scanner(f);
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();
        int countHS = 0, countSV = 0, countCD = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] arr = line.split(",");
            char c = arr[0].charAt(0);
            if (!Character.isDigit(c))
                countHS++;
            else{
                if (arr.length == 7)
                    countSV++;
                else
                    countCD++;
            } 
        }
        System.out.printf("So luong hoc sinh: %d\n", countHS);
        System.out.printf("So luong sinh vien: %d\n", countSV);
        System.out.printf("So luong cong dan: %d\n", countCD);
        } catch (FileNotFoundException e){
            System.out.println("Khong tim thay file");
        }
        
    }
}
