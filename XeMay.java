/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anhit154
 */
public class XeMay {
    public String nhaSX;
    public String model;
    private float chiPhiSX;
    protected int thoiGianSX;
    // contructor khong tham so

    public XeMay() {
    }
    
    // constructor co tham so
    public XeMay(String nhaSX, String model, float chiPhiSX, int thoiGianSX) {
        this.nhaSX = nhaSX;
        this.model = model;
        this.chiPhiSX = chiPhiSX;
        this.thoiGianSX = thoiGianSX;
        
        
    }
    // nhap
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap nha sx: ");
        this.nhaSX = sc.nextLine();
        System.out.print("nhap ten model: ");
        this.model = sc.nextLine();
        System.out.print("nhap chi phi san xuat: ");
        this.chiPhiSX = sc.nextFloat();
        System.out.print("nhap thoi gian san xuat: ");
        this.thoiGianSX = sc.nextInt();
    }
    
    public void xuat() {
        System.out.println("nha san xuat: " + this.nhaSX);
        System.out.println("model: " + this.model);
        System.out.println("chi phi san xuat: " + this.chiPhiSX);
        System.out.println("ngay san xuat: " + this.thoiGianSX);
        System.out.println("gia ban: " + this.tinhGiaBan());
    }

    @Override
    public String toString() {
        return "XeMay{" + "nhaSX=" + nhaSX + ", model=" + model + ", chiPhiSX=" + chiPhiSX + ", thoiGianSX=" + thoiGianSX + '}';
    }
    
    public float tinhGiaBan() {
        return (float) 1.5 * chiPhiSX;
    }
}
