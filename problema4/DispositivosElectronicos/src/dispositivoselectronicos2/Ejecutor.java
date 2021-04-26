
package dispositivoselectronicos2;

import dispositivoselectronicos.CaracterristicasDisElec;

public class Ejecutor {

    public static void main(String[] arg) {
        CaracterristicasDisElec ce = new CaracterristicasDisElec();
        CaracterristicasDisElec cde = new CaracterristicasDisElec();

        ce.establecerSistemaOperativo("Android");
        ce.establecerTamañoPantalla("02.340 x 1.080");
        ce.establecerDireccionMac("0001f5:55f77d");
        ce.establecerInformacionIMEI("114557789992");
        ce.establecerCosto(963.2);

        System.out.println("\nCaracteristicas de un Celular");
        System.out.printf("Sistema operativo es: %sf\n"
                + "Tamaño de la pantalla es: %s\n"
                + "su costo es: %sf" + "f$\n"
                + "Direccion MAC es: %s\n"
                + "Informacion IMEI es: %s\n", ce.obtenerSistemaOperativo(),
                ce.obtenerTamañoPantalla(), ce.obtenerDireccionMac(),
                ce.obtenerInformacionIMEI());
        System.out.println("\n================================================\n");

        cde.establecerSistemaOperativo("ios");
        cde.establecerTamañoPantalla("02.340 x 1.080");
        cde.establecerDireccionMac("2236:jk55y899");
        cde.establecerInformacionIMEI("254796632110");
        cde.establecerCosto(1240);

        System.out.println("\nCaracteristicas de un Celular");
        System.out.printf("Sistema operativo es: %s\n"
                + "Tamaño de la pantalla es: %s\n"
                + "su costo es: %sf" + "f$\n"
                + "Direccion MAC es: %s\n"
                + "Informacion IMEI es: %s\n", cde.obtenerSistemaOperativo(),
                cde.obtenerTamañoPantalla(), cde.obtenerDireccionMac(),
                cde.obtenerInformacionIMEI());

    }

}
