/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import static org.jfree.chart.demo.PieChartDemo1.createDemoPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.function.Function2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;
import org.nfunk.jep.JEP;

/**
 *
 * @author DELL
 */
public class Aplicaciones extends javax.swing.JDialog {

    /**
     * Creates new form Aplicaciones
     */
     private String expresion;
     private double acumulador=0.01;
     JEP jep;//este es el objeto para el anlizis dela sintaxis
     JEP jep2;
    public Aplicaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Aplicaciones de Derivadas");
        //mostrar_grafico();
        
    }

    private Aplicaciones(String function_Demo_1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void mostrar_grafico(){
        JPanel chartPanel = createDemoPanel();
        chartPanel.setPreferredSize(new java.awt.Dimension(1125,550));
        //setContentPane(chartPanel);
        this.Panel_graficos.setLayout(new java.awt.BorderLayout());
        this.Panel_graficos.add(chartPanel,BorderLayout.CENTER);
        this.Panel_graficos.validate();
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
        jLabel1 = new javax.swing.JLabel();
        txt_funcion1 = new javax.swing.JTextField();
        txt_funcion_2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Panel_graficos = new javax.swing.JPanel();
        txt_tiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funcion 1");

        txt_funcion1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_funcion1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_funcion_2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_funcion_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setBackground(new java.awt.Color(81, 156, 254));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Graficar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Funcion 2");

        Panel_graficos.setBackground(new java.awt.Color(255, 255, 255));
        Panel_graficos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel_graficosLayout = new javax.swing.GroupLayout(Panel_graficos);
        Panel_graficos.setLayout(Panel_graficosLayout);
        Panel_graficosLayout.setHorizontalGroup(
            Panel_graficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1133, Short.MAX_VALUE)
        );
        Panel_graficosLayout.setVerticalGroup(
            Panel_graficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        txt_tiempo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_tiempo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tiempo en segundos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_funcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(txt_funcion_2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txt_tiempo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Panel_graficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_graficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_funcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_funcion_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            mostrar_grafico();
            //capturamos el valor del tiempo
            
            /*double time=Double.parseDouble(this.txt_tiempo.getText());
            XYSeries obj1=new XYSeries("Objeto1");
            
            for(double x=0.0;x<time;x++){
                obj1.add(x,f1(x));
                
            }
            
            //agregamos el 2do grafico
            XYSeries obj2=new XYSeries("Objeto2");
            for(double x=0.0;x<time;x++){
                obj2.add(x,f2(x));
                
            }
            //creamos el grafico
            XYSeriesCollection dataset=new XYSeriesCollection();
            dataset.addSeries(obj1);
            dataset.addSeries(obj2);
            
            JFreeChart xylineChart =ChartFactory.createXYLineChart("Aplicaciones de Derivadas","Objeto 1","Objeto 2",dataset,PlotOrientation.VERTICAL,true,true,false);
            
            XYPlot plot =xylineChart.getXYPlot();
            
            XYLineAndShapeRenderer renderer =new XYLineAndShapeRenderer ();
            renderer.setSeriesPaint(0,Color.RED);
            renderer.setSeriesPaint(1,Color.BLUE);
            renderer.setSeriesStroke(0,new BasicStroke(4.0f));
            renderer.setSeriesStroke(1,new BasicStroke(3.0f));
            
            plot.setRenderer(renderer);
            ChartPanel panel=new ChartPanel(xylineChart);
            
            
            this.Panel_graficos.add(panel);
        
       
        
        
        //agregamos los objetos
       mostrar_grafico();
        /*expresion=this.txt_funcion1.getText().trim();
        if(expresion.isEmpty()){
            JOptionPane.showMessageDialog(null,"no se admiten campos nulos");
        }else{
            XYDataset paresDeDatos = generarDatos();
            JFreeChart diagrama = crearDiagrama(paresDeDatos);
            ChartPanel chartPanel = new ChartPanel(diagrama);
            chartPanel.setPreferredSize(new Dimension(900,700));

            //setContentPane(chartPanel);
            chartPanel.setMouseWheelEnabled(true);
            //agregamos el grafico al panel
            this.Panel_graficos.setLayout(new java.awt.BorderLayout());
            this.Panel_graficos.add(chartPanel,BorderLayout.CENTER);
            this.Panel_graficos.validate();
            this.setLocationRelativeTo(null);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //local
    private JFreeChart crearDiagrama(XYDataset conjuntoDatos){
        JFreeChart diag = ChartFactory.createXYLineChart(
                                "Grafico", //Titulo Grafica
                                "X", // Leyenda eje X
                                "Y", // Leyenda eje Y
                                conjuntoDatos, // Los datos
                                PlotOrientation.VERTICAL, //orientacion
                                
                                false, // ver titulo de linea
                                false, //tooltips
                                false  //URL
                            );                    
        return diag;
    }
    private XYDataset generarDatos(){//local
        //le pasamos una funcion generadora f(x)
        XYSeries datos = new XYSeries("Linea Funcion");
        for(double x=0.0; x<=50.0; x+=0.2) datos.add(x,f1(x));

        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
        conjuntoDatos.addSeries(datos);

        return conjuntoDatos;
    }
     private double f1(double x){//funcion
         double resultado;
        jep = new JEP();
        expresion=this.txt_funcion1.getText();
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.addVariable("x",x);
        this.jep.parseExpression(expresion);
        resultado = this.jep.getValue();
        return resultado;
    }
    private double f2(double x){//funcion secundaria
         double resultado;
        String expresion2=this.txt_funcion_2.getText();
        jep2 = new JEP();
        
        this.jep2.addStandardFunctions();
        this.jep2.addStandardConstants();
        this.jep2.addVariable("x",x);
        this.jep2.parseExpression(expresion2);
        resultado = this.jep2.getValue();
        return resultado;
    }
    //-----------------------------------------------------------------------
    private static XYDataset createDataset1() {//Rojo
        
        Function2D f1 = new Function2D() {
            public double getValue(double x){
                
                return (x*x)/(1/x-3*x);
            }  
        };
        return DatasetUtilities.sampleFunction2D(f1,-8.0, 2, 8, 
                "f1");
    }
    
    /**
     * Creates a dataset containing the second function.
     * 
     * @return The dataset.
     */
    private static XYDataset createDataset2() {//azul
  
        Function2D f2 = new Function2D() {
            public double getValue(double x) {
                return Math.cos(x);
            }  
        };
        return DatasetUtilities.sampleFunction2D(f2, -8,2,8, 
                "f2");
    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the data for the chart.
     * 
     * @return a chart.
     */
    private static JFreeChart createChart(XYDataset dataset1, 
            XYDataset dataset2) {
        
        // create the chart...
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Aplicaciones de Derivadas",      // chart title
            "X",                      // x axis label
            "Y",                      // y axis label
            dataset1,                  // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(Color.white);
        
        // get a reference to the plot for further customisation...
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setDataset(1, dataset2);
        plot.setBackgroundPaint(Color.lightGray);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        XYLineAndShapeRenderer renderer 
            = (XYLineAndShapeRenderer) plot.getRenderer();
        renderer.setShapesVisible(false);
        
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer(true, 
                false);
        plot.setRenderer(1, renderer2);
        
        // change the auto tick unit selection to integer units only...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.
                
        return chart;
        
    }

    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset1(), createDataset2());
        return new ChartPanel(chart);
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
            java.util.logging.Logger.getLogger(Aplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Aplicaciones dialog = new Aplicaciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Panel_graficos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_funcion1;
    private javax.swing.JTextField txt_funcion_2;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables
}
