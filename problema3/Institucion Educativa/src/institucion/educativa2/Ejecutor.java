
package institucion.educativa2;

import institucion.educativa.AdmiInstEducativas;

public class Ejecutor {
     public static void main(String[]args){
        AdmiInstEducativas ie = new AdmiInstEducativas();
        AdmiInstEducativas ie2 = new AdmiInstEducativas();
        
       ie.establecerNombre("UEFSFA");
        ie.establecerTipoInstitucion("Fiscomisional");
        ie.establecerNumAlumnos(1500);
        ie.establecerNumDocentes(50);
        ie.establecerNumSede(1);
        
        System.out.println("Administracion de Instituciones Educativas");
        System.out.printf("%s - %s - %d - %d\n",ie.obtenerNombre(),
            ie.obtenerTipoInstitucion(),ie.obtenerNumAlumnos(),
            ie.obtenerNumDocentes(),ie.obtenerNumSede());
        
        System.out.println("\n================================================\n");
        
        ie2.establecerNombre("Unidad Educativa Santa Mariana de Jesus");
        ie2.establecerTipoInstitucion("Fiscomisional");
        ie2.establecerNumAlumnos(900);
        ie2.establecerNumDocentes(40);
        ie2.establecerNumSede(1);
        
        System.out.println("Administracion de Instituciones Educativas");
        System.out.printf("%s - %s - %d - %d\n",ie2.obtenerNombre(),
            ie2.obtenerTipoInstitucion(),ie2.obtenerNumAlumnos(),
            ie2.obtenerNumDocentes(),ie2.obtenerNumSede());
        
    }
    
}
