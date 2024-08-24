/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ABDUL MOIZ
 */
public class Store {
   public  static ArrayList<Product> product ;
   public static ArrayList<Employ> Emp;
   public static Employ empl;
   static{
    product = new ArrayList();
    Emp =new ArrayList();
}
   public static void addemp(Employ emp){
       if(emp!=null)
       Emp.add(emp);
       empl=new Employ();
   }
   public static void dummyProducts(){
        product.add(new Product(1,"Kitkat","snacks",10,100,150));
        product.add(new Product(2,"bounty","snacks",100,300,450));
        product.add(new Product(3,"Lays","snacks",50,60,100));
        product.add(new Product(4,"Bread","food",60,200,350));
        product.add(new Product(5,"Apple","fruit",70,100,200));        
    }
   public static boolean checklogin(Employ emp){
       for(int i=0;i<Emp.size();i++){
           if(!Emp.get(i).getName().equalsIgnoreCase(emp.getName())||!Emp.get(i).getPassword().equalsIgnoreCase(emp.getPassword())){
           return true;
           } 
       }
       return false;
   }
   
 public static void Edit(int id,Product p){
     for(int i=0; i<product.size(); i++){
         if(product.get(i).getpId()==id){
             product.get(i).setpId(p.getpId());
             product.get(i).setpNme(p.getpNme());
             product.get(i).setCatgory(p.getCatgory());
             product.get(i).setPrice(p.getPrice());
             product.get(i).setWsPrice(p.getWsPrice());
         }
     }
     erorrmsg("sucessfully EDIT");

}
  public static void Delete(Product p){
    for (int i = 0; i < product.size(); i++) {
            if (p.getpId()==product.get(i).getpId()) {
                product.remove(i);
            }
        }
        System.out.println(product.size());
 }
  
  public static void add(Product obj){
      if(obj !=null){
          product.add(obj);
      }
      else{
          JOptionPane.showMessageDialog(null, "Product data not resive");
      }
  }
 public static ArrayList<Product> getallProduct(){
     return product;
 } 
 public static Product search(String s){
     for(int i=0;i<product.size();i++){
       if( product.get(i).getpNme().equalsIgnoreCase(s)){
             
             return product.get(i);
         }
      }
     
     JOptionPane.showMessageDialog(null, "Product not found");
       return null;
       
 
 }
 public static void erorrmsg(String msg){
     JOptionPane.showMessageDialog(null, msg);
 }

    public static String emplgetPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


 }
