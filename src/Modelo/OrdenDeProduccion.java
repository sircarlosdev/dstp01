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
public class OrdenDeProduccion {
    private Modelo modelo;
    private Color color;
    private int numero;
    private String estado;
    private int objetivo;

    public OrdenDeProduccion(Modelo modelo, Color color, int numero, String estado,int objetivo) {
        this.modelo = modelo;
        this.color = color;
        this.numero = numero;
        this.estado = estado;
        this.objetivo = objetivo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }
    
    
    
}
