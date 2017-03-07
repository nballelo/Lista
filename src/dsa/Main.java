package dsa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=-1,j=0;
        String s,s2;
        Controlador control =new Controlador();
        Scanner leer =new Scanner(System.in);
        List<Eetacemon> lista;
        List<Usuario> usuarios;
        Usuario user;
        while (i!=5)
        {
            System.out.println("Que quieres hacer?");
            System.out.println("1. Añadir pokemon");
            System.out.println("2. Borrar");
            System.out.println("3. Listar");
            System.out.println("4. Buscar");
            System.out.println("5. Añadir usuario");
            System.out.println("6. Borrar usuario");
            System.out.println("7. Buscar usuario");
            System.out.println("8. Salir");
            i=Integer.parseInt(leer.nextLine());
            switch (i)
            {
                case 1:
                    Eetacemon pokemon=new Eetacemon();
                    System.out.println("Introdice el nombre:");
                    pokemon.nombre=leer.nextLine();
                    System.out.println("Introduce el LvL de 1 a 5:");
                    j=Integer.parseInt(leer.nextLine());
                    pokemon.Lvl=j;
                    if(control.Añadir(pokemon))
                        System.out.println("El pokemon se ha añadido correctamente");
                    else
                        System.out.println("El pokemon no se ha podido añadir");
                    break;
                case 2:
                    System.out.println("Introduce el numero del pokemon que quieras borrar:");
                    if(control.Borrar(Integer.parseInt(leer.nextLine()))){
                        System.out.println("El pokemon se ha borrado correctamente");
                        System.out.println();}
                    else{
                        System.out.println("El pokemon no se ha podido borrar");
                        System.out.println();}
                    break;
                case 3:
                    lista=new ArrayList<>();
                    lista=control.listar();
                    System.out.println();
                    for(int k=0;k<lista.size();k++)
                    {
                        pokemon= lista.get(k);
                        System.out.println("Id:"+pokemon.id+"  Nombre: "+pokemon.nombre+"  Lvl:"+pokemon.Lvl);
                    }
                    System.out.println();
                    break;
                case 4:
                    s=new String();
                    lista=new ArrayList<>();
                    System.out.println("Introduce el nombre del pokemon que quieres que se muestre");
                    s=leer.nextLine();
                    lista=control.buscar_pokemon(s);
                    for(int k=0;k<lista.size();k++)
                    {
                        pokemon= lista.get(k);
                        System.out.println("Id:"+pokemon.id+"  Nombre: "+pokemon.nombre+"  Lvl:"+pokemon.Lvl);
                    }
                    break;
                case 5:
                    s=new String();
                    System.out.println("Introdice el nombre:");
                    s=leer.nextLine();
                    s2=new String();
                    System.out.println("Introduce el pass:");
                    s2=leer.nextLine();
                    System.out.println("Introduce el mail:");
                    if(control.añadir_usuario(s,s2,leer.nextLine()))
                        System.out.println("El usuario se ha añadido correctamente");
                    else
                        System.out.println("El usuario no se ha podido añadir");
                    break;
                case 7:
                    s = new String();
                    lista=new ArrayList<>();
                    System.out.println("Introduce el nombre del usuario que quieres que se muestre");
                    s=leer.nextLine();
                    usuarios =control.buscar_usuario(s);
                    for(int k=0;k<lista.size();k++)
                    {
                        user= usuarios.get(k);
                        System.out.println("Nombre: "+user.getnombre()+"  Mail: "+user.getmail());
                    }
                    break;
                case 8:System.out.println("Adiós");
                    break;
            }


        }

    }
}
