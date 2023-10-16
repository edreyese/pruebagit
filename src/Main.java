

/**
 *
 * @author reyes
 */
public class Main {
    public static void main(String[] args) {
        Telefono iphone =new Telefono(10.8, 1111, 500000, "Iphone 15");
        Telefono samsung = new Telefono(9.5, 2222, 4000000, "Samsung Edge");
        Computador razer = new Computador("Intel Core", 3333,450000, "Computador Razer");
        Computador omen = new Computador("Pentium", 44444, 800000, "Computador Omen");
        Auricular sony = new Auricular("Basica", 5555, 50000, "Auricula Sony");
        Auricular jb = new Auricular("Extra", 6666, 70000, "Auricular JB");
        
        ListaProductos listaproducto = new ListaProductos();
        System.out.println(razer.descripcionDetallada());
        System.out.println(sony.descripcionDetallada());
        
        listaproducto.agregarProducto(sony);
        listaproducto.agregarProducto(razer);
        listaproducto.agregarProducto(jb);
        listaproducto.listarProductos();
        
         
        
    } 
        
}
