/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */
public class BTTH2_Bai6 {
    public static void main(String[] args) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            HocSinh hs1 = new HocSinh("Nguyen Van A", df.parse("13/07/2003"), "TPHCM", 7.5, 8.5, 9);
            System.out.println(hs1);
            HocSinh hs2 = new HocSinh("Nguyen Van B", df.parse("13/07/2003"), "TPHCM", 7.5, 8.5, 9);
            System.out.println(hs2);
            System.out.println("Tuoi hien tai: " + hs1.getTuoi());
            System.out.println("DTB cua hs 1: " + hs1.getDTB());
            System.out.println("Hoc luc cua hs 1: " + hs1.getHocLuc());
        } catch(ParseException ex) {
            System.out.println("Loi dinh dang ngay thang");
        }
    }
}
