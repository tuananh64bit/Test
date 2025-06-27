/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau13;

import java.util.Scanner;

/**
 *
 * @author anhit154
 */
public class HinhTron {
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhDienTich() {
        return Math.PI*Math.pow(banKinh, 2);
    }
    public void nhap() {
        System.out.print("nhap ban kinh hinh tron: ");
        this.banKinh = new Scanner(System.in).nextDouble();
    }
    public void xuat() {
        System.out.println("ban kinh: " + this.banKinh);
        System.out.println("dien tich: " + this.tinhDienTich());
    }
    
}
