
package ejercicio1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plago-bergonpazos
 */
public class Ejercicio1 extends Thread {
    
    public Ejercicio1(String str){
        super(str);
    }
    //Thread
    @Override
    public void run(){
        //Número ramdom
        int y = (int) (Math.random()*3000+2000);
        for( int i = 0; i<11; i++){
            System.out.println(i+" "+getName());
            try {
                Thread.sleep(y);
            } catch (InterruptedException ex) {
                
            }
        }
        System.out.println("Se acabo la ejecución del thread de "+getName());
       }
    //Main
    public static void main(String[] args) {
        //Creación de hilos
        new Ejercicio1("Pablo").start();
        new Ejercicio1("Javier").start();
    }
    
}
