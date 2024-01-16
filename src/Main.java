public class Main {
    public static void main(String[] args) {

        Persona Tom = new Persona("Tom",30,"X8500000P");

        int edad = 28;
        String nombre = "Kane";
        if (Tom.getEdad() > edad){
            System.out.println(Tom.getNombre() + " es mayor que " + nombre);
        } else if (Tom.getEdad() == edad){
            System.out.println(Tom.getNombre() + " y " + nombre + " tienen la misma edad");
        } else {
            System.out.println(Tom.getNombre() + " es menor que " + nombre);
        }
    }
}