import java.util.Scanner;

/**
 * Clase Triangulo que representa un triángulo.
 *
 * @author [Tu nombre]
 *
 * @version 1.0
 *
 * @since 2023-10-24
 */
public class Triangulo extends Figura {

    /**
     * Longitud de un lado del triángulo.
     */
    private double lado1;

    /**
     * Longitud de otro lado del triángulo.
     */
    private double lado2;

    /**
     * Constructor para inicializar atributos.
     *
     * @param nombre Nombre de la figura.
     * @param color Color de la figura.
     * @param lado1 Longitud de un lado del triángulo.
     * @param lado2 Longitud de otro lado del triángulo.
     */
    public Triangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Obtiene el área del triángulo.
     *
     * @return El área del triángulo.
     */
    @Override
    public double obtenerArea() {
        return (lado1 * lado2) / 2;
    }

    /**
     * Obtiene el perímetro del triángulo.
     *
     * @return El perímetro del triángulo.
     */
    @Override
    public double obtenerPerimetro() {
        // Calcular el perímetro del triángulo (suma de los lados)
        return lado1 + lado2 + calcularHipotenusa();
    }

    /**
     * Calcula la hipotenusa según el teorema de Pitágoras.
     *
     * @return La hipotenusa del triángulo.
     */
    private double calcularHipotenusa() {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }

    /**
     * Clase principal que solicita información básica de un triángulo y luego calcula y muestra su área y perímetro.
     *
     * @author [Tu nombre]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información básica del triángulo
        System.out.println("Ingrese el nombre del triángulo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el color del triángulo: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese el valor del lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();

        // Crear un objeto Triangulo
        Triangulo triangulo = new Triangulo(nombre, color, lado1, lado2);

        // Calcular y mostrar el área y el perímetro del triángulo
        System.out.println("Área del triángulo: " + triangulo.obtenerArea());
        System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());

        scanner.close();
    }
}
