/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter3;

/**
 *
 * @author hp
 */
public class Adapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Micro micro=new Micro();
        Typec charge=new Adapterforcharge(micro);
        micro.chargemicro();
        charge.ChargeTypeC();
        
        
        
    }
    
}
