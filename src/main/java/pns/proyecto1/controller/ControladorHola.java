package pns.proyecto1.controller;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorHola {
   
    //primero hacemos el get
    @RequestMapping(value="/hola", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String holaConGet(){
        return "Este es el primer controller con un get";
    }
    
    //crear un metodo get para los usuarios que me devuelva todos 
    
    @RequestMapping(value = "/usuario",method=RequestMethod.GET, headers = {"Accept=Application/json"})
    public @ResponseBody String obtenerTodos()throws IOException{
    //vamos a usar la implementacion de json para java de fasterxml o codehouse
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(GenerarUsuarios.obtenerUsuario());
    }
}
