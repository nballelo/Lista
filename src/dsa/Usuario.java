package dsa;
/**
 * Created by Ignacio on 28/02/2017.
 */
public class Usuario {
    private String nombre;
    private String pass;
    private String mail;

    public Usuario(String nombre,String pass,String mail){
        this.nombre=nombre;
        this.pass=pass;
        this.mail=mail;
    }
    public String getnombre(){return nombre;}
    public String getpass(){return pass;}
    public String getmail(){return mail;}
}
