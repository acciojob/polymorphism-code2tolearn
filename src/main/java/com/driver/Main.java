package com.driver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;
        Product p = new Product() ;
        int result =   p.product(x,y) ;
        System.out.println(result);
    }

}