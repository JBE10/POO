package negocio;

public abstract class Empleado {
    protected int legajo;
    protected String nombre;
    protected double sueldoBasico;
    public Empleado(int legajo, String nombre, double sueldoBasico) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldoBasico = sueldoBasico;
    }

    public Empleado() {
        legajo = 0;
        nombre = "";
        sueldoBasico=0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getsueldoBasico() {
        return sueldoBasico;
    }

    public void setsueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double calcularsueldoBasico(){
            return sueldoBasico;

    }



}
