package negocio;

public class Avion extends DispositivoVolador implements IVolar{
    private boolean trenAterrizaje = true;

    @Override
    public void volar() {

    }

    @Override
    public void despegar() {
        trenAterrizaje=false;
    }

    @Override
    public void aterrizar() {
        trenAterrizaje=true;
    }
}
