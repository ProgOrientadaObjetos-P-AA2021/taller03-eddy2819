
package ClaculoHoras;

import horas.EquvalenteHora;

public class Ejecutor {
    public static void main(String[]args){
        EquvalenteHora ep = new EquvalenteHora();
        EquvalenteHora eph = new EquvalenteHora(); 
        int hora = 4;
        ep.establecerHoras(hora);
        
        ep.calcularMinutos();
        ep.calcularSegundos();
        ep.calcularDias();
        
        System.out.println("\nCalculo de horas");
        System.out.printf("Las siguientes  %d horas tienen:\n"
                + "%sd minutos\n"+ "%sd segundos\n"+ "%sd dias\n",
                ep.obtenerHoras(), ep.obtenerMinutos(),
                ep.obtenerSegundos(), ep.obtenerDias());
        System.out.println("\n================================================\n");
        
         int horas = 9;
        eph.establecerHoras(horas);
        
        eph.calcularMinutos();
        eph.calcularSegundos();
        eph.calcularDias();
        
        System.out.println("\nCalculo de horas");
        System.out.printf("Las siguientes  %d horas tienen:\n"
                + "%sd minutos\n"+ "%sd segundos\n"+ "%sd dias\n",
                eph.obtenerHoras(), eph.obtenerMinutos(),
                eph.obtenerSegundos(), eph.obtenerDias());
         
         
        
         
    }
    
}
