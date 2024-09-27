package avion;

import java.util.ArrayList;

public class Carga  extends CaboInte{
    ArrayList<CaboInte> listaAviones = new ArrayList<>();

    public Carga(){
        super();
    }
    public Carga(String numeroVuelo,String destino,int capacidad,int asientosOcupados,int escalas,boolean isInternacional){
        super(numeroVuelo,destino,capacidad,asientosOcupados,escalas,isInternacional);
    }


    public void setListaAviones(CaboInte avion) {
        if (listaAviones.isEmpty()) {
            listaAviones.add(avion);
        } else {
            for (int i = 0; i < listaAviones.size(); i++) {
                if (listaAviones.get(i).getNumeroVuelo().equals(avion.getNumeroVuelo())) {
                    return;
                }
            }
            listaAviones.add(avion);
        }
    }

    public int asientosDisponibles(String numeroVuelo) {
        int capacidadDispo = 0;
        for (int i = 0; i < listaAviones.size(); i++) {
            if (listaAviones.get(i).getNumeroVuelo().equals(numeroVuelo)) {
                capacidadDispo = listaAviones.get(i).getCapacidad() - listaAviones.get(i).getAsientosOcupados();
                return capacidadDispo;
            }
        }
        return capacidadDispo;
    }

    public int escalasInternacional(String numeroVuelo) {
        for (int i = 0; i < listaAviones.size(); i++) {
            if (listaAviones.get(i).getNumeroVuelo().equals(numeroVuelo)) {
                if (listaAviones.get(i).getInternacional()) {
                    return listaAviones.get(i).getEscalas();
                }
            }
        }
        return 0;
    }

    public boolean existe(String numeroVuelo) {
        for (int i = 0; i < listaAviones.size(); i++) {
            if (listaAviones.get(i).getNumeroVuelo().equals(numeroVuelo)) {
                return true;
            }
        }
        return false;
    }

    public CaboInte obtenerVuelo(String numeroVuelo) {
        for (int i = 0; i < listaAviones.size(); i++) {
            if (listaAviones.get(i).getNumeroVuelo().equals(numeroVuelo)) {
                return listaAviones.get(i);
            }
        }
        return null;
    }
}
