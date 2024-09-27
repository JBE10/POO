package negocio;

public class Profesional extends Empleado{

    private double plus;

    public Profesional(int legajo, String nombre, double sueldo, double plus) {
        super(legajo, nombre, sueldo);
        this.plus = plus;
    }

    @Override
    public double calcularsueldoBasico() {
        return this.sueldoBasico+plus;
    }

    public double getPlus() {

        return plus;
    }

    public void setPlus(double plus) {

        this.plus = plus;
    }
}
