package negocio;

public  class Empleado  {
    private int legajo;
    private String nombre;
    private double sueldo;

    public Empleado(int legajo, String nombre, double sueldo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public Empleado() {
        legajo = 0;
        nombre = "";
        sueldo=0;

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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
