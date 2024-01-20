public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String DNI;

    //Get y Set

    /**
     * getNombre() consulta el nombre de la Persona guardada en el Main.
     * @return devuelve el nombre en cuestion.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * this.nombre refiere al private String nombre de arriba.
     * @param nombre cambia this.nombre al nuevo valor.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * getEdad() consulta la edad de la Persona guardada en el Main.
     * @return devuelve la edad en cuestion.
     */
    public int getEdad(){
        return edad;
    }

    /**
     * this.edad refiere al private int edad de arriba.
     * @param edad cambia this.edad al nuevo valor.
     */
    public void setEdad(int edad){
        this.edad = edad;
    }

    /**
     * getDNI() consulta el DNI de la Persona guardada en el Main.
     * @return devuelve el DNI en cuestion.
     */
    public String getDNI(){
        return DNI;
    }

    /**
     * this.DNI refiere al private String DNI de arriba.
     * @param DNI cambia this.DNI al nuevo valor.
     */
    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    //Constructores
    public Persona(){
    }
    public Persona(String nuevoNombre, int nuevaEdad, String nuevoDNI){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        DNI = nuevoDNI;
    }
}
