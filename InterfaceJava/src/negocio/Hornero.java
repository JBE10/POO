package negocio;

public class Hornero extends Ave implements IVolar{
    @Override
    public void volar() {
        System.out.println("Soy un hornero y esto despegando");
    }

    @Override
    public void despegar() {
        System.out.println("Vuela majesstuosammente cortas distancias");

    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando utilizando las alass emplumadas");

    }
}
