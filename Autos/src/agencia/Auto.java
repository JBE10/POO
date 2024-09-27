package agencia;

public abstract class Auto {
    protected int numeroChasis;
    protected String marca;
    protected String modelo;
    protected double precioVenta;
    protected double precioTotal;
    public Auto(int numeroChasis, String marca, String modelo, double precioVenta ,double precioTotal) {
        this.numeroChasis = numeroChasis;
        this.marca = marca;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.precioTotal = precioTotal;
    }
    public Auto(){
        numeroChasis = 0;
        marca = "";
        modelo = "";
        precioVenta = 0.0;
        precioTotal=0.0;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCalcularNeto(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public double calcularNeto() {
        return precioTotal;
    }

}
