package agencia;

public class Nacionales extends Auto{
    private double costoFabricacion;
    public Nacionales(int numeroChasis, String marca, String modelo, double precioVenta,double costoFabricacion,double precioTotal) {
        super(numeroChasis, marca, modelo, precioVenta, precioTotal);
        this.costoFabricacion = costoFabricacion;
    }
    public Nacionales() {
        super();
        this.costoFabricacion = 0.0;
    }
    public double getCostoFabricacion() {
        return costoFabricacion;
    }
    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
    public double calcularNeto(){
        double total= precioVenta;

        return total;
    }

}
