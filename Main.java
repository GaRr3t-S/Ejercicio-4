import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jugador> jugadores = new ArrayList<>();

        int numJugadores;
        System.out.print("Ingrese la cantidad de jugadores a registrar: ");
        numJugadores = scanner.nextInt();

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Ingrese los datos del jugador " + (i + 1) + ":");
            Jugador jugador = Jugador.crearJugador(scanner);
            jugadores.add(jugador);
        }
        scanner.close();
    }
}
