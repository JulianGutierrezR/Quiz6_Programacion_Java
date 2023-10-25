import java.util.Scanner;

/**
 * Clase Rectangulo que representa un rectángulo.
 *
 * @author [Tu nombre]
 *
 * @version 1.0
 *
 * @since 2023-10-24
 */
public class Rectangulo extends Figura {

    /**
     * Longitud del primer lado del rectángulo.
     */
    private double lado1;

    /**
     * Longitud del segundo lado del rectángulo.
     */
    private double lado2;

    /**
     * Constructor para inicializar atributos.
     *
     * @param nombre Nombre de la figura.
     * @param color Color de la figura.
     * @param lado1 Longitud del primer lado del rectángulo.
     * @param lado2 Longitud del segundo lado del rectángulo.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Obtiene el área del rectángulo.
     *
     * @return El área del rectángulo.
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /**
     * Obtiene el perímetro del rectángulo.
     *
     * @return El perímetro del rectángulo.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }

    /**
     * Devuelve una cadena con la representación textual del rectángulo.
     *
     * @return La representación textual del rectángulo.
     */
    @Override
    public String toString() {
        return "Rectángulo{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }

    /**
     * Clase principal que solicita información básica de un rectángulo y luego calcula y muestra su área y perímetro.
     *
     * @author [Tu nombre]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información básica del rectángulo
        System.out.println("Ingrese el nombre del rectángulo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el color del rectángulo: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese el valor del lado 1 del rectángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado 2 del rectángulo: ");
        double lado2 = scanner.nextDouble();

        // Crear un objeto Rectangulo
        Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);

        // Calcular y mostrar el área y el perímetro del rectángulo
        System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());

        scanner.close();
    }
}
