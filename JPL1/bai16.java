/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;


import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai16 {
    public static void main(String[] args) {
        float n = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap N : ");
        n = sc.nextFloat();
        System.out.println("Cac uoc la : ");
        for (int i=0;i<n;i++)
        {if (n%i==0) System.out.println(i+" ");
        
        }

        
    }
}
