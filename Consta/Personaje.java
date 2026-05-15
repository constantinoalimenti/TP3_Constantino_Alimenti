public class Personaje {
    String nombre;
    int vida;
    int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Nivel: " + nivel);
        System.out.println("-------------------------");
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("Subiste de nivel");
        System.out.println("-------------------------");
    }

    public void puedeLuchar() {
        if (vida > 0) {
            System.out.println("Puede luchar");
        } else {
            System.out.println("Esta derrotado");
        }
        System.out.println("-------------------------");
    }

    public void entrenar() {
        for (int i = 1; i <= 3; i++) {
            this.nivel++;
            System.out.println("Nivel actual: " + nivel);
        }
        System.out.println("-------------------------");
    }

    public void recibirDaño() {
        while (vida > 0) {
            this.vida -= 10;
            if (vida < 0) vida = 0;
            System.out.println("Vida actual: " + vida);
        }
        System.out.println("El personaje ha sido derrotado");
        System.out.println("-------------------------");
    }
}
