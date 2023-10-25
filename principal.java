import java.util.Scanner;

/**
 * Clase principal que solicita información básica de una figura y luego calcula y muestra su área y perímetro.
 *
 * @author [Tu nombre]
 *
 * @version 1.0
 *
 * @since 2023-10-24
 */
public class Principal {

    /**
     * Clase principal que inicia la ejecución de la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información básica de la figura
        System.out.println("Ingrese el nombre de la figura: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el color de la figura: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipoFigura = scanner.nextInt();

        Figura figura = null;
        switch (tipoFigura) {
            case 1:
                // Entrada para el círculo
                System.out.println("Ingrese la radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                // Entrada para el rectángulo
                System.out.println("Ingrese el valor del lado 1 del rectángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo: ");
                double lado2 = scanner.nextDouble();
                figura = new Rectángulo(nombre, color, lado1, lado2);
                break;
            case 3:
                // Entrada para el triángulo
                System.out.println("Ingrese el valor de la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo: ");
                double altura = scanner.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válido.");
                return;
        }

        // Calcular y mostrar el área y el perímetro de la figura
        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());

        scanner.close();
    }
}

/**
 * Clase Figura que representa una figura geométrica abstracta.
 *
 * @author [Tu nombre]
 */
abstract class Figura {

    /**
     * Nombre de la figura.
     */
    private String nombre;

    /**
     * Color de la figura.
     */
    private String color;

    /**
     * Constructor de la clase Figura.
     *
     * @param nombre Nombre de la figura.
     * @param color Color de la figura.
     */
    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Obtiene el nombre de la figura.
     *
     * @return El nombre de la figura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el color de la figura.
     *
     * @return El color de la figura.
     */
    public String getColor() {
        return color;
    }

    /**
     * Obtiene el área de la figura.
     *
     * @return El área de la figura.
     */
    public abstract double obtenerArea();

    /**
     * Obtiene el perímetro de la figura.
     *
     * @return El perímetro de la figura.
     */
    public abstract double obtenerPerimetro();
}

/**
 * Clase Circulo que representa un círculo.
 *
 * @author [Tu nombre]
 */
class Circulo extends Figura {

    /**
     * Radio del círculo.
    
