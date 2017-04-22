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
public class bai12 {
    public static void main(String[] args) {
        int x, n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N : ");
        n = sc.nextInt();
        x = sc.nextInt();
        System.out.println("Tong la : " + tong(x, n));
    }

    static int tong(int x, int n) {
        if (n == 1) {
            return x;
        }
        return gt(x, n) + tong(x, n - 1);
    }

    static int gt(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * gt(x, n - 1);

    }
}
