
package client_side;


public class Client_Side {

    public static void main(String[] args) {
       
        Log_In L = new Log_In();
        
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                L.setVisible(true);
            }
        });
        
        
        
    }
    
}
