public class Mascota {
    //Atributos
    private String nombre;
    private int edad;
    private String animal;

    //Get y Set

    /**
     * getNombre() consulta el nombre de la Mascota guardada en el Main.
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
     * getEdad() consulta la edad de la Mascota guardada en el Main.
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
     * getAnimal() consulta el animal de la Mascota guardada en el Main.
     * @return devuelve el animal en cuestion.
     */
    public String getAnimal(){
        return animal;
    }

    /**
     * this.animal refiere al private String animal de arriba.
     * @param animal cambia this.animal al nuevo valor.
     */
    public void setDNI(String animal){
        this.animal = animal;
    }

    //Constructores
    public Mascota(){
    }
    public Mascota(String nuevoNombre, int nuevaEdad, String nuevoAnimal){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        animal = nuevoAnimal;
    }
}
