
package calculo;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        /**/
        splash_screen sc=new splash_screen();
        sc.setVisible(true);
        Thread.sleep(3*1000);
        sc.dispose();
        Home home =new Home();
        home.setVisible(true);
    }
    
}
