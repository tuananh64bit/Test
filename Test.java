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

public class Test {
    public static void nhapDSHinhTron(HinhTron[] a) {
        System.out.println("---------- nhap danh sach hinh tron ----------");
        for(int i = 0; i< a.length; i++) {
            System.out.println("------ nhap hinh tron thu " + (i+1) + " ----------");
            a[i] = new HinhTron();
            a[i].nhap();
        }
    }
    public static void xuatDSHinhTron(HinhTron[] a) {
        System.out.println("---------- danh sach hinh tron -----------");
        for(HinhTron temp: a) {
            temp.xuat();
            System.out.println("--------");
        }
    }
    
    public static void inHinhTronSMax(HinhTron[] a) {
        double sMax = a[0].tinhDienTich();
        for(HinhTron temp: a) {
            if(temp.tinhDienTich() > sMax) {
                sMax = temp.tinhDienTich();
            }
        }
        System.out.println("-------- danh sach hinh tron co dien tich lon nhat la ---------");
        
        for(HinhTron temp: a) {
            if(temp.tinhDienTich() == sMax) {
                temp.xuat();
                System.out.println("------");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("nhap so luong hinh tron: ");
        int n = new Scanner(System.in).nextInt();
        HinhTron[] a = new HinhTron[n];
        nhapDSHinhTron(a);
        xuatDSHinhTron(a);
        inHinhTronSMax(a);
    }
}
