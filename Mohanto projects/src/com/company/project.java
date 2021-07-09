package com.company;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.ArrayList;
class checkout{
    String name;
    String code;
    int quantity;
    int price;
    checkout(String name ,String code , int quantity , int price){
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }
}

class employee{
    static boolean log;
    String name;
    String id;
    employee(String id, String name){
        this.id = id;
        this.name = name;
    }
}
class product{
    String name;
    String purchase_code;
    int stock;
    int price;
    product(String name,String purchase_code, int stock , int price){
        this.name = name;
        this.purchase_code = purchase_code;
        this.stock = stock;
        this.price = price;
    }

}
public class project extends javax.swing.JFrame {

    /**
     * Creates new form project
     */
    public project() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        quantity = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        logintextfield = new javax.swing.JTextField();
        loginbutton = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        quantity.setToolTipText("");
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    okActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        logintextfield.setToolTipText("");
        logintextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintextfieldActionPerformed(evt);
            }
        });

        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    loginbuttonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    searchbuttonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        checkout.setText("Checkout");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    checkoutActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    resetbuttonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchbutton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(logintextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(loginbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(resetbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(loginbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(logintextfield))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(resetbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>


    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void okActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("checkout.txt",true));
        if(employee.log==true) {
            ArrayList<product> products = new ArrayList<>();
            BufferedReader bf = new BufferedReader(new FileReader("products.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String purchase_code = parts[1];
                int stock = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);
                products.add(new product(name, purchase_code, stock, price));
            }
            for (product ad : products) {
                if (ad.purchase_code.equals(searchfield.getText())) {
                    int q  = Integer.parseInt(quantity.getText());
                    int price = ad.price*q;
                    String w = ad.name+","+ad.purchase_code+ ","+ q +","+price+"\n";
                    bw.write(w);
                    textArea.append("\n Added to cart \n To add more please use the product code and search");
                    bw.close();
                }

            }
        }
        else{
            textArea.setText("Please login first");
        }

    }

    private void logintextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {

        ArrayList<employee> employees = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader("employee.txt"));
        String line;
        while((line = bf.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String id = parts[1];
            employees.add(new employee(id,name));
        }
        for (employee ad : employees ){
            if (ad.id.equals(logintextfield.getText())){
                employee.log = true;
                textArea.setText("welcome "+ad.name);
                break;

            }
            else{
                textArea.setText("Please enter a valid data");
            }
        }


    }

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        if(employee.log==true) {
            ArrayList<product> products = new ArrayList<>();
            BufferedReader bf = new BufferedReader(new FileReader("products.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String purchase_code = parts[1];
                int stock = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);
                products.add(new product(name, purchase_code, stock, price));
            }
            for (product ad : products) {
                if (ad.purchase_code.equals(searchfield.getText())) {
                    textArea.setText("stock : " + ad.stock + "\n" + "price per unit : " + ad.price+"\n"+"To add this item in your cart please enter quantity bellow and click okay");
                    break;
                }

            }
        }
        else{
            textArea.setText("Please login first");
        }





    }

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        BufferedReader br= new BufferedReader(new FileReader("checkout.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("products.txt"));
        //
        ArrayList <checkout> checkouts = new ArrayList<>();
        ArrayList<product>products = new ArrayList<>();
        int total = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String purchase_code = parts[1];
            int stock = Integer.parseInt(parts[2]);
            int price = Integer.parseInt(parts[3]);
            products.add(new product(name, purchase_code, stock, price));
        }
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String code = parts[1];
            int quantity = Integer.parseInt(parts[2]);
            int price = Integer.parseInt(parts[3]);
            checkouts.add(new checkout(name, code, quantity, price));
        }
        textArea.setText("name\tquantity\tprice\n");
        for (checkout c : checkouts){
            textArea.append("\n"+c.name+"\t"+c.quantity+"\t"+c.price);
            total = total+c.price;

        }
        textArea.append("\n Subtotal\t\t"+total);
        int tax = total*10/100;
        textArea.append("\n Tax(10%)\t\t"+tax);
        total = total+ total*10/100;
        textArea.append("\n Total\t\t"+total);

        for(checkout c : checkouts){
            for(int i =0 ;i<products.size();i++){
                if(c.code.equals(products.get(i).purchase_code)){
                    int change = products.get(i).stock - c.quantity;
                    products.set(i,new product(products.get(i).name,products.get(i).purchase_code,change,products.get(i).price));
                }

            }

        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt"));

        for (product p : products){
            writer.write(p.name+ ","+p.purchase_code+","+p.stock+","+p.price+"\n");


        }
        writer.close();



    }
    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter("checkout.txt"));
        w.write("");
        w.close();
        textArea.setText("");
    }

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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton checkout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JTextField logintextfield;
    private javax.swing.JButton ok;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTextArea textArea;
    // End of variables declaration
}
