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
public class bai10 {

    public static void main(String[] args) {
        int n = 0;
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x va n");
        x = sc.nextFloat();
        n = sc.nextInt();
        System.out.println("Tong la : " + tong(x, n));
    }

    static float tong(float x, int n) {
        if (n == 1) {
            return x;
        }
        return x * tong(x, n - 1);

    }
}
