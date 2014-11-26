package pns.proyecto1.controller;

import java.util.ArrayList;
import pns.proyecto2.model.DAOUsuarioImpl;

public class GenerarUsuarios {
    public static String obtenerUsuario() throws Exception{
        DAOUsuarioImpl du = new DAOUsuarioImpl();
        
        return  du.obtenerTodos();
    }
    /*esto es una opcion
    
    public static ArrayList<Usuario> obtenerUsuario(){
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        
        //primero creamos tres direcciones
        Direccion d1 = new Direccion("calle de la muerte",55090,"Azteca","Mexico");
        Direccion d2 = new Direccion("calle de la amargura",55130,"san geronimo","Chihuahua");
        Direccion d3 = new Direccion("calle 13",55200,"ska","Puerto Rico");
        
        //ahora asociamos las direcciones a sus usuarios
        Usuario u1 = new Usuario("juan",42,45000,d1);
        Usuario u2 = new Usuario("paquita la del barrio",72,1500,d2);
        Usuario u3 = new Usuario("ludoviko",7,3000,d3);
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        return usuarios;*/
    
    }

