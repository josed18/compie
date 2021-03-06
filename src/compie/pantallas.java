/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compie;

import java.awt.Window;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author clases
 */
public class pantallas extends javax.swing.JFrame {
    private Object statusField;
    private Object jOptionPane1;

    /**
     * Creates new form pantallas
     */
    public pantallas() {
        initComponents();
         setLocationRelativeTo(null);
         setResizable(false);
         setTitle("Compilador R&A");
    }
    private void alineacion(int stc)
 {
 StyledDocument st=TxtAr.getStyledDocument();
 SimpleAttributeSet bSet = new SimpleAttributeSet(); 
 StyleConstants.setAlignment(bSet, stc); 
 st.setParagraphAttributes(0,TxtAr.getText().length(), bSet, false); 
 TxtAr.updateUI();
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenBt = new javax.swing.JButton();
        RigBt = new javax.swing.JButton();
        LefBt = new javax.swing.JButton();
        CopBt = new javax.swing.JButton();
        CorBt = new javax.swing.JButton();
        PegBt = new javax.swing.JButton();
        LexBt = new javax.swing.JButton();
        SinBt = new javax.swing.JButton();
        Sembt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAr = new javax.swing.JTextPane();
        ResBt = new javax.swing.JButton();
        SimBt = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        NueBt = new javax.swing.JMenuItem();
        AbrBt = new javax.swing.JMenuItem();
        GuaBt = new javax.swing.JMenuItem();
        SalBt = new javax.swing.JMenuItem();
        ArcBt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CenBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compie/center.png"))); // NOI18N
        CenBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenBtActionPerformed(evt);
            }
        });

        RigBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compie/right.png"))); // NOI18N
        RigBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RigBtActionPerformed(evt);
            }
        });

        LefBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compie/left.png"))); // NOI18N
        LefBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LefBtActionPerformed(evt);
            }
        });

        CopBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Copy-52.png"))); // NOI18N
        CopBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopBtActionPerformed(evt);
            }
        });

        CorBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Cut-52.png"))); // NOI18N
        CorBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorBtActionPerformed(evt);
            }
        });

        PegBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Paste Special-52.png"))); // NOI18N
        PegBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PegBtActionPerformed(evt);
            }
        });

        LexBt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LexBt.setText("Lexico");
        LexBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LexBtActionPerformed(evt);
            }
        });

        SinBt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SinBt.setText("Sintactico");
        SinBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinBtActionPerformed(evt);
            }
        });

        Sembt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sembt.setText("Semantico");
        Sembt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SembtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Realizar Analisis");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Simbolos");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Palabras Reservadas");

        jScrollPane2.setViewportView(TxtAr);

        ResBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Show Property-52.png"))); // NOI18N
        ResBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResBtActionPerformed(evt);
            }
        });

        SimBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Show Property-52.png"))); // NOI18N
        SimBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimBtActionPerformed(evt);
            }
        });

        jMenu2.setText("Archivo");

        NueBt.setText("Nuevo");
        NueBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueBtActionPerformed(evt);
            }
        });
        jMenu2.add(NueBt);

        AbrBt.setText("Abrir");
        AbrBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrBtActionPerformed(evt);
            }
        });
        jMenu2.add(AbrBt);

        GuaBt.setText("Guardar");
        GuaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuaBtActionPerformed(evt);
            }
        });
        jMenu2.add(GuaBt);

        SalBt.setText("Salir");
        SalBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalBtActionPerformed(evt);
            }
        });
        jMenu2.add(SalBt);

        jMenuBar1.add(jMenu2);

        ArcBt.setText("Acerca de");
        ArcBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArcBtMouseClicked(evt);
            }
        });
        ArcBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArcBtActionPerformed(evt);
            }
        });
        jMenuBar1.add(ArcBt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CopBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PegBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LefBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CenBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RigBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SimBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResBt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(LexBt)
                        .addGap(18, 18, 18)
                        .addComponent(SinBt)
                        .addGap(18, 18, 18)
                        .addComponent(Sembt)
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CenBt)
                        .addComponent(RigBt)
                        .addComponent(LefBt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CorBt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PegBt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CopBt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LexBt)
                    .addComponent(SinBt)
                    .addComponent(Sembt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResBt)
                    .addComponent(SimBt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LefBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LefBtActionPerformed
        alineacion(StyleConstants.ALIGN_LEFT);
    }//GEN-LAST:event_LefBtActionPerformed

    private void CopBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopBtActionPerformed
        TxtAr.copy();
    }//GEN-LAST:event_CopBtActionPerformed

    private void SalBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalBtActionPerformed

    private void NueBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueBtActionPerformed
        TxtAr.setText(""); 
        JOptionPane.showMessageDialog(null,"Nuevo");
    }//GEN-LAST:event_NueBtActionPerformed

    private void GuaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuaBtActionPerformed
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showSaveDialog(this);
        if(chooserValue == JFileChooser.APPROVE_OPTION){
            try {
                PrintWriter fout = new PrintWriter(chooser.getSelectedFile());
                fout.print(TxtAr.getText());
                fout.close();
                //JOptionPane.showMessageDialog(null, "Guardado");           
                }catch(FileNotFoundException ex){
                  Logger.getLogger(pantallas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            
    }//GEN-LAST:event_GuaBtActionPerformed

    private void AbrBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrBtActionPerformed
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showOpenDialog(this);
        if(chooserValue == JFileChooser.APPROVE_OPTION){
            try {
                Scanner fin = new Scanner(chooser.getSelectedFile());
                String buffer = "";
                while(fin.hasNext()){
                buffer += fin.nextLine() + "\n";
                }
                TxtAr.setText(buffer);
                fin.close();
                //statusField.setText("Cargado " + chooser.getSelectedFile().getAbsolutePath());
            }catch (FileNotFoundException ex){
               JOptionPane.showMessageDialog(this,"Archivo no encontrado!");
            }
        }
    }//GEN-LAST:event_AbrBtActionPerformed

    private void CorBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorBtActionPerformed
        TxtAr.cut();
    }//GEN-LAST:event_CorBtActionPerformed

    private void PegBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegBtActionPerformed
        TxtAr.paste();
    }//GEN-LAST:event_PegBtActionPerformed

    private void CenBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenBtActionPerformed
        alineacion(StyleConstants.ALIGN_CENTER);
    }//GEN-LAST:event_CenBtActionPerformed

    private void RigBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RigBtActionPerformed
        alineacion(StyleConstants.ALIGN_RIGHT);
    }//GEN-LAST:event_RigBtActionPerformed

    private void ArcBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArcBtActionPerformed
        JOptionPane.showMessageDialog(null,"Realizado por:\n Ricardo Castillo CI:19988232\n"
                + "Andrea Urdaneta CI:24956731");
    }//GEN-LAST:event_ArcBtActionPerformed

    private void ResBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResBtActionPerformed
        PalabrasResaervadas obj = new PalabrasResaervadas();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ResBtActionPerformed

    private void SimBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimBtActionPerformed
        Simbolos obj = new Simbolos();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_SimBtActionPerformed

    private void LexBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LexBtActionPerformed
        Lexico obj = new Lexico();
        obj.execute(TxtAr.getText());
    }//GEN-LAST:event_LexBtActionPerformed

    private void ArcBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArcBtMouseClicked
        JOptionPane.showMessageDialog(null,"Realizado por:\n Ricardo Castillo CI:19988232\n"
                + "Andrea Urdaneta CI:24956731");
    }//GEN-LAST:event_ArcBtMouseClicked

    private void SinBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinBtActionPerformed
        Sintactico obj = new Sintactico();
        obj.execute(TxtAr.getText());
    }//GEN-LAST:event_SinBtActionPerformed

    private void SembtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SembtActionPerformed
        semantico obj = new semantico();
        obj.execute(TxtAr.getText());
    }//GEN-LAST:event_SembtActionPerformed

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
            java.util.logging.Logger.getLogger(pantallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrBt;
    private javax.swing.JMenu ArcBt;
    private javax.swing.JButton CenBt;
    private javax.swing.JButton CopBt;
    private javax.swing.JButton CorBt;
    private javax.swing.JMenuItem GuaBt;
    private javax.swing.JButton LefBt;
    private javax.swing.JButton LexBt;
    private javax.swing.JMenuItem NueBt;
    private javax.swing.JButton PegBt;
    private javax.swing.JButton ResBt;
    private javax.swing.JButton RigBt;
    private javax.swing.JMenuItem SalBt;
    private javax.swing.JButton Sembt;
    private javax.swing.JButton SimBt;
    private javax.swing.JButton SinBt;
    private javax.swing.JTextPane TxtAr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
