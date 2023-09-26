//Clase hija, recibe atributos de Jugador 
public class Portero extends Jugador {

        //Variables Exclusivas de porteros
        private int paradasEfectivas;
        private int golesRecibidos;

        // Constructor objeto portero
        protected Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos) {
            super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
            this.paradasEfectivas = paradasEfectivas;
            this.golesRecibidos = golesRecibidos;
        }
    
        // Metodo para calcular la efectividad 
        protected double calcularEfectividad() {
            return ((paradasEfectivas - golesRecibidos) * 100.0 / (paradasEfectivas + golesRecibidos)) + (golesDirectos * 100.0 / totalLanzamientos);
        }
    }
    

