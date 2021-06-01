/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Color;
import Modelo.Modelo;
import Modelo.OrdenDeProduccion;
import Vista.AutenticacionVista;
import java.util.ArrayList;



    
public class Controlador {
    private AutenticacionVista autenticacion_vista;
    public ArrayList<Modelo> modelos;
     public ArrayList<OrdenDeProduccion> ordenes;
    
    public void autenticar (String usuario, String contraseña){
        if(usuario.equals("superlinea") && contraseña.equals("1234")){
            System.out.println("autenticado");
            
        }
        else{
            
            System.out.println("noautenticado");
            System.exit(0);
        }
        if(usuario.equals("supervisordecalidad") && contraseña.equals("1234")){
            System.out.println("autenticado");
            
        }
        else{
            System.out.println("noautenticado");
        }
    }
     
    }
