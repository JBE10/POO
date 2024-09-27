package usuario;

import negocio.Hornero;
import negocio.IVolar;

public class Main {
    public static void main(String[] args) {
        IVolar volador = new Hornero();
        hacerVolar(volador);



    }
    private static void hacerVolar(IVolar volador) {
        volador.despegar();
        volador.volar();
        volador.aterrizar();
    }
}