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
public class ReportList {

    public static ArrayList<Customer> List;
  

   static {
        List=new ArrayList();
          
    }

     public static void add(Customer obj){
      if(obj !=null){
          List.add(obj);
      }
      else{
          JOptionPane.showMessageDialog(null, " data not resive");
      }
  }

    

    public static ArrayList<Customer> getList() {
        return List;
    }

    public static void setList(ArrayList<Customer> List) {
        ReportList.List = List;
    }

    
}
