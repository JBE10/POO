package negocio;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<Empleado>();
    }

    //Agregar el objeto empleado
    public boolean setListaEmpleados(Empleado e) {
        if (listaEmpleados.isEmpty()) {
            listaEmpleados.add(e);
        } else {
            for (int i = 0; i < listaEmpleados.size(); i++) {
                if (listaEmpleados.get(i).getLegajo() == e.getLegajo()) {
                    return false;
                }
            }
            listaEmpleados.add(e);
        }
        return true;
    }

    public Empleado obtenerEmpleado(int legajo) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getLegajo() == legajo) {
                return listaEmpleados.get(i);
            }
        }
        return null;
    }

    public Empleado masCobra() {
        int legajo = 0;
        if (listaEmpleados.isEmpty()) {
            return null;
        }
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getsueldoBasico() > listaEmpleados.get(legajo).getsueldoBasico()) {
                legajo = i;
            }

        }
        return listaEmpleados.get(legajo);
    }

    public boolean eliminarEmpleado(int legajo) {
        boolean existe = false;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getLegajo() == legajo) {
                listaEmpleados.remove(i);
                existe = true;
                return existe;
            }
        }
        return existe;
    }

    public double calcularTotalSueldos() {
        double sueldoTotal = 0;
        for (Empleado e : listaEmpleados) {
            sueldoTotal = sueldoTotal + e.calcularsueldoBasico();
        }
        return sueldoTotal;
    }

}
