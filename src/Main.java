import GitPackage.Mascota;

public class Main {
    public static void main(String[] args) {

        Mascota Kartoshka = new Mascota("Kartoshka",9,"Gato");

        int edad = 5;
        String nombre = "Kasper";
        if (Kartoshka.getEdad() > edad){
            System.out.println(Kartoshka.getNombre() + " es mayor que " + nombre);
        } else if (Kartoshka.getEdad() == edad){
            System.out.println(Kartoshka.getNombre() + " y " + nombre + " tienen la misma edad");
        } else {
            System.out.println(Kartoshka.getNombre() + " es menor que " + nombre);
        }
    }
}