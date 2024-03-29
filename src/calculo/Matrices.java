/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Matrices extends javax.swing.JDialog {

    /**
     * Creates new form Matrices
     */
    int contador_estado_matriz = 0;

    public Matrices(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Matrices");
        //obtenemos el modelo de la matriz principal

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_add_fila = new javax.swing.JButton();
        btn_eliminar_fila = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_matriz_resultado = new javax.swing.JTable();
        btn_rotar = new javax.swing.JButton();
        btn_trasladar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_matriz_original = new javax.swing.JTable();
        btn_escalar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_add_fila.setBackground(new java.awt.Color(94, 23, 235));
        btn_add_fila.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_add_fila.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_fila.setText("Add fila");
        btn_add_fila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_filaActionPerformed(evt);
            }
        });

        btn_eliminar_fila.setBackground(new java.awt.Color(94, 23, 235));
        btn_eliminar_fila.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_eliminar_fila.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_fila.setText("Eliminar");
        btn_eliminar_fila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_filaActionPerformed(evt);
            }
        });

        tbl_matriz_resultado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tbl_matriz_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Eje X", "Eje Y"
            }
        ));
        tbl_matriz_resultado.setRowHeight(22);
        jScrollPane2.setViewportView(tbl_matriz_resultado);

        btn_rotar.setBackground(new java.awt.Color(94, 23, 235));
        btn_rotar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_rotar.setForeground(new java.awt.Color(255, 255, 255));
        btn_rotar.setText("Rotar");
        btn_rotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotarActionPerformed(evt);
            }
        });

        btn_trasladar.setBackground(new java.awt.Color(94, 23, 235));
        btn_trasladar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_trasladar.setForeground(new java.awt.Color(255, 255, 255));
        btn_trasladar.setText("Trasladar");
        btn_trasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trasladarActionPerformed(evt);
            }
        });

        tbl_matriz_original.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tbl_matriz_original.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Eje X", "Eje Y"
            }
        ));
        tbl_matriz_original.setRowHeight(22);
        jScrollPane1.setViewportView(tbl_matriz_original);

        btn_escalar.setBackground(new java.awt.Color(94, 23, 235));
        btn_escalar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_escalar.setForeground(new java.awt.Color(255, 255, 255));
        btn_escalar.setText("Escalar");
        btn_escalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escalarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btn_add_fila)
                                .addGap(18, 18, 18)
                                .addComponent(btn_eliminar_fila))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_escalar)
                                .addGap(26, 26, 26)
                                .addComponent(btn_rotar)
                                .addGap(26, 26, 26)
                                .addComponent(btn_trasladar)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_fila)
                    .addComponent(btn_eliminar_fila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_rotar)
                    .addComponent(btn_trasladar)
                    .addComponent(btn_escalar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_filaActionPerformed
         // TODO add your handling code here:}
        //agregar fila a la matriz principal
        DefaultTableModel model = (DefaultTableModel) this.tbl_matriz_original.getModel();
        model.addRow(new Object[]{"", "", ""});

    }//GEN-LAST:event_btn_add_filaActionPerformed

    private void btn_eliminar_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_filaActionPerformed
        // TODO add your handling code here:
        //capturamos el modelo de la matriz principal 
        DefaultTableModel model = (DefaultTableModel) this.tbl_matriz_original.getModel();
        int filas = model.getRowCount();//obtenemos la cantidad de filas que tiene la matriz
        //lo metemos en un trycatch para la validacion de excepction
        try {
            model.removeRow(filas - 1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ya no quedan filas que eliminar\nError:" + ex);
        }


    }//GEN-LAST:event_btn_eliminar_filaActionPerformed

    private void btn_escalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escalarActionPerformed
        // TODO add your handling code here:
        //btn escalar
        
        if (contador_estado_matriz != 0) {
            this.tbl_matriz_resultado.removeAll();
        }
        String escala = "";//esta variable guarda el escalar

        while (escala.isEmpty()) {//validamo si la variable esta bacia
            escala = JOptionPane.showInputDialog("Inserta un escalar");
        }
        int escalar = Integer.parseInt(escala);//hacemos un parseo de la variable
        //gualamos la matriz principal con la matriz resultado
        igualar_tamaño_matrices();//este metodo iguala de tamaño las matrices
        //llamamos al metodo escalar
        int filas = this.tbl_matriz_original.getRowCount();//obtenemos cuantas filas tiene la matriz original
        escalar(filas, escalar);//llamamos al metodo escalar
        contador_estado_matriz++;
    }//GEN-LAST:event_btn_escalarActionPerformed

    private void btn_rotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotarActionPerformed
        // TODO add your handling code here:
        if (contador_estado_matriz != 0) {
            this.tbl_matriz_resultado.removeAll();
        }
        //boton para rotar la matriz
        String ANGULO = "";
        while (ANGULO.isEmpty()) {
            ANGULO = JOptionPane.showInputDialog("Inserta el angulo para rotar ");
        }
        try {
            int angulo = Integer.parseInt(ANGULO);
            int filas = this.tbl_matriz_original.getRowCount();
            igualar_tamaño_matrices();//igualamos el tamaño de las matrices
            //llamamos al metodo para rotar
            rotar(angulo, filas);
            contador_estado_matriz++;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un Error , Intenta de nuevo " + ex);
        }

    }//GEN-LAST:event_btn_rotarActionPerformed

    private void btn_trasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trasladarActionPerformed
        // TODO add your handling code here:
        if (contador_estado_matriz != 0) {
            this.tbl_matriz_resultado.removeAll();
        }
        String X = "";
        String Y = "";
        while (X.isEmpty()) {
            X = JOptionPane.showInputDialog("Trasladar en X");
        }
        while (Y.isEmpty()) {
            Y = JOptionPane.showInputDialog("Trasladar en Y");
        }

        try {
            int trasladar_X = Integer.parseInt(X);
            int trasladar_Y = Integer.parseInt(Y);
            //mandamos a llamar el metodo de traslacion
            igualar_tamaño_matrices();
            trasladar(trasladar_X, trasladar_Y);
            contador_estado_matriz++;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un Error , Intenta de nuevo " + ex);
        }

    }//GEN-LAST:event_btn_trasladarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void limpiar_matriz() {
        int filas = this.tbl_matriz_resultado.getRowCount();

        for (int i =0; i < 0; i++) {
            this.tbl_matriz_resultado.remove(i);
        }
    }

    public void trasladar(int x, int y) {//guardamos las coordenadas a mover
        int filas = this.tbl_matriz_original.getRowCount();
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    this.tbl_matriz_resultado.setValueAt(Integer.parseInt(this.tbl_matriz_original.getValueAt(i, j).toString()) + x, i, j);
                } else {
                    this.tbl_matriz_resultado.setValueAt(Integer.parseInt(this.tbl_matriz_original.getValueAt(i, j).toString()) + y, i, j);
                }

            }
        }
    }

    public void rotar(int angulo_rotacion, int filas) {
        float[][] matriz_rotacion = new float[2][2];//declaramos la matriz con la que se rota
        float[][] matriz_usuario = new float[this.tbl_matriz_original.getRowCount()][2];
        float[][] matriz_resultado = new float[this.tbl_matriz_original.getRowCount()][2];
        float coseno = (float) Math.cos(Math.toRadians(angulo_rotacion));
        float seno = (float) Math.sin(Math.toRadians(angulo_rotacion));
        matriz_rotacion[0][0] = coseno;
        matriz_rotacion[0][1] = seno * -1;
        matriz_rotacion[1][0] = seno;
        matriz_rotacion[1][1] = coseno;
        //primero guardamos los datos de la matriz en una matriz local
        //comenzamos a rotar la matriz
        for (int i = 0; i < this.tbl_matriz_original.getRowCount(); i++) {
            for (int j = 0; j < 2; j++) {
                //pasamos los datos del jtable  a la matriz
                matriz_usuario[i][j] = Float.parseFloat(this.tbl_matriz_original.getValueAt(i, j).toString());
            }
        }
        //rotamos la matriz 
        for (int i = 0; i < this.tbl_matriz_original.getRowCount(); i++) {

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matriz_resultado[i][j] += matriz_usuario[i][k] * matriz_rotacion[k][j];
                }
            }
        }
        //mostramos la matriz rotada en el jtable
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < 2; j++) {

                this.tbl_matriz_resultado.setValueAt(matriz_resultado[i][j], i, j);//mostramos la matriz resultado

            }
        }

    }

    public void escalar(int filas, int escalar) {
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < 2; j++) {

                this.tbl_matriz_resultado.setValueAt(Integer.parseInt(
                this.tbl_matriz_original.getValueAt(i, j).toString()) * escalar, i, j);

            }
        }
    }

    public void igualar_tamaño_matrices() {
        DefaultTableModel modelPrincipal = (DefaultTableModel) this.tbl_matriz_original.getModel();
        DefaultTableModel modelResultado = (DefaultTableModel) this.tbl_matriz_resultado.getModel();

        int filas = modelPrincipal.getRowCount();
        for (int i = 0; i < filas; i++) {

            modelResultado.addRow(new Object[]{"", "", ""});
        }
    }

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
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Matrices dialog = new Matrices(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_fila;
    private javax.swing.JButton btn_eliminar_fila;
    private javax.swing.JButton btn_escalar;
    private javax.swing.JButton btn_rotar;
    private javax.swing.JButton btn_trasladar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbl_matriz_original;
    public javax.swing.JTable tbl_matriz_resultado;
    // End of variables declaration//GEN-END:variables
}
