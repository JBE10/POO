package ejecutar;

import negocio.Administracion;
import negocio.Empleado;
import negocio.Empresa;

import java.util.Scanner;

public class Main {

    static Empresa shell=new Empresa();

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        Empleado e;
        int opticon;
        String nombre;
        double sueldo;


        do {
            System.out.println("Ingrese '1'(Agregar empleado)|'2'(Obtener Empleado)|'3'(Mayor sueldo)|'4'(Eliminar empleado)|'0'(Salir): ");
            opticon= teclado.nextInt();
            if (opticon==1){
                ingresarEmpleado();
            } else if (opticon==2) {
                getEmpleado();

            } else if (opticon==3) {
                getMayorSueldo();
            } else if (opticon==4) {
                delEmpleado();

            }

        }while (opticon>0);


    }

    public static void ingresarEmpleado(){
        Empleado e=new Empleado();
        Scanner tecladoDos=new Scanner(System.in);
        boolean repe;

        System.out.println("Ingrese el legajo: ");
        e.setLegajo(tecladoDos.nextInt());
        System.out.println("Ingrese el Nombre: ");
        e.setNombre(tecladoDos.next());
        System.out.println("Ingrese el Sueldo: ");
        e.calcularsueldoBasico(tecladoDos.nextDouble());

        repe =shell.setListaEmpleados(e);
        if (!repe){
            System.out.println("El Empleado no fue ingresado porque existe otro igual");
        }
        else {
            System.out.println("Agregado correctamente");
        }

    }
    public static void getEmpleado(){
        int legajo;
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingrese el numero de legajo");
        legajo = teclado.nextInt();
        Empleado e= shell.obtenerEmpleado(legajo);
        if (e==null){
            System.out.println("El legajo "+legajo +" no existe");
        }
        else {
            System.out.println("Legajo:"+e.getLegajo()+" Nombre:"+e.getNombre()+" Sueldo:"+ e.getsueldoBasico());
        }

    }
    public static void getMayorSueldo(){
        Empleado e=shell.masCobra();
        if (e==null){
            System.out.println("La lista empleados esta vacia");

        }
        else {
            System.out.println("El legajo con mayor sueldo es: "+e.getLegajo()+" Su nomnbre es: "+e.getNombre()+" y su sueldo es: " +e.getsueldoBasico());
        }
    }
    public static void delEmpleado(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba el legajo que quieres eliminar");
        boolean e=shell.eliminarEmpleado(teclado.nextInt());
        if (e){
            System.out.println("Empleado ELIMINADO");
        }
        else {
            System.out.println("Empleado NO EXISTE");
        }

    }
}