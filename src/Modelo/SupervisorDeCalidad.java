/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rocio Parache
 */
public class SupervisorDeCalidad extends Usuario{

    public SupervisorDeCalidad(String usuario, String contraseña, String apellido, String nombre, int legajo, String email, Integer dni) {
        super(usuario, contraseña, apellido, nombre, legajo, email, dni);
    } 
    
}
