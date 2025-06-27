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
public class Main {
    public static void main(String[] args) {
        ArrayList<XeMay> list = new ArrayList();
        
        System.out.print("nhap so luong xe may: ");;
        int n = new Scanner(System.in).nextInt();
        
        for(int i = 0 ; i<n; i++) {
            XeMay a = new XeMay();
            a.nhap();
            list.add(a);
            System.out.println("-------------");
        }
        
        System.out.println("------- ds xe may ---------");
        for(XeMay temp: list) {
            temp.xuat();
            System.out.println("--------------");
        }
    }
}
