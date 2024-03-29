import java.util.Scanner;

// Clase Padre 
public class Jugador{

    // Variables pertenecientes a todos los juagadores
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamientos;

    //Constructor de objeto
    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    //Metodo para crear un nuevo jugador
    public static Jugador crearJugador(Scanner scanner) {
            System.out.println("IMPORTANTE: No utilices espacios");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("País: ");
            String pais = scanner.next();
            System.out.print("Faltas: ");
            int faltas = scanner.nextInt();
            System.out.print("Goles Directos: ");
            int golesDirectos = scanner.nextInt();
            System.out.print("Total de Lanzamientos: ");
            int totalLanzamientos = scanner.nextInt();

            System.out.println("Selecciona el tipo de jugador:");
            System.out.println("1. Portero");
            System.out.println("2. Extremo");
            int opcion = scanner.nextInt();

            //if que permite escoger el tipo de jugador 
            if (opcion == 1) {
                System.out.print("Paradas Efectivas: ");
                int paradasEfectivas = scanner.nextInt();
                System.out.print("Goles Recibidos: ");
                int golesRecibidos = scanner.nextInt();
                return new Portero(nombre, pais, faltas, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos);
            } else if (opcion == 2) {
                System.out.print("Pases: ");
                int pases = scanner.nextInt();
                System.out.print("Asistencias Efectivas: ");
                int asistenciasEfectivas = scanner.nextInt();
                return new Extremo(nombre, pais, faltas, golesDirectos, totalLanzamientos, pases, asistenciasEfectivas);
            } else {
                System.out.println("Opción inválida.");
            }
            return null;
    }
}