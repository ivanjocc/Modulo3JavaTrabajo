package paquete_test;

public class Main {

    public static void main(String[] args) {
        double precio = precioIVA(2423, 19);
        System.out.println(precio);

    }

    public static double precioIVA(double price, double iva) {
        double precioIVA = price * (1 + (iva / 100));
        return precioIVA;
    }
}
