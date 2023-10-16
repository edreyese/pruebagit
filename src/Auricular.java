
/**
 *
 * @author reyes
 */
public class Auricular extends Producto{
    private String calidadSonido;

    public Auricular() {
        super();
    }

    public Auricular(String calidadSonido, int codigo, int precio, String nombre) {
        super(codigo, precio, nombre);
        this.calidadSonido = calidadSonido;
    }

    public String getCalidadSonido() {
        return calidadSonido;
    }

    public void setCalidadSonido(String calidadSonido) {
        this.calidadSonido = calidadSonido;
    }

    @Override
    public String toString() {
        return "Auricular{" + "calidadSonido=" + calidadSonido + '}'+ " " + super.toString();
    }

    @Override
    public String descripcionDetallada() {
        return  "Codigo :" +super.getCodigo() +" " + "Nombre : " + super.getNombre() +" " + "Precio :" + super.getPrecio() +" " + " Calidad de Sonido: " +" " + calidadSonido;
    }
    
    
}
