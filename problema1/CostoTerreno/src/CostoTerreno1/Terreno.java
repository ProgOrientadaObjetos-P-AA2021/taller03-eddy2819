
package CostoTerreno1;

public class Terreno {
    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMcuadrado;
    
  
    public void establecerAncho(double c){
        ancho = c;   
    }
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerValorMCuadrado(double c){
        valorMcuadrado = c;    
    } 
    public void calcularArea(){
        area = largo * ancho;
    }
    public void establecerCosto(){
        costo = area * valorMcuadrado;
    }
   
    
   
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerlargo(){
        return largo;
    }
    public double obtenerValorMCuadrado(){
        return valorMcuadrado;
    }
    public double obtenerCosto(){
        return costo;
    }
    public double obtenerArea(){
        return area;
    }
}
