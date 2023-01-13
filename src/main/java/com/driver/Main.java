package com.driver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;
        int z = sc.nextInt() ;
        Product p = new Product() ;
        int result =   p.product(x,y) ;
        System.out.println(result);
        System.out.println(p.product(x,y,z));
        double result1 = p.product((double)x,(double)y) ;
        System.out.println(result1);

    }

}