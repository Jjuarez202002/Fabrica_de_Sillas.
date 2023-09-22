package com.mycompany.fabrica_de_sillas;
import java.util.Scanner;
import java.util.Date;

public class Fabrica_de_Sillas {
    private static int BaseClavos = 10000;
    private static int BaseTornillos = 10000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        while (true) {
            System.out.println("----- Menu de Fabrica de Sillas -----");
            System.out.println("1. Generar Bodega");
            System.out.println("2. Solicitar Materiales");
            System.out.println("3. Crear Producto");
            System.out.println("4. Crear Factura");
            System.out.println("5. Crear Inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    crearBodega(scanner);
                    break;
                case 2:
                    crearMateriales(scanner);
                    break;
                case 3:
                    crearProducto(scanner);
                    break;
                case 4:
                    crearFactura(scanner);
                    break;
                case 5:
                    crearInventario(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    
    private static void crearBodega(Scanner scanner) {
        System.out.println("Ingrese la dirección de la Bodega:");
        String direccion = scanner.next();
        
        System.out.println("Ingrese la capacidad de la Bodega:");
        int capacidad = scanner.nextInt();
        
        Bodega bodega = new Bodega(direccion, capacidad);
        System.out.println("Bodega creada:\n" + bodega);
    }
    
    private static void crearMateriales(Scanner scanner) {
    int clavos = 0;
    int tornillosA = 0;
    String barniz;
    String madera = null;

    do {
        System.out.println("Ingrese la cantidad de Clavos que utilizará: Clavos Disponibles = "+ BaseClavos);
        clavos = scanner.nextInt();
        if (clavos > BaseClavos) {
            System.out.println("La cantidad ingresada es mayor al material disponible.");
        } else {
            BaseClavos -= clavos;
            break; // Salir del bucle si la cantidad es válida
        }
    } while (true);

    do {
        System.out.println("Ingrese la cantidad de tornillos que necesita: Tornillos Disponibles = "+ BaseTornillos);
        tornillosA = scanner.nextInt();
        if (tornillosA > BaseTornillos) {
            System.out.println("La cantidad ingresada es mayor al material disponible.");
        } else {
            BaseTornillos -= tornillosA;
            break; // Salir del bucle si la cantidad es válida
        }
    } while (true);

    do {
    System.out.println("¿Desea que se le aplique Barniz? (SI/No):");
       barniz = scanner.next().toLowerCase(); // Convierte la entrada a minúsculas para evitar problemas de mayúsculas/minúsculas
    } while (!barniz.equals("si") && !barniz.equals("no"));

    if (barniz.equals("si")) {
    System.out.println("Se aplicará barniz al producto.");
    } else {   
    System.out.println("No se aplicará barniz al producto.");
    }   

    while (madera == null) {
    System.out.println("Seleccione el tipo de Madera (seleccionar el numero):");
    System.out.println("1. Arce");
    System.out.println("2. Haya");
    System.out.println("3. Nogal");
    System.out.println("4. Cerezo");
    System.out.println("5. Roble");
    System.out.println("6. Caoba");
    System.out.print("Ingrese el número de la opción: ");

    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            madera = "Arce";
            break;
        case 2:
            madera = "Haya";
            break;
        case 3:
            madera = "Nogal";
            break;
        case 4:
            madera = "Cerezo";
            break;
        case 5:
            madera = "Roble";
            break;
        case 6:
            madera = "Caoba";
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
            break;
    }
}
System.out.println("Ha seleccionado: " + madera);

    System.out.println("Ingrese el color de la Pintura:");
    String pintura = scanner.next();


    Material materiales = new Material(clavos, barniz, madera, pintura,tornillosA);
    System.out.println("|-----------Materiales creados-----------|" + materiales);
}

    private static void crearProducto(Scanner scanner) {
        System.out.println("Ingrese el código del Producto:");
        int codigoProducto = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del Producto:");
        String nombreProducto = scanner.next();
        
        System.out.println("Ingrese el precio del Producto:");
        double precio = scanner.nextDouble();
        
        System.out.println("Ingrese la cantidad de Productos:");
        int cantidad = scanner.nextInt();
        
        System.out.println("Ingrese la fecha (yyyymmdd) del Producto:");
        String fecha = scanner.next();
        
        System.out.println("Ingrese el total del Producto:");
        double total = scanner.nextDouble();
        
        Producto producto = new Producto(codigoProducto, nombreProducto, precio, cantidad, fecha, total);
        System.out.println("|--------Producto creado:--------|" + producto);
    }
    
    public static void crearFactura(Scanner scanner) {
        System.out.println("Ingrese el número de Factura:");
        String numeroFactura = scanner.next();
        
        System.out.println("Ingrese el código del Producto:");
        int codigoProducto = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del Producto:");
        String nombreProducto = scanner.next();
        
        System.out.println("Ingrese el precio del Producto:");
        double precio = scanner.nextDouble();
        
        System.out.println("Ingrese la cantidad de Productos:");
        int cantidad = scanner.nextInt();
        
        System.out.println("Ingrese la fecha (dd/mm/yyyy) del Producto:");
        String fecha = scanner.next();
        
        Factura factura = new Factura(numeroFactura, codigoProducto, nombreProducto, precio, cantidad, fecha,PrecioTotal(precio,cantidad));
        System.out.println("|--------Factura creada:--------|");
        }
       private static double PrecioTotal1(double precio, int cantidad){
            double total = precio * cantidad; 
            return total;
    } 
    private static void crearInventario(Scanner scanner) {
        System.out.println("Ingrese el código del Producto en el Inventario:");
        int codigoProducto = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del Producto en el Inventario:");
        String nombreProducto = scanner.next();
        
        System.out.println("Ingrese la cantidad en el Inventario:");
        int cantidad = scanner.nextInt();
        
        Date fechaActual = new Date();
        
        Inventario inventario = new Inventario(codigoProducto, nombreProducto, cantidad, fechaActual);
        System.out.println("|--------Registro en el Inventario creado:--------|" + inventario);
    }
       private static double PrecioTotal(double precio, int cantidad){
            double total = precio * cantidad; 
            return total;
    }
}