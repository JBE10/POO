package negocio;

public class Administracion extends Empleado{
    private int hsExtras;
    public Administracion(int legajo, String nombre, double sueldoBasico, int hsExtras) {
        super(legajo, nombre, sueldoBasico);
        this.hsExtras = hsExtras;
    }
    public Administracion() {

        super();
        this.hsExtras = 0;
    }
    public double calcularsueldoBasico(){
        double total =this.sueldoBasico+ (this.sueldoBasico*0.10*hsExtras);
        return total;
    }
    public int getHsExtras() {
        return hsExtras;
    }
    public void setHsExtras(int hsExtras) {
        this.hsExtras = hsExtras;
    }


}
