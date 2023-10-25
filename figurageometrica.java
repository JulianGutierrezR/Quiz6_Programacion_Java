/**
 * Clase FiguraGeometrica
 */
class FiguraGeometrica {
    // Atributos
    private String nombre;
    private String color;

    /**
     * Constructor para inicializar atributos.
     *
     * @param nombre Nombre de la figura.
     * @param color Color de la figura.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this color = color;
    }

    /**
     * Método que devuelve el área de la figura.
     *
     * @return Área de la figura
     */
    public double obtenerArea() {
        return 0.0;
    }

    /**
     * Método que devuelve el perímetro de la figura.
     *
     * @return Perímetro de la figura
     */
    public double obtenerPerimetro() {
        return 0.0;
    }

    /**
     * Método getter que permite obtener el nombre de la figura.
     *
     * @return Nombre de la figura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter que permite cambiar el nombre de la figura.
     *
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter que permite obtener el color de la figura.
     *
     * @return Color de la figura
     */
    public String getColor() {
        return color;
    }

    /**
     * Método setter que permite cambiar el color de la figura.
     *
     * @param color Nuevo color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
