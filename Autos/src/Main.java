import agencia.*;

import java.util.Scanner;

public class Main {
    static listaAutos autoTag = new listaAutos();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opticon;
        do {
            System.out.println("Ingrese '1'(Agregar auto)|'2'(Obtener Auto)|'3'(Obtener Total Vendido)|'4'(Eliminar Auto)|'0'(Salir): ");
            opticon = teclado.nextInt();
            if (opticon == 1) {
                ingresarAuto();
            } else if (opticon == 2) {
                getAuto();

            } else if (opticon == 3) {
                getGanacia();
            } else if (opticon == 4) {
                delAuto();

            }

        } while (opticon > 0);

    }

    public static void ingresarAuto() {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Ingrese '1'(Agregar Impotado)|'2'(Obtener Nacional)| ");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            Importados e = new Importados();
            System.out.println("Ingrese numero de chasis: ");
            e.setNumeroChasis(teclado.nextInt());
            System.out.println("Ingreese marca: ");
            e.setMarca(teclado.next());
            System.out.println("Ingrese modelo: ");
            e.setModelo(teclado.next());
            System.out.println("Ingrese precio de venta: ");
            e.setPrecioVenta(teclado.nextDouble());
            System.out.println("Ingrese el impuesto %:");
            e.setImpuestos(teclado.nextDouble());
            autoTag.agregarAuto(e);

        } else if (opcion == 2) {
            Nacionales e = new Nacionales();
            System.out.println("Ingrese numero de chasis: ");
            e.setNumeroChasis(teclado.nextInt());
            System.out.println("Ingreese marca: ");
            e.setMarca(teclado.next());
            System.out.println("Ingrese modelo: ");
            e.setModelo(teclado.next());
            System.out.println("Ingrese precio de venta: ");
            e.setPrecioVenta(teclado.nextDouble());
            System.out.println("Ingrese el impuesto %:");
            e.setCostoFabricacion(teclado.nextDouble());
            autoTag.agregarAuto(e);
        }


    }

    public static Auto getAuto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de chasis: ");
        int chasis = teclado.nextInt();
        Auto e=autoTag.buscarAuto(chasis);
        if (e == null) {
            return null;
        }
        System.out.println("Marca:"+ e.getMarca()+" Modelo: "+e.getModelo()+ " Precio: "+e.getPrecioVenta()+ "Precio con impuesto: "+ e.calcularNeto());
        return e;
    }
    public static void getGanacia(){
        double total=autoTag.totalVendido();
        System.out.println(total);

    }

    public static void delAuto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de chasis: ");
        boolean elimminado=autoTag.eliminarAuto(teclado.nextInt());
        if(elimminado){
            System.out.println("El auto fue eliminadoo correctamente");

        }
        else {
            System.out.println("El vehiculo no existe");
        }

    }
}
