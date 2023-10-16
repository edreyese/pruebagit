
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author reyes
 */
public class ListaProductos {
    ArrayList <Producto> listaProductos = new ArrayList<>();
    ArrayList <Producto> productosBoleta = new ArrayList<>();

    public ListaProductos() {
        this.listaProductos=listaProductos;
        this.productosBoleta=productosBoleta;
    }
    
    public void agregarProducto(Producto producto){
        if (listaProductos.add(producto)) {
            System.out.println("Se agrego el producto");}
        else{
            System.out.println("No se agrego el producto");    
        }
     
    }
    
    
    public void listarProductos(){
        System.out.println("Lista de productos");
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto.descripcionDetallada()); 
            System.out.println("-----------------"); 
        }
           
     }
    public final void imprimirBoleta() {
        System.out.println("------------------- Boleta --------------------");
        System.out.println("Fecha de venta: " + LocalDate.now());
        int total = 0;

        for (Producto producto : listaProductos) {
            //System.out.println(producto.getNombre() + " - $" + producto.getPrecioSinIVA());
            System.out.println(producto.getNombre() + " - $" + producto.CalcularproductoSinIva());
            total += producto.CalcularproductoSinIva();
         }
    

        System.out.println("Total: $" + total);
        System.out.println("-------------------------------------------------");
        }
}