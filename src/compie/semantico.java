/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compie;

/**
 *
 * @author PrinterU
 */
public class semantico extends javax.swing.JFrame {

    /**
     * Creates new form semantico
     */
    public semantico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(semantico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(semantico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(semantico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(semantico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new semantico().setVisible(true);
            }
        });
    }
    String salida;
    void execute(String txt)
    {
        this.setVisible(true);
        salida = "";
        txt = quitarComentarios(txt);
	verificarInicoYFin(txt);
	verificarNombrePrograma(txt);
	mostrar();
    }
     
    public void mostrar(){
	if(salida.equals(""))
	{   jTextArea1.setText("Sin errores semantico");
	}
	else{
	jTextArea1.setText(salida);
	}
    }
    
    public void verificarInicoYFin(String contenido){
	String conte = quitarNombre(contenido).replaceFirst("programa","").replace(" ","").replace("\n","");
	if(!contenido.contains("inicio")){
	    salida+="falta sentencia \"inicio\"\n";
	}
	    else{
		    if(!conte.startsWith("inicio"))
		    {   salida+="contenido antes de sentencia \"inicio\"\n";
		    }
	    }
	if(!contenido.replace("mmattfin","").contains("fin")){
	    salida+="falta sentencia \"fin\"\n";
	    
	}
	    else{
		    if(!conte.replace("mmattfin","").endsWith("fin"))
		    {   salida+="contenido despues de sentencia \"fin\"\n";
		    }
	    }
    }
    
    public void verificarNombrePrograma(String contenido){
	contenido = contenido.replace(" ","").replace("\n","");
	if(contenido.contains("programa")){
	    if(!contenido.startsWith("programa"))
	    {	salida+="declaracion del nombre del programa fuera de lugar\n";
	    }
	}
	else{	salida+="declaracion del nombre del programa inexistente\n";
	}
    }
    
    
    
    
    public String quitarNombre(String contenido){
	int posNombre = contenido.indexOf("programa");
        String part1 = contenido.substring(0,(posNombre+8));
        String part2 = contenido.substring(contenido.indexOf("\n",posNombre)+1,contenido.length());
        return part1+part2; 
    }
    
    public String quitarComentarios(String contenido)
    {
	String commentario = "\\\\";
        String inicio_commentario= "\\*";
        String fin_commentario = "*\\";
        int pos = 0;
        while(pos != -1){
            pos = contenido.indexOf(commentario);
            if(pos != -1){
                int pos2 = contenido.indexOf("\n", pos);
                if(pos2 == -1){
                    contenido = contenido.substring(0, pos);
                    continue;
                }
                String inico = contenido.substring(0, pos);
                String fin = contenido.substring(pos2, contenido.length());
                contenido = inico + fin;
                continue;
            }
            pos = contenido.indexOf(inicio_commentario);
            if(pos != -1){
                int pos2 = contenido.indexOf(fin_commentario, pos);
                if(pos2 == -1){
                    contenido = contenido.substring(0, pos);
                    continue;
                }else{
                    String inicio = contenido.substring(0, pos);
                    String fin = contenido.substring(pos2+2, contenido.length());
                    contenido = inicio + fin;
                    continue; 
                }
                
            }
        }
	return contenido;
      } 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
