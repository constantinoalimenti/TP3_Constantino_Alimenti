public class Main {
    public static void main(String[] args) {
        Personaje miPersonaje = new Personaje("Guerrero", 50, 1);

        miPersonaje.mostrarEstado();
        miPersonaje.puedeLuchar();
        miPersonaje.entrenar();
        miPersonaje.subirNivel();
        miPersonaje.recibirDanio();
    }
}