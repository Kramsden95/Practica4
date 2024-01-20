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
     * setNombre(String nuevoNombre) cambia el valor Nombre de la Persona en cuestion.
     * @param nuevoNombre cambia el valor del Nombre.
     */
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    /**
     * getEdad() consulta la edad de la Persona guardada en el Main.
     * @return devuelve la edad en cuestion.
     */
    public int getEdad(){
        return edad;
    }

    /**
     * setEdad(String nuevaEdad) cambia el valor Edad de la Persona en cuestion.
     * @param nuevaEdad cambia el valor del Edad.
     */
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    /**
     * getDNI() consulta el DNI de la Persona guardada en el Main.
     * @return devuelve el DNI en cuestion.
     */
    public String getDNI(){
        return DNI;
    }

    /**
     * setDNI(String nuevaEdad) cambia el valor DNI de la Persona en cuestion.
     * @param nuevoDNI cambia el valor del DNI.
     */
    public void setDNI(String nuevoDNI){
        DNI = nuevoDNI;
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
