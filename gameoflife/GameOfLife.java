package gameoflife;
import java.awt.Color;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.SwingUtilities;



/**
 *
 * @author abhinavdv
 */
public class GameOfLife extends JFrame {
    
     int widthofbox = 50;                                                       //intitialize the no. of rows and columns your jframe2 will contain
     int heightofbox = 50;                                                
    boolean[][] presentstate = new boolean[heightofbox][widthofbox];            //initializing two boolean 2D arrays for for storing present state sand next state of the grid
    boolean[][] nextstate = new boolean[heightofbox][widthofbox];               
    boolean runningstate;                                                       //used to tell if the play button is turned on or not
    Image beforeDrawing;                                                        // initialize an image and graphics to create and write on an image
    Graphics beforeDrawingGraphics;
    
    public GameOfLife() {
        initComponents();
        beforeDrawing = createImage(jPanel2.getWidth(),jPanel2.getHeight());    //intanstiating a new Image
        beforeDrawingGraphics = beforeDrawing.getGraphics();                    //instantiating graphics for the image
        Timer time = new Timer();                                               //instantiating a new timer
        TimerTask task = new TimerTask() {                                      //timertask  defines tasks which can be be repeated for  given number of times
            public void run(){                                                  
                if(runningstate) {                                              //Do only if running state is 1
                for(int i=0; i < heightofbox ; i++){
                    for(int j=0; j < widthofbox ; j++){                         //On each cell in the grid, check on or off and store in the next state
                        nextstate[i][j] = onOrOff(i, j);
                    } 
                }
                for(int i=0; i < heightofbox ; i++){
                    for(int j=0; j < widthofbox ; j++){
                        presentstate[i][j] = nextstate[i][j];
                    } 
                }
                restart();
                }

            }
        };
        time.scheduleAtFixedRate(task, 0, 50);                                 //initialdelay = 0, 100ms delay between sucessive executions 
        restart();
    }
    private boolean onOrOff(int i, int j){
        int alive;
        alive = 0;              
        if(j>0){
            if(presentstate[i][j-1]) {
                alive++;
            } 
            if(i>0){
                if(presentstate[i-1][j-1])
                alive++;   
            }
            if(i<heightofbox-1){
                if(presentstate[i+1][j-1])
                    alive++;
            }
        }
        
        if(j<widthofbox-1){
            if(presentstate[i][j+1])
                alive++;
            if(i>0){
                if(presentstate[i-1][j+1])
                alive++;   
            }
            if(i<heightofbox-1){
                if(presentstate[i+1][j+1])
                    alive++;
            }
        }
        if(i>0){
                if(presentstate[i-1][j])
                alive++; 
        }
        if(i<heightofbox-1){
                if(presentstate[i+1][j])
                alive++;
            }
    
        if(alive == 3){
            return true;
        }
        if(presentstate[i][j]==true && alive==2)
            return true;
        return false;
    
    
    
    
    }

    private void restart(){
        beforeDrawingGraphics.setColor(jPanel2.getBackground());
        beforeDrawingGraphics.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        for(int i=0;i<heightofbox;i++){
            for(int j=0; j<widthofbox; j++){
                if(presentstate[i][j]){
                    beforeDrawingGraphics.setColor(Color.YELLOW);
                    int y = i* jPanel2.getHeight()/heightofbox; 
                    int x = j* jPanel2.getWidth()/widthofbox;
                    beforeDrawingGraphics.fillRect(x, y, jPanel2.getWidth()/widthofbox, jPanel2.getHeight()/heightofbox);
                }
            }
        }
        
        
        beforeDrawingGraphics.setColor(Color.WHITE);
        for(int i=1;i< heightofbox; i++){
            int y = i* jPanel2.getHeight()/heightofbox; 
            beforeDrawingGraphics.drawLine(0, y, jPanel2.getWidth(), y);
        
        }
        for(int j=1;j< widthofbox; j++){
            int x =j* jPanel2.getWidth()/widthofbox;
            beforeDrawingGraphics.drawLine(x, 0, x, jPanel2.getHeight());
        
        }

        
        
        jPanel2.getGraphics().drawImage(beforeDrawing, 0, 0, jPanel2);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(58, 27, 94));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jButton3.setText("Pause");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 393, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               runningstate = !runningstate;
        if(runningstate)
            jButton1.setText("Pause");
        else
            jButton1.setText("Play");
        restart();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        presentstate = new boolean[heightofbox][widthofbox];
        restart();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentResized
        beforeDrawing = createImage(jPanel2.getWidth(),jPanel2.getHeight());
        beforeDrawingGraphics = beforeDrawing.getGraphics();
        restart();
    }//GEN-LAST:event_jPanel2ComponentResized

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        int j =widthofbox * evt.getX() / jPanel2.getWidth();
        int i =heightofbox * evt.getY() / jPanel2.getHeight();
        presentstate[i][j]=!presentstate[i][j];
        restart();

    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        presentstate = new boolean[heightofbox][widthofbox];
        restart();
    }//GEN-LAST:event_jButton3MouseClicked
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int j = widthofbox * evt.getX() / jPanel1.getWidth();
        int i = heightofbox * evt.getY() / jPanel1.getHeight();
        if(SwingUtilities.isLeftMouseButton(evt)){
            presentstate[i][j] = true;
        }else presentstate[i][j] = false;
        restart();
    }//GEN-LAST:event_jPanel1MouseDragged
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
            java.util.logging.Logger.getLogger(GameOfLife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOfLife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOfLife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOfLife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameOfLife().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
