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
public class bai9 {
        public static void main(String[] args) {
        float n = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 100; i++) {
            System.out.println("Nhap N : (n>6)");
            n = sc.nextFloat();
            if (n > 6) {
                break;
            }
            System.out.println("Nhap sai Vui long nhap lai !");
        }
        System.out.println("Tong la : " + tong(n));
    }

    static float tong(float n) {
        if (n == 1.0) {
            return (float) (1);
        }
        return (float) n*tong(n-1);
    }
}
