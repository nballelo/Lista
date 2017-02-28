package dsa;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
public class Controlador {
    private Dictionary<Integer, Eetacemon>lista=new Hashtable();
    private Integer identificador=0;
    public boolean Añadir (Eetacemon e)
    {
        e.id=identificador;
        try {
            lista.put(identificador,e);
            identificador++;
            return true;
        }
        catch (Exception x){
            return false;
        }
    }
    public boolean Borrar (Integer i)
    {

        try {
            lista.remove(i);
            return true;
        }
        catch (Exception x) {
            return false;
        }
    }
    public List<Eetacemon> listar()
    {
        List<Eetacemon> e=new ArrayList<>();
        for (int i=0;i<lista.size();i++){
            e.add(lista.get(i));
        }
        return e;

    }
    public List<Eetacemon> buscar(String s)
    {
        List<Eetacemon> f=new ArrayList<>();
        Eetacemon e =new Eetacemon();
        for(int i=0;i<lista.size();i++)
        {
            e=lista.get(i);
            if(e.nombre.contains(s))
                f.add(e);
        }
        return f;
    }

}

