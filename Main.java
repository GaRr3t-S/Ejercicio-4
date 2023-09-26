import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jugador> jugadores = new ArrayList<>(); // Lista de objetos Jugador 

        int numJugadores;
        System.out.print("Ingrese la cantidad de jugadores a registrar: ");
        numJugadores = scanner.nextInt(); // Solicita el numero de jugadores a agregar

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Ingrese los datos del jugador " + (i + 1) + ":");
            Jugador jugador = Jugador.crearJugador(scanner);
            jugadores.add(jugador);// Llama al metodo crear juagador de la clase jugador 
        }
        scanner.close(); // Cierre de sacnner 

        //imprime los jugadores registrados hasta el momento
        System.out.println("Jugadores registrados:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre() + ", País: " + jugador.getPais()); 
        }

        List<Portero> porteros = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Portero) {
                porteros.add((Portero) jugador);
            }
        }
        
        //Comparación de porteros 
        Collections.sort(porteros, Comparator.comparingDouble(Portero::calcularEfectividad).reversed());

        //imprime los 3 mejores porteros segun la efectividad
        System.out.println("\nLos 3 mejores porteros:");
        for (int i = 0; i < Math.min(porteros.size(), 3); i++) {
            Portero portero = porteros.get(i);
            System.out.println((i + 1) + ". Nombre: " + portero.getNombre() + ", Efectividad: " + portero.calcularEfectividad());
        }

        //Imrpime los extremos con mas de 85% de efectividad
        int Exteff = 0;
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Extremo) {
                Extremo extremo = (Extremo) jugador;
                if (extremo.calcularEfectividad() > 85) {
                    Exteff++;
                }
            }
        }

        System.out.println("\nCantidad de extremos con más de un 85% de efectividad: " + Exteff);
    }
    
}
