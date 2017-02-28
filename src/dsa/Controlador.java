package dsa;

import java.util.ArrayList;
import java.util.List;
public class Controlador {
    private List<eetacemon> lista=new ArrayList<>();
    private int identificador=0;
    public boolean Añadir (eetacemon e)
    {
        boolean res;
        e.id=identificador;
        identificador++;
        res=lista.add(e);
        return res;
    }
    public boolean Borrar (int i)
    {
        boolean res=false;
        eetacemon e=new eetacemon();
        for(int j=0;j<lista.size();j++)
        {
            e=lista.get(j);
            if(e.id==i)
            {
                lista.remove(j);
                res=true;
                break;
            }
        }
        return res;
    }
    public List<eetacemon> listar()
    {
        return lista;
    }
    public List<eetacemon> buscar(String s)
    {
        List<eetacemon> f=new ArrayList<>();
        eetacemon e =new eetacemon();
        for(int i=0;i<lista.size();i++)
        {
            e=lista.get(i);
            if(e.nombre.contains(s))
                f.add(e);
        }
        return f;
    }

}

