package usuario;
import negocio.*;
import java.util.*;



public class Ejecucion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        Empresa empresa=new Empresa();
        Empleado e=new Empleado();
        int legajo;
        String nombre;
        double sueldo;
        System.out.println("Ingrese el legajo del empleado: ");
        legajo= sc.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre= sc.next();
        System.out.println("Ingrese el sueldo del empleado: ");
        sueldo= sc.nextDouble();
        e.setLegajo(legajo);
        e.setNombre(nombre);
        e.setSueldoBasico(sueldo);

        empresa.setEmpleado(e);
        Empleado empleadodelaempresa;
        empleadodelaempresa=empresa.getEmpleado();
        System.out.println("Legajo  de ll empleado de la empresa "+ empleadodelaempresa.getLegajo());
        System.out.println("el legajo del empleado es "+ empresa.getEmpleado().getLegajo());





    }
}
