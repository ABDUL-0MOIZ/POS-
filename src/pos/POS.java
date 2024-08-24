/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import java.util.logging.Level;
import java.util.logging.Logger;
import screen_PENNAL.Login;
import screen_PENNAL.loading;


public class POS {

 
    public static void main(String[] args) {
loading Loading=new loading();
Loading.setVisible(true);
for(int i=0 ;i<=100;i++){
    try {
        Loading.value.setText(String.valueOf(i)+"%");
        Loading.progressbar.setValue(i);
        Thread.sleep(20);
    } catch (InterruptedException ex) {
       System.out.println(ex.getMessage());
    }
}
Loading.setVisible(false);
Loading.dispose();
Login login=new Login();
login.setVisible(true);

      }
    }
    
