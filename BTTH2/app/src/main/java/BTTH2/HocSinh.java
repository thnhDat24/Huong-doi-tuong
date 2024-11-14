/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author admin
 */
public class HocSinh {
    private static int soLuongHS = 0;
    private String maSo;
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, Date ngaySinh, String queQuan, double diemToan, double diemVan, double diemAnh) {
        if (soLuongHS == 9999)
            throw new IllegalStateException("So luong hoc sinh vuot qua quy dinh");
        this.maSo = String.format("HS-%04d", ++soLuongHS);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Ma so: %s\nHo ten: %s\nNgay sinh: %s\nQue quan: %s\nDiem toan: %.1f\nDiem van: %.1f\nDiem anh: %.1f\n", 
                maSo, hoTen, df.format(ngaySinh), queQuan, diemToan, diemVan, diemAnh);
    }
    
    public int getTuoi() {
        Calendar ngayHienTai = Calendar.getInstance();
        Calendar ns = Calendar.getInstance();
        ns.setTime(ngaySinh);
        
        return ngayHienTai.get(Calendar.YEAR) - ns.get(Calendar.YEAR);
    }
    
    public double getDTB() {
        return (diemToan + diemVan + diemAnh) / 3.0;
    }
    
    public String getHocLuc() {
        double d = getDTB();
        if (d >= 8)
            return "Gioi";
        else if (d >= 6.5)
            return "Kha";
        else if (d >= 5.0)
            return "TB";
        else
            return "Yeu";
    }
}
    
    
    
    
    


