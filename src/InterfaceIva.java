
/**
 *
 * @author reyes
 */
public interface InterfaceIva {
   
    double IVA= 0.19;
    
    default int calcularIva(double precioSinIva){
        return (int) (precioSinIva*IVA);
    }
    
}
