
package costoterreno2;

import CostoTerreno1.Terreno;

public class Ejecutor {

    public static void main(String[] args) {
        Terreno ti = new Terreno();
        Terreno ti2 = new Terreno();

        double ancho = 30;
        double largo = 20;
        double valor = 10;

        ti.establecerAncho(ancho);
        ti.establecerLargo(largo);
        ti.establecerValorMCuadrado(valor);

        ti.calcularArea();
        ti.establecerCosto();

        System.out.printf("Precio de un terreno\n\nAncho: %s\n" + "Largo:"
                + "%2f\nvalor por metro cuadrado: %2f\n" + "Area: %2f\nCosto Total"
                + ":2f\n", ti.obtenerAncho(), ti.obtenerlargo(),
                 ti.obtenerValorMCuadrado(), ti.obtenerArea(), ti.obtenerCosto());
        System.out.println("\n================================================\n");
        
        double ancho2 = 50;
        double largo2 = 80;
        double valor2 = 15;

        ti2.establecerAncho(ancho2);
        ti2.establecerLargo(largo2);
        ti2.establecerValorMCuadrado(valor2);

        ti2.calcularArea();
        ti2.establecerCosto();

        System.out.printf("Precio de un terreno\n\nAncho: %sd\n" + "Largo:"
                + "%2f\nvalor por metro cuadrado: %2f\n" + "Area: %2f\nCosto Total"
                + ":2f\n", ti2.obtenerAncho(), ti2.obtenerlargo(),
                 ti2.obtenerValorMCuadrado(), ti2.obtenerArea(), ti2.obtenerCosto());
        

    }

}
