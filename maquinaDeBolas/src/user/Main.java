package user;

import dev.Maquina;

public class Main {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        System.out.println(maquina.getEstado());
        maquina.cargarPelotitas(1);
        System.out.println(maquina.getEstado());
        maquina.colocarMoneda(10);
        System.out.println(maquina.getEstado());
        maquina.giraManija();
        System.out.println(maquina.getEstado());
        maquina.dispensarPelotitas();
        System.out.println(maquina.getEstado());

    }
}