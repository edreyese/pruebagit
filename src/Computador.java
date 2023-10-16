
/**
 *
 * @author reyes
 */
public class Computador extends  Producto{
    private String procesador;

    public Computador() {
        super();
    }

    public Computador(String procesador, int codigo, int precio, String nombre) {
        super(codigo, precio, nombre);
        this.procesador = procesador;
    }

    public String getComputador() {
        return procesador;
    }

    public void setComputador(String computador) {
        this.procesador = computador;
    }

    @Override
    public String toString() {
        return "Computador{" + "procesador=" + procesador + '}' + " " + super.toString();
    }

    @Override
    public String descripcionDetallada() {
        int precioDescuento = (int) (super.getPrecio()-super.getPrecio()* 0.20);
        return  "Codigo :" +super.getCodigo() +" " + "Nombre : " + super.getNombre() +" " + "Precio :" + precioDescuento +" " + " Procesador : " +" " + procesador;
    }
    
    
}
