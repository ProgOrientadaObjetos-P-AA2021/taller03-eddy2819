
package institucion.educativa;

public class AdmiInstEducativas {
    private String nombre;
    private String tpiinstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSede;
    
    public void establecerNombre(String c){
        nombre = c;
        
    }
    public void establecerTipoInstitucion(String c){
        tpiinstitucion = c;
    }
    public void establecerNumAlumnos(int c){
        numAlumnos = c;
     
    }
    public void establecerNumDocentes(int c){
        numDocentes = c;
        
    }
    public void establecerNumSede(int c){
        numSede = c;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoInstitucion(){
        return tpiinstitucion;
        
    }
    public int obtenerNumAlumnos(){
        return numAlumnos;
    }
    public int obtenerNumDocentes(){
        return numDocentes;
    }
    public int obtenerNumSede(){
        return numSede;
    }
    
}
