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
public class bai2 {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<100;i++){
        System.out.println("Nhap N : (n>=5 va n<=20)");
        n = sc.nextInt();
        if (n>=5&&n<=20) break;
        System.out.println("Nhap sai Vui long nhap lai !");
        }
        System.out.println("Tong la : "+tong(n));
    }

    static int tong(int n) {
        if (n == 1) {
            return 1;
        }
        return n*n + tong(n - 1);
    }
}
