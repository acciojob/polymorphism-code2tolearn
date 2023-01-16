package com.driver;


public class Main {
  public static  class Product {
      public int product(int x, int y)
      {
          return x*y ;
      }
      public int product(int x, int y, int z)
      {
          return x*y*z ;
      }
      public double product(double x, double y) {
          return  x*y ;
      }
  }
    public static void main(String[] args) {

        Product p = new Product() ;
         p.product(2,1) ;
        //System.out.println(result);
         p.product(2,1,2) ;
         p.product(2.01,2.00) ;
        // System.out.println(result1);
    }
}