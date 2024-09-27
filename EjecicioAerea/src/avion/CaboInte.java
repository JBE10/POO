package avion;

public class CaboInte {
    protected String numeroVuelo;
    protected int capacidad;
    protected int escalas;
    protected String destino;
    protected int asientosOcupados;
    protected boolean internacional;

    public CaboInte(String numeroVuelo,String destino,int capacidad,int asientosOcupados,int escalas,boolean isInternacional){
        this.numeroVuelo=numeroVuelo;
        this.destino=destino;
        this.capacidad=capacidad;
        this.asientosOcupados=asientosOcupados;
        this.escalas=escalas;
        this.internacional=isInternacional;
    }
    public CaboInte(){
        numeroVuelo="";
        destino="";
        capacidad=0;
        asientosOcupados=0;
        escalas=0;
        internacional=false;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getEscalas() {
        return escalas;
    }


    public String getDestino() {
        return destino;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


}
