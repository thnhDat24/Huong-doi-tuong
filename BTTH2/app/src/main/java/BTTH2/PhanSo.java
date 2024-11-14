/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

/**
 *
 * @author admin
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0)
            throw new IllegalArgumentException("Mau so phai khac 0");
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    
    public static int ucln(int a, int b){
        if (b == 0)
            return a;
        else
            return ucln(b, a % b);
    }
    
    public PhanSo rutGon() {
        int u = ucln(tuSo, mauSo);
        int t = tuSo / u;
        int m = mauSo / u;
        if (m < 0) {
            t = -t;
            m = -m;
        }
        return new PhanSo(t, m);
    }
    
    public PhanSo cong(PhanSo ps){
        int t = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        int m = this.mauSo * ps.mauSo;
        PhanSo kq = new PhanSo(t, m);
        return kq.rutGon();
    }
    
    public PhanSo tru(PhanSo ps){
        int t = this.tuSo * ps.mauSo - this.mauSo * ps.tuSo;
        int m = this.mauSo * ps.mauSo;
        PhanSo kq = new PhanSo(t, m);
        return kq.rutGon();
    }
    
    public PhanSo nhan(PhanSo ps){
        int t = this.tuSo * ps.tuSo;
        int m = this.mauSo * ps.mauSo;
        PhanSo kq = new PhanSo(t, m);
        return kq.rutGon();
    }
    
    public PhanSo chia(PhanSo ps){
        if (ps.tuSo == 0) {
            throw new IllegalArgumentException("Loi chia 0");
        }
        else {
            int t = this.tuSo * ps.mauSo;
            int m = this.mauSo * ps.tuSo;
            PhanSo kq = new PhanSo(t, m);
            return kq.rutGon();
        }
    }
    
    public int soSanh(PhanSo ps){
        int left = this.tuSo * ps.mauSo;
        int right = this.mauSo * ps.tuSo;
        return Integer.compare(left, right);
    }

    @Override
    public String toString() {
        if (tuSo == 0)
            return "0";
        if (mauSo == 1)
            return String.format("%d", tuSo);
        return String.format("%d/%d", tuSo, mauSo);
    }

    @Override
    public boolean equals(Object obj) {
        PhanSo ps = (PhanSo)obj;
        ps = ps.rutGon();
        return this.tuSo == ps.tuSo && this.mauSo == ps.mauSo;
    }
    
    
    
    
    
    
}
