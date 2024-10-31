/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BTTH1_Bai12 {
    public static void main(String[] args) {
        try{
            File f = new File ("D:\\SinhVien.txt");
            Scanner sc = new Scanner (f);
            int countCNTT = 0, countQTKD = 0;
            ArrayList<String> cntt = new ArrayList<>();
            sc.nextLine();
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(",");
                if (arr[4].toLowerCase().contains("cong nghe thong tin")){
                    countCNTT++;
                    cntt.add(line);
                }
                else if (arr[4].toLowerCase().contains("quan tri kinh doanh"))
                    countQTKD++;
            }
            System.out.printf("So luong sinh vien CNTT: %d\n", countCNTT);
            System.out.printf("So luong sinh vien QTKD: %d\n", countQTKD);
            PrintWriter writer = new PrintWriter("D:\\SinhVienCNTT.txt");
            for (String sv : cntt){
            writer.println(sv);
            }
        writer.close();
        sc.close();
        } catch(FileNotFoundException e){
            System.out.println("Khong tim thay file\n");
        }
        
    }
}
