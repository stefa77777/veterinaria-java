public class Gato extends Mascota{
    private String color;

    public Gato(String color,int edad,String nombre) {
        super(nombre,edad);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void mostrarInformacion() {
        System.out.print("[GATO] ");
        super.mostrarInformacion();
        System.out.println("Color: " + color);
    }
    @Override
    public void emitirSonido() {
        System.out.println("Miau, miau, miau");
    }
}
