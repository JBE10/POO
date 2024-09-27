package administracion;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList<Producto>();
    }

    //cambiar en el digrama en Agregar productos a Boolen
    public boolean addProductos(Producto p) {
        for (Producto i : productos) {
            if (i.getIdProducto() == p.getIdProducto()) {
                return false;
            }
        }
        productos.add(p);
        return true;
    }

    public void MostrarProductos() {
        for (Producto i : productos) {
            System.out.print(i.getIdProducto());
            System.out.print(i.getDescripcion());
            System.out.print(i.getPrecioUnitario() + '\n');

        }
    }

    public Producto getProducto(int id) {
        for (Producto i : productos) {
            if (i.getIdProducto() == id) {
                return i;
            }
        }
        return null;
    }

    public boolean isStockMinimo(int id) {
        for (Producto i : productos) {
            if (i.getIdProducto() == id) {
                if (i.getStockTotal() <= i.getStockMinimo()) {
                    return true;
                }
                break;
            }

        }

        return false;
    }



}
