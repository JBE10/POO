package usuario;

import avion.CaboInte;
import avion.Carga;

import java.util.Scanner;

public class Main {
    static Carga aereo = new Carga();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opciones;
        do {
            System.out.println("Presione (1) para agregar vuelo | (2) para información de asientos disponibles | (3) para información de cantidad de escalas para los vuelos internacionales| (0) para salir");
            opciones = teclado.nextInt();
            if (opciones == 1) {
                boolean internacional = false;

                System.out.println("Si el vuelo es internacional presione 1, si no presione 2");
                opciones = teclado.nextInt();
                if (opciones == 1) {
                    internacional = true;
                }

                agregarVuelos(internacional);
            } else if (opciones == 2) {
                System.out.println(cantidadAsientos());
            } else if (opciones == 3) {
                numEscalas();
            }

        } while (opciones != 0);
    }

    public static void agregarVuelos(boolean internacional) {
        CaboInte avion = new CaboInte();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número del vuelo: ");
        avion.setNumeroVuelo(teclado.next());
        System.out.println("Ingrese el destino: ");
        avion.setDestino(teclado.next());
        System.out.println("Ingrese la capacidad del avión: ");
        avion.setCapacidad(teclado.nextInt());
        System.out.println("Ingrese la cantidad de asientos ocupados: ");
        avion.setAsientosOcupados(teclado.nextInt());
        avion.setInternacional(internacional);

        if (internacional) {
            System.out.println("Ingrese la cantidad de escalas que tiene el vuelo: ");
            avion.setEscalas(teclado.nextInt());
        }

        aereo.setListaAviones(avion);
    }

    public static int cantidadAsientos() {
        Scanner teclado = new Scanner(System.in);
        String numeroVuelo;
        int asiento = 0;
        System.out.println("Ingrese el número de vuelo que desea ver su disponibilidad: ");
        numeroVuelo = teclado.next();

        if (aereo.existe(numeroVuelo)) {
            asiento = aereo.asientosDisponibles(numeroVuelo);
        } else {
            System.out.println("No existe ese vuelo");
        }

        return asiento;
    }

    public static void numEscalas() {
        Scanner teclado = new Scanner(System.in);
        String numeroVuelo;
        System.out.println("Ingrese el número del vuelo internacional: ");
        numeroVuelo = teclado.next();

        CaboInte vuelo = aereo.obtenerVuelo(numeroVuelo);
        if (vuelo == null) { // Corregido
            System.out.println("El vuelo no está cargado.");
        } else if (vuelo.getInternacional()) {
            System.out.println("El número de escalas es: " + vuelo.getEscalas());
        } else {
            System.out.println("El vuelo es de cabotaje");

        }

    }
}
