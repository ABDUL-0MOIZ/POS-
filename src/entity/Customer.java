/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author ABDUL MOIZ
 */
public class Customer {
   private String cNmae;
   private String type;
      private long totalBill;
   private long payment;
  private long Dicount;
  private long remaining;

    public long getRemaining() {
        return remaining;
    }

    public void setRemaining(long remaining) {
        this.remaining = remaining;
    }
  
    public long getDicount() {
        return Dicount;
    }

    public void setDicount(long Dicount) {
        this.Dicount = Dicount;
    }
  
    
    public Customer(String cNmae, String type, long totalBill, long payment) {
        this.cNmae = cNmae;
        this.type = type;
        this.totalBill = totalBill;
        this.payment = payment;
    }

  
    public long getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public Customer(String cNmae, String type) {
        this.cNmae = cNmae;
        this.type = type;
    }

    public Customer() {
   
    }

    public String getcNmae() {
        return cNmae;
    }

    public void setcNmae(String cNmae) {
        this.cNmae = cNmae;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


   
   
    
}
