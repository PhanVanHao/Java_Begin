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
public class bai1 {

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap N : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Tong la : "+tong(n));
    }

    static int tong(int n) {
        if (n == 1) {
            return 1;
        }
        return n + tong(n - 1);
    }
}
