package paquete_test;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el precio: ");
        double price = scanner.nextDouble();

        System.out.println("Ingresa el iva: ");
        double iva = scanner.nextDouble();

        double ivaTotal = iva / 100;

        double total = price * (1 + ivaTotal);

        System.out.println("El total es: " + total);

    }
}
