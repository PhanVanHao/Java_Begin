/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai4 {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<100;i++){
        System.out.println("Nhap N : (n>9)");
        n = sc.nextInt();
        if (n>9) break;
        System.out.println("Nhap sai Vui long nhap lai !");
        }
        System.out.println("Tong la : "+tong(n));
    }

    static float tong(int n) {
        if (n == 1) {
            return 1/2;
        }
        return (float) (1/(n*2.0) + tong(n - 1));
    }
}
