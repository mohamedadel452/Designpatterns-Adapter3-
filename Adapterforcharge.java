/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter3;

/**
 *
 * @author hp
 */
public class Adapterforcharge implements Typec{

    Micro Micro;

    public Adapterforcharge(Micro Micro) {
        this.Micro = Micro;
    }
    
    
    @Override
    public void ChargeTypeC() {
        System.out.println("charge normaly");
        Micro.chargemicro();
    }
    
}
