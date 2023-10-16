
import java.util.Scanner;


/**
 *
 * @author reyes
 */
public class MenuInicial {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      ListaProductos productos = new ListaProductos();
      int salidaPrograma=0;
      while (salidaPrograma!=6){ 
          System.out.println("Menu Inicial");
          System.out.println("1.-Agregar Computador");
          System.out.println("2.-Agregar Auricular");
          System.out.println("3.-Agregar Telefono");
          System.out.println("4.-Lista de productos");
          System.out.println("5.-Imprimir boleta");
          System.out.println("6.- Salir");
          int opcion = leer.nextInt();
          switch (opcion){
                  case 1 -> {
                      System.out.println("Ingrese codigo :");
                      int codigoC = leer.nextInt();
                      leer.nextLine();
                      System.out.println("Ingrese nombre :");
                      String nombreC = leer.nextLine();
                      System.out.println("precio :");
                      int precioC=leer.nextInt();
                      leer.nextLine();
                      System.out.println("Procesador :");
                      String procesadorC = leer.nextLine();
                      productos.agregarProducto(new Computador(procesadorC, codigoC,precioC, nombreC));
                      break;
                        }
                        
                  case 2 ->{
                      System.out.println("Ingrese codigo :");
                      int codigoA = leer.nextInt();
                      leer.nextLine();
                      System.out.println("Ingrese nombre :");
                      String nombreA = leer.nextLine();
                      System.out.println("precio :");
                      int precioA=leer.nextInt();
                      leer.nextLine();
                      System.out.println("Calidad de Sonido");
                      String calidadSonidoA = leer.nextLine();
                      productos.agregarProducto(new Auricular(calidadSonidoA, codigoA, precioA, nombreA));
                      break;
                  }
                  case 3 ->{
                      System.out.println("Ingrese codigo :");
                      int codigoT = leer.nextInt();
                      leer.nextLine();
                      System.out.println("Ingrese nombre :");
                      String nombreT = leer.nextLine();
                      System.out.println("precio :");
                      int precioT=leer.nextInt();
                      leer.nextLine();
                      System.out.println("Calidad de Sonido");
                      double tamanoPantallaT = leer.nextDouble();
                      productos.agregarProducto(new Telefono(tamanoPantallaT, codigoT, precioT, nombreT));
                      break;
                  }
                  case 4 ->{
                      productos.listarProductos();
                      break;
                      
                      
                  }   
                  case 5 ->{
                      productos.imprimirBoleta();
                      break;
                  }
                  case 6 ->{
                      System.out.println("Vuelva pronto");
                      salidaPrograma=opcion;
                      break;
                          
          
    }
    
    
    
}
    
    
           
}
}
}