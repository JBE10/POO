package agencia;

public class Importados extends Auto{
    private double impuestos;

    public Importados(int numeroChasis, String marca, String modelo, double precioVenta, double impuestos,double precioTotal) {
        super(numeroChasis, marca, modelo, precioVenta,precioTotal);
        this.impuestos = impuestos;
    }
    public Importados(){
        super();
        this.impuestos = 0;
    }
    public double getImpuestos() {
        return impuestos;
    }
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    public double calcularNeto(){
        double total = precioVenta +(precioVenta*impuestos);
        return total;
    }
}
