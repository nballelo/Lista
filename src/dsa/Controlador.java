package dsa;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
public class Controlador {
    private Dictionary<Integer, Eetacemon> pokedex =new Hashtable();
    private Dictionary<String,Usuario> usuarios=new Hashtable();
    private Usuario yo;
    private Integer identificador=0;

    public boolean Añadir (Eetacemon e)
    {
        e.id=identificador;

        if(pokedex.put(identificador,e)==null){
            identificador++;
            return true;
        }
        else
            return false;
    }
    public boolean Borrar (Integer i)
    {

        if(pokedex.remove(i)!=null){
            identificador--;
            return true;
        }
        else
            return false;
    }
    public List<Eetacemon> listar()
    {
        List<Eetacemon> e=new ArrayList<>();
        for (int i = 0; i< pokedex.size(); i++){
            e.add(pokedex.get(i));
        }
        return e;

    }
    public List<Eetacemon> buscar_pokemon(String s)
    {
        List<Eetacemon> f=new ArrayList<>();
        Eetacemon e =new Eetacemon();
        for(int i = 0; i< pokedex.size(); i++)
        {
            e= pokedex.get(i);
            if(e.nombre.contains(s))
                f.add(e);
        }
        return f;
    }
    public boolean añadir_usuario(String nombre,String pass,String mail){
        Usuario a=new Usuario(nombre,pass,mail);
        Usuario b=usuarios.get(nombre);
        if(b.getnombre().equals(a.getnombre()))
        return false;
        else {
            usuarios.put(nombre,a);
            return true;
        }
    }
    public boolean borrar_usuario(String nombre){
        Usuario b=usuarios.get(nombre);
        if(b==null)
            return false;
        else {
            usuarios.remove(nombre);
            return true;
        }
    }
    public boolean verificar(String nombre,String pass){
        Usuario b=usuarios.get(nombre);
        if(b.getpass().equals(pass))
            return true;
        else
            return false;
    }
    public List<Usuario> buscar_usuario(String s)
    {
        List<Usuario> f=new ArrayList<>();
        Usuario e =new Usuario(null,null,null);
        for(int i = 0; i< pokedex.size(); i++)
        {
            e= usuarios.get(i);
            if(e.getnombre().contains(s))
                f.add(e);
        }
        return f;
    }
}

