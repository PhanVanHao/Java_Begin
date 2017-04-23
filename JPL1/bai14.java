/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai14 {
     public static void main(String[] args) {
        int x, n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap X và N : ");
        x = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Tong la : " + tong(x, n));
    }

    static int tong(int x, int n) {
        if (n == 1) {
            return gt(x,1);
        }
        return gt(x, 2*n+1) + tong(x, n - 1);
    }

    static int gt(int x, int n) {
        return (int) pow(x,n);
        }
}
