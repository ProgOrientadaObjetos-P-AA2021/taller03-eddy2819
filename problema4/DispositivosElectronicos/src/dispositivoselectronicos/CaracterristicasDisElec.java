
package dispositivoselectronicos;

public class CaracterristicasDisElec {
    private String SI;
    private String tampantalla;
    private double costo;
    private String direcmac;
    private String infIMEI;
    
    public void establecerSistemaOperativo(String p){
        SI = p;
    }
    public void establecerTamañoPantalla(String p){
        tampantalla = p;
    }
    public void establecerCosto(double p){
        costo = p;
    }
    public void establecerDireccionMac(String p){
        direcmac = p;
    }
    public void establecerInformacionIMEI(String p){
        infIMEI = p;
    }
    
    public String obtenerSistemaOperativo(){
        return SI;
    }
    public String obtenerTamañoPantalla(){
        return tampantalla;
    }
    
    public double obtenerCosto(){
        return costo;
    }
    
    public String obtenerDireccionMac(){
        return direcmac;
    }
    
    public String obtenerInformacionIMEI(){
        return infIMEI;
    }
}
