package com.driver;


public class Main {
  static  class Product {
      public int product(int x, int y)
      {
          return x*y ;
      }
      public int product(int x, int y, int z)
      {
          return x*y*z ;
      }
      public double product(double x, double y) {
          return (double) x*y ;
      }
  }
    public static void main(String[] args) {

        Product p = new Product() ;
        int result1 =   p.product(2,1) ;
        //System.out.println(result);
        int result2 =  p.product(2,1,2) ;
        double result3 = p.product(2.01,2.00) ;
        // System.out.println(result1);
    }
}