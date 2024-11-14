/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DsPhanSo {
    private ArrayList<PhanSo> arr;

    public DsPhanSo() {
        arr = new ArrayList<>();
    }

    public ArrayList<PhanSo> getArr() {
        return arr;
    }

    public void setArr(ArrayList<PhanSo> arr) {
        this.arr = arr;
    }
    
    public boolean them(PhanSo ps){
        return arr.add(ps);
    }
    
    public boolean xoa(PhanSo ps){
        return arr.remove(ps);
    }
    
    public PhanSo tong() {
        PhanSo kq = new PhanSo();
        for (PhanSo ps : arr)
            kq = kq.cong(ps);
        return kq.rutGon();
    }
    
    public void sapXep() {
        arr.sort((PhanSo ps1, PhanSo ps2) -> {
           return ps1.soSanh(ps2);
        });
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        arr.forEach((PhanSo ps) -> {
            builder.append(ps);
            builder.append("\n");
        });
        return builder.toString();
        
    } 
    
    
    
}
