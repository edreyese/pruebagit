
/**
 *
 * @author reyes
 */
abstract class Producto implements InterfaceIva {
    protected int codigo,precio;
    protected String nombre;

    public Producto() {
    }

    public Producto(int codigo, int precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", nombre=" + nombre + '}';
    }
    
    public abstract String descripcionDetallada();
   
    public int  CalcularproductoSinIva(){
       return precio + calcularIva(precio);
       
   }
} 
 
