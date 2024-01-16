public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String DNI;

    //Get y Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
    public String getDNI(){
        return DNI;
    }
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
