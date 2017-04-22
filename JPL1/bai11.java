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
public class bai11 {
public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N : ");
        n = sc.nextInt();       
        System.out.println("Tong la : "+tong(n));
    }

    static int tong(int n) {
        if (n == 1) {
            return 1;
        }
        return gt(n) + tong(n - 1);
    }
    static int gt(int n){
        if (n==1) return 1;
        return n*gt(n-1);
    }
}
