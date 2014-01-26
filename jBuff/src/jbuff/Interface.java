/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jbuff;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JComponent;




/**
 *
 * @author Adam Trojnar
 */
public class Interface extends javax.swing.JFrame {
      static int distance  = 100;
      static int needleSize;
      static int numDrops = 300;
      final int maxNeedleLength = 6;
      final int maxDrops = 0;// 10000;
      final int precision = 0;
      final int floorSideSize = 20;
      final int boardSize = 60;
      final int dropDelay = 0;
      int numOfExperiments = 2;
      int hits;
      double MediumO = 0.0;
       double VarO = 0.0;
      ArrayList<Float> equalOfExperiment = new ArrayList<Float>();
       
      
      
      
      Paint2 p = new Paint2();
      
        
    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        needleSizeSlider = new javax.swing.JSlider();
        distanceSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        delaySlider = new javax.swing.JSlider();
        jButtonGenerate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numDropsSlider = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextMedium = new javax.swing.JTextField();
        jTextFieldVar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Długość igły l");

        needleSizeSlider.setMajorTickSpacing(100);
        needleSizeSlider.setMaximum(25);
        needleSizeSlider.setMinorTickSpacing(1);
        needleSizeSlider.setPaintLabels(true);
        needleSizeSlider.setPaintTicks(true);
        needleSizeSlider.setToolTipText("");
        needleSizeSlider.setValue(1);
        needleSizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                needleSizeSliderStateChanged(evt);
            }
        });

        distanceSlider.setMajorTickSpacing(50);
        distanceSlider.setMaximum(150);
        distanceSlider.setMinimum(50);
        distanceSlider.setMinorTickSpacing(10);
        distanceSlider.setPaintLabels(true);
        distanceSlider.setPaintTicks(true);
        distanceSlider.setSnapToTicks(true);
        distanceSlider.setToolTipText("");
        distanceSlider.setValue(100);
        distanceSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                distanceSliderStateChanged(evt);
            }
        });

        jLabel4.setText("Odległość między liniami d");

        delaySlider.setMajorTickSpacing(2);
        delaySlider.setMaximum(10);
        delaySlider.setMinimum(2);
        delaySlider.setMinorTickSpacing(1);
        delaySlider.setPaintLabels(true);
        delaySlider.setPaintTicks(true);
        delaySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                delaySliderStateChanged(evt);
            }
        });

        jButtonGenerate.setText("Generuj");
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });

        jLabel3.setText("Liczba powtórzeń eksperymentu");

        jLabel2.setText("Liczba rzutów N");

        numDropsSlider.setMajorTickSpacing(200);
        numDropsSlider.setMaximum(1000);
        numDropsSlider.setMinorTickSpacing(1);
        numDropsSlider.setPaintLabels(true);
        numDropsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numDropsSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(numDropsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delaySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numDropsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(delaySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jLabel5.setText("Wartosc liczby π ≈ 3,14159 26535 89793 ");

        jLabel6.setText("Ostatnio obliczona wartosc liczby π =");

        jTextField1.setEditable(false);
        jTextField1.setText("3,14");

        jLabel7.setText("Średnia ze wszystkich eksperymentow:");

        jLabel8.setText("Wariancja ze wszystkich eksperymentow:");

        jTextMedium.setEditable(false);
        jTextMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMediumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addComponent(distanceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(needleSizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jTextMedium)
                                    .addComponent(jTextFieldVar))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(needleSizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distanceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextMedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(p, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
       
       System.out.println("GO!");
       p.setSize(600, 600);
       equalOfExperiment.clear();
      
       jPanel2.add(p);

       repaint();
     

    }//GEN-LAST:event_jButtonGenerateActionPerformed
 

 
    private void distanceSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_distanceSliderStateChanged
       
        distance = distanceSlider.getValue();
       //repaint();
       
       
    }//GEN-LAST:event_distanceSliderStateChanged

    private void needleSizeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_needleSizeSliderStateChanged
    
       needleSize = needleSizeSlider.getValue();
       System.out.println(needleSize);
       //repaint();
    }//GEN-LAST:event_needleSizeSliderStateChanged

    private void numDropsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numDropsSliderStateChanged
        
        numDrops = numDropsSlider.getValue();
        System.out.println(numDrops);
        // repaint();
    }//GEN-LAST:event_numDropsSliderStateChanged

    private void delaySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_delaySliderStateChanged
        numOfExperiments = delaySlider.getValue();
        System.out.println("" + numOfExperiments );
    }//GEN-LAST:event_delaySliderStateChanged

    private void jTextMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMediumActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>



      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interface g = new Interface();
                new Interface().setVisible(true);
               
            }
        });
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider delaySlider;
    private javax.swing.JSlider distanceSlider;
    private javax.swing.JButton jButtonGenerate;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldVar;
    private javax.swing.JTextField jTextMedium;
    private javax.swing.JSlider needleSizeSlider;
    private javax.swing.JSlider numDropsSlider;
    // End of variables declaration//GEN-END:variables

//    private  class JBuffInterface {
//        protected Floor floora;
//
//        public JBuffInterface() {
//        }
//
//        private  JBuffInterface(int floorSideSize, int boardSize, int maxNeedleLength) {
//            floora = new Floor(floorSideSize, floorSideSize, boardSize, 10);
//            //Container contentPane = Interface.getContentPane();
//            jPanel1.add(floora);
//        }
//    }

    private  class Paint2 extends JComponent {
        Needle n;
	Random gen = new Random();
        
        
        public Paint2() {
            this.n = new Needle();
//		addMouseListener(new Click());
        }
        
//        class Click implements MouseListener {
//
//		@Override
//		public void mouseClicked(MouseEvent arg0) {
//			repaint();
//		}
//		public void mouseEntered(MouseEvent arg0) {}
//		public void mouseExited(MouseEvent arg0) {}
//		public void mousePressed(MouseEvent arg0) {}
//		public void mouseReleased(MouseEvent arg0) {}
//	}
//        
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            
            
            //System.out.println(Interface.getDistance() );
            
                  
                Rectangle2D outline = new Rectangle2D.Double(0,0, 599, 300);  
                g2.setPaint(Color.blue);
		g2.drawLine(0, 10, 669, 10);
                g2.drawLine(0, distance, 669, distance);
                g2.drawLine(0, 2*distance-10, 669, 2*distance-10);

                g2.draw(outline);
		
            //petla
            for(int j = 0 ; j< numOfExperiments ; j++){
                     float Sum = 0;
                     double MediumO = 0.0;
                     double VarO = 0.0;
                            for(int i=0; i<numDrops; i++){  
                                int xVal = gen.nextInt(600);
                                n.drop();
                                double x2 = xVal + (Math.cos(Math.toRadians(n.angle))*100 );
                                Line2D needle = new Line2D.Double(xVal, 2*distance-(n.ylow*50), x2, 2*distance-(n.yhigh*50));        
                                    if (needle.intersectsLine(0, 10, 669, 10) || needle.intersectsLine(0, distance, 669, distance) || needle.intersectsLine(0, 2*distance-10, 669, 2*distance-10)  ) {
                                        hits++;
                                        g2.setPaint(yellow);      
                                    } else{
                                        g2.setPaint(Color.red);
                                    } 
                                g2.draw(needle);
                                }
                                    if(hits>0){
                                        Sum = ((float)numDrops/(float)hits - 1);
                                        jTextField1.setText(" "+ Sum );
                                        equalOfExperiment.add(Sum);
                                        hits = 0;
                                    }

                     for(int i = 0; i < equalOfExperiment.size(); i++ ){ //suma
                        MediumO+=equalOfExperiment.get(i);
                     }
                     MediumO = abs(MediumO/(equalOfExperiment.size())); //liczymy średnią
                    jTextMedium.setText(""+MediumO);

                     for(int i = 0; i < equalOfExperiment.size(); i++ ){ //suma
                        VarO+=pow((equalOfExperiment.get(i) - MediumO) , 2);
                    }
                    System.out.println("Var = " + VarO);
                    System.out.println("equalOfExperiment = " + equalOfExperiment.size());
                    VarO = VarO / equalOfExperiment.size();
                    jTextFieldVar.setText("" + VarO);
                    //System.out.println("-----------------------------------------");
             }             
        }
         
    }
}
