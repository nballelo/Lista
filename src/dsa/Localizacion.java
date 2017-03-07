package dsa;

/**
 * Created by Ignacio on 07/03/2017.
 */
public class Localizacion {
    private double latitud,longitud;
    public Localizacion(double latitud,double longitud){
        this.latitud=latitud;
        this.longitud=longitud;
    }
    public double getLatitud(){
        return latitud;
    }
    public double getLongitud(){
        return longitud;
    }
}
