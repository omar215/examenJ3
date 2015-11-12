/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Omar
 */
@Controller
@RequestMapping
public class ControladorReservaciones {
    
    @RequestMapping("/guardar")
    @ResponseBody String guardar () throws Exception{
        DAOReservaciones daor=new DAOReservaciones();
        DAOCliente daoc=new DAOCliente();
        DAOTarjeta1 daot=new DAOTarjeta1();
        Cliente c1=new Cliente();
        c1.setEmail("mario@me.com");
        c1.setNombre("Mario");
        c1.setPaterno("Rocha");
        daoc.guardar(c1);
        
        Tarjeta1 t1=new Tarjeta1();
                t1.setIdCleinte (c1);
                t1.setNombreTarjeta("Santander"):
                t1.setNumeroTarjeta("551815365");
                t1.setSaldo(12000f);
                daot.guardar(t1);
                
                Reservacion reservacion=new Reservacion();
                reservacion.setIdCliente(c1);
                reservacion.setIdTarjeta(t1);
                
                reservacion.setCiudadDestino("Mexico");
                reservacion.setNombrehotel("one");
                reservacion.setNumeroPersonas(2);
                
        return "reservacion guardada con exito";
    }
}
