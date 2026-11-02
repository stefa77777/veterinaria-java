import java.util.Scanner;

public class Perro  extends Mascota{
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public void mostrarInformacion() {
        System.out.print("[PERRO] ");
        super.mostrarInformacion();
        System.out.println("Raza: " + raza);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Goff, goff, goff, goff");
    }

}