package negocio;

public class Empleado {
    private int legajo;
    private String nombre;
    private double sueldoBasico;
    public Empleado(int legajo,String nombre,double sueldoBasico){
       this.legajo=legajo;
       this.nombre=nombre;
       this.sueldoBasico=sueldoBasico;
    }
    public Empleado(){
        legajo=0;
        nombre="";
        sueldoBasico=0.0;


    }

    public int getLegajo() {
        return legajo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }


}

