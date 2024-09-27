package agencia;

import java.util.ArrayList;

public class listaAutos {
    ArrayList<Auto> autosLista;
    public listaAutos() {
        autosLista = new ArrayList<>();
    }
    public boolean agregarAuto(Auto auto) {
        for (Auto a : autosLista) {
            if (a.numeroChasis==auto.numeroChasis){
                return false;
            }
        }
        autosLista.add(auto);
        return true;
    }

    public boolean eliminarAuto(int numeroChasis) {
        for (Auto a : autosLista) {
            if (a.numeroChasis==numeroChasis){
                autosLista.remove(a);
                return true;
            }
        }
        return false;
    }
    public Auto buscarAuto(int numeroChasis) {
        for (Auto a : autosLista) {
            if (a.numeroChasis==numeroChasis){
                return a;
            }
        }
        return null;
    }
    public double precioFinal(int numeroChasis) {
        for (Auto a : autosLista) {
            if (a.numeroChasis==numeroChasis){
                double total= a.calcularNeto();
                return total;
            }
        }
        return 0;
    }
    public double totalVendido () {
        double total = 0;
        for (Auto a : autosLista) {
            total = total + a.precioVenta;
        }
        return total;
    }
}
