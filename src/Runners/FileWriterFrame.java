package Runners;


import java.io.BufferedWriter;
import java.io.FileWriter;


public class FileWriterFrame extends javax.swing.JFrame {

    int[] nums = new int[5];
    
    public FileWriterFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonWrite = new javax.swing.JButton();
        list1 = new java.awt.List();
        buttonRandomFill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonWrite.setText("Write To File");
        buttonWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWriteActionPerformed(evt);
            }
        });

        buttonRandomFill.setText("Random Fill");
        buttonRandomFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRandomFillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(buttonRandomFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRandomFill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonWrite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRandomFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRandomFillActionPerformed
        //refill array
        for(int k=0; k<nums.length; k++)
            nums[k] = (int)(Math.random()*100);
        
        //show in listbox for fun...
        list1.removeAll();
        for(int k=0; k<5; k++) {
            list1.add(""+nums[k]);
        }
    }//GEN-LAST:event_buttonRandomFillActionPerformed

    private void buttonWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWriteActionPerformed
        String currentDirectory = System.getProperty("user.dir");
        String fullFileName = currentDirectory + "/numbers.txt";
        
        try {
            FileWriter fw = new FileWriter(fullFileName);
            BufferedWriter br = new BufferedWriter(fw);
            br.write("here are some numbers" + "\n");        //add a newline character
            br.write("that were generated randomly...\n");   //or add the \n directly in the string itself
            //loop through array and write numbers
            for( int k=0 ; k<nums.length; k++) {
                String temp = "" + nums[k];
                br.write(temp + "\n");
            }
            br.write("this is the end\n");     //debateable:  should end last line with newline character
            br.close();
        }
        catch(Exception e) {
            System.out.println("Error writing to file");
        }
        
    }//GEN-LAST:event_buttonWriteActionPerformed

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
            java.util.logging.Logger.getLogger(FileWriterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileWriterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileWriterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileWriterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileWriterFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRandomFill;
    private javax.swing.JButton buttonWrite;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
