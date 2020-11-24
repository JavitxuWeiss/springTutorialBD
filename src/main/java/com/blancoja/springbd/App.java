package com.blancoja.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blancoja.beans.Equipo;
import com.blancoja.beans.Jugador;
import com.blancoja.beans.Marca;
import com.blancoja.service.ServiceJugador;
import com.blancoja.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Marca mar = new Marca();
//        mar.setId(2);
//        mar.setNombre("Adidas");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/blancoja/xml/beans.xml");
        
        ServiceMarca sm =(ServiceMarca)appContext.getBean("serviceMarcaImpl");
        ServiceJugador sj=(ServiceJugador)appContext.getBean("serviceJugadorImpl");
        Marca mar3 = (Marca) appContext.getBean("marca3");
        Equipo equi1= (Equipo) appContext.getBean("equipo1");
        Jugador jug1= (Jugador) appContext.getBean("jugador1");
        
        try {
        	//sm.registrar(mar3);
        	sj.registrar(jug1);
        } catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
