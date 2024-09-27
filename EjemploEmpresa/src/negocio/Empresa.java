package negocio;

public class Empresa {
    Empleado empleado;

    public Empresa() {
        this.empleado=null;


    }

    public void setEmpleado(Empleado e) {
        if (e!=null){
            empleado = e;
        }

    }

    public Empleado getEmpleado() {

        Empleado e=new Empleado(empleado.getLegajo(),empleado.getNombre(), empleado.getSueldoBasico());
        return e;

    }
}
