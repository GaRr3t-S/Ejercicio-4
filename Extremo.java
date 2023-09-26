//Clase hija recibe atributos de Jugador
public class Extremo extends Jugador {

        //Variable exclusivas de extremo
        private int pases;
        private int asistenciasEfectivas;

        //Constructor objeto extremo
        protected Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pases, int asistenciasEfectivas) {
            super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
            this.pases = pases;
            this.asistenciasEfectivas = asistenciasEfectivas;
        }
        
        //Metodo efectividad extremo
        protected double calcularEfectividad() {
            return ((pases + asistenciasEfectivas - faltas) * 100.0 / (pases + asistenciasEfectivas + faltas)) + (golesDirectos * 100.0 / totalLanzamientos);
        }
    }

