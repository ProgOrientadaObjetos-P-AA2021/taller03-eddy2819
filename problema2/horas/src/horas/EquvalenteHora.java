
package horas;

public class EquvalenteHora {
    private int horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    
    public void establecerHoras(int l){
        horas = l;
    }
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    public void calcularSegundos(){
        segundos = horas * 3600;
        
    }
    public void calcularDias(){
        dias = horas / 24;
    }
    
    public int obtenerHoras(){
        return horas;
    }
    public double obtenerMinutos(){
        return minutos;
    }
    public double obtenerSegundos(){
        return segundos;
    }
    public double obtenerDias(){
        return dias;
    }

   
}
