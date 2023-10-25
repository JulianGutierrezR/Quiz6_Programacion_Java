/**
 * Clase Circulo que hereda de FiguraGeometrica
 */
class Circulo extends FiguraGeometrica {
    // Atributos
    private double radio;

    /**
     * Constructor para inicializar atributos
     *
     * @param nombre Nombre de la figura
     * @param color Color de la figura
     * @param radio Radio del círculo
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método que obtiene el área de la figura.
     *
     * @return Área de la figura
     */
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Método que permite obtener el perímetro de la figura.
     *
     * @return Perímetro de la figura
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
