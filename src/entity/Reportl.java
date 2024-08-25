package entity;

import java.util.ArrayList;

public class Reportl {
    public static ArrayList<Product> p;

     static{
    p =new ArrayList();
    }
    public static ArrayList<Product> getP() {
        return p;
    }
  public static void add(Product p){
      if(p!=null){
           Reportl.p.add(p);
      }
  }
    public static void setP(ArrayList<Product> p) {
        Reportl.p = p;
    }

   
    
    
    
}
