/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reyes
 */
public class Telefono extends Producto{
    private double tamanoPantalla;

    public Telefono() {
        super();
    }

    public Telefono(double tamanoPantalla, int codigo, int precio, String nombre) {
        super(codigo, precio, nombre);
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public String toString() {
        return "Telefono{" + "tamanoPantalla=" + tamanoPantalla + '}' + " " + super.toString();
    }

    @Override
    public String descripcionDetallada() {
       return  "Codigo :" +super.getCodigo() +" " + "Nombre : " + super.getNombre() +" " + "Precio :" + super.getPrecio() +" " + " Tamaño de Pantalla : " +" " + tamanoPantalla;
    }
}