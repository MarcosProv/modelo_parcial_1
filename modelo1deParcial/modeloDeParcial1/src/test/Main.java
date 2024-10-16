
package test;

import model.Servicio;


public class Main {
 public static void main(String[] args) {
     
        System.out.println("1-1");
        Servicio mantenimiento = new Servicio("8978323",15.0,"Mantenimiento máquina decortar pasto",2500.0, true);
        
        System.out.println(mantenimiento);
        
        System.out.println("1-2");
        //codMercancia=8973231, servicio=Mantenimiento máquina de cortar pasto, presupuesto=2500.0, porcentajeDescuento=15.0, enPromocion=true.
    } 
}
