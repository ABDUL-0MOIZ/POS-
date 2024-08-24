/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen_PENNAL;

import entity.Product;
import entity.Store;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABDUL MOIZ
 */
public class Product_Mang extends javax.swing.JFrame {

 
     public Product_Mang() {
        initComponents();
         
      //  Store.dummyProducts();
      
    }
    
       public void resetfields(){
        id.setText("");
        name.setText("");
        catogry.setSelectedIndex(0);
        Price.setText("");
       wsprice.setText("");
        contity.setText("");
    }
        void setproductlist(){
        ArrayList<Product> obj = Store.getallProduct();
        if(obj!=null){
        DefaultTableModel model =(DefaultTableModel) Productlist.getModel();
        model.setRowCount(0);
        for(int i=0 ;i<obj.size();i++){
            Object[] cols=new Object[6];
            cols[0]=obj.get(i).getpId();
            cols[1]=obj.get(i).getpNme();
            cols[2]=obj.get(i).getCatgory();
            cols[3]=obj.get(i).getContity();
            cols[4]=obj.get(i).getPrice();
            cols[5]=obj.get(i).getWsPrice();
            model.addRow(cols);
            resetfields();
        }
        }
        }
        
       public  void setSingleProductTable(Product p){
       
        if(p!=null){
        DefaultTableModel model =(DefaultTableModel) Productlist.getModel();
        model.setRowCount(0);
            Object[] cols=new Object[6];
            cols[0]=p.getpId();
            cols[1]=p.getpNme();
            cols[2]=p.getCatgory();
            cols[3]=p.getContity();
            cols[4]=p.getPrice();
            cols[5]=p.getWsPrice();
            model.addRow(cols);
            
        }
        
        
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Productlist = new javax.swing.JTable();
        searchtext = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        contity = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        wsprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        catogry = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        AddProd = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(40, 30, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Productlist.setAutoCreateRowSorter(true);
        Productlist.setBackground(new java.awt.Color(25, 34, 47));
        Productlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Productlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Productlist.setForeground(new java.awt.Color(255, 255, 255));
        Productlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Catgory", "Contity", "Price", "Wole sale price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Productlist.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Productlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Productlist);
        Productlist.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 806, -1));
        getContentPane().add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 135, 235, 23));

        jPanel1.setBackground(new java.awt.Color(25, 34, 47));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Catgory");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 237, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 87, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 59, 215, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 109, 215, -1));

        contity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contityActionPerformed(evt);
            }
        });
        jPanel1.add(contity, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 209, 215, -1));

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 259, 215, -1));
        jPanel1.add(wsprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 319, 215, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WoleSale Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 287, -1, 26));
        jLabel5.getAccessibleContext().setAccessibleParent(jLabel1);

        catogry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Snacks", "Fruits", "Dairy ", "Baking", "sea Food", "Toys ", " ", " " }));
        catogry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catogryActionPerformed(evt);
            }
        });
        jPanel1.add(catogry, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 159, 215, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 187, -1, -1));

        AddProd.setText("Add");
        AddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProdActionPerformed(evt);
            }
        });
        jPanel1.add(AddProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 64, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 290, 390));

        Editbtn.setText("Edit");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 175, -1, 46));

        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 175, -1, 46));

        jPanel2.setBackground(new java.awt.Color(25, 34, 47));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("POINT OF SALE SYSTEM");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, -1));

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/magnifying-glass.png"))); // NOI18N
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 135, -1, -1));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1330, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void contityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contityActionPerformed

    private void AddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProdActionPerformed
        // TODO add your handling code here:
        if(!id.getText().isEmpty()&&
                !name.getText().isEmpty()&&
                !catogry.getSelectedItem().toString().isEmpty()&&
                !contity.getText().isEmpty()&& 
                !Price.getText().isEmpty()&&
                !wsprice.getText().isEmpty()){
            Product p=new Product();
            p.setpId(Integer.parseInt(id.getText()));
            p.setpNme(name.getText());
            p.setCatgory( catogry.getSelectedItem().toString());
            p.setContity(Integer.parseInt(contity.getText()));
            p.setPrice(Integer.parseInt(Price.getText()));
            p.setWsPrice(Integer.parseInt(wsprice.getText()));
            Store.add(p);
                        
          setproductlist();
        }
        else{
            JOptionPane.showMessageDialog(null, "Fill the Entir field");
                    
                    
        }
    }//GEN-LAST:event_AddProdActionPerformed

    
    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void catogryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catogryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catogryActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        if(!searchtext.getText().isEmpty()){
            Product sProdect=Store.search(searchtext.getText());
            if(sProdect!=null){
            this.setSingleProductTable(sProdect);
            }
            else{
                Store.erorrmsg("Product "+searchtext.getText()+"Not found");
            }
            
            
        }
        else{
            setproductlist();
            Store.erorrmsg("Enter Text first");
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void ProductlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductlistMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) Productlist.getModel();
        int index=Productlist.getSelectedRow();
        id.setText(model.getValueAt(index,0).toString());
        name.setText(model.getValueAt(index, 1).toString());
        catogry.setSelectedItem(model.getValueAt(index, 2).toString());
        contity.setText(model.getValueAt(index, 3).toString());
        Price.setText(model.getValueAt(index, 4).toString());
        wsprice.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_ProductlistMouseClicked

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
          if(!id.getText().isEmpty()&&
                !name.getText().isEmpty()&&
                !catogry.getSelectedItem().toString().isEmpty()&&
                !contity.getText().isEmpty()&& 
                !Price.getText().isEmpty()&&
                !wsprice.getText().isEmpty())
          {
            Product p=new Product();
            p.setpId(Integer.parseInt(id.getText()));
            p.setpNme(name.getText());
            p.setCatgory( catogry.getSelectedItem().toString());
            p.setContity(Integer.parseInt(contity.getText()));
            p.setPrice(Integer.parseInt(Price.getText()));
            p.setWsPrice(Integer.parseInt(wsprice.getText()));
            
            
//            
            Store.Delete(p);
            
            
            
            resetfields();
            
setproductlist(); 
          }           
          
       Store.erorrmsg("fill the Required field");
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        // TODO add your handling code here:
          if(!id.getText().isEmpty()&&
                !name.getText().isEmpty()&&
                !catogry.getSelectedItem().toString().isEmpty()&&
                !contity.getText().isEmpty()&& 
                !Price.getText().isEmpty()&&
                !wsprice.getText().isEmpty()){
            Product p=new Product();
            p.setpId(Integer.parseInt(id.getText()));
            p.setpNme(name.getText());
            p.setCatgory( catogry.getSelectedItem().toString());
            p.setContity(Integer.parseInt(contity.getText()));
            p.setPrice(Integer.parseInt(Price.getText()));
            p.setWsPrice(Integer.parseInt(wsprice.getText()));
         Store.Edit(p.getpId(), p);
         
         
          resetfields();
           setproductlist(); 
         
        }
     Store.erorrmsg("fill The requird field");
    }//GEN-LAST:event_EditbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Product_Mang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Mang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Mang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Mang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Mang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProd;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Editbtn;
    private javax.swing.JTextField Price;
    private javax.swing.JTable Productlist;
    private javax.swing.JComboBox<String> catogry;
    private javax.swing.JTextField contity;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtext;
    private javax.swing.JTextField wsprice;
    // End of variables declaration//GEN-END:variables

   
}
