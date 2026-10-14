import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {
    private String nombreLista;
    private List<String> canciones;
    private int indicePistaActual;


    public ListaReproduccion(String nombreLista){
        this.nombreLista = nombreLista;
        this.canciones = new ArrayList<>();
        this.indicePistaActual = -1;
    }

    public void siguiente(){
        if(canciones.isEmpty()){
            System.out.println("La lista de reproduccion esta vacia.");
            return;
        }
        if(indicePistaActual < canciones.size() -1){
            indicePistaActual++;
            System.out.println("Avanzando a la pista: " + obtenerPistaActual());
        } else {
            System.out.println("Límite alcanzado: Ya estás en la última pista de la lista.");
        }

    }

    public void anterior(){
        if(canciones.isEmpty()){
            System.out.println("La lista de reproduccion esta vacia.");
            return;
        }
        if(indicePistaActual > 0){
            indicePistaActual--;
            System.out.println("Retrocediendo a la pista: " + obtenerPistaActual());
        } else {
            System.out.println("Límite alcanzado: Ya estás en la primera pista de la lista.");
        }

    }

    public void agregarCancion(String cancion){
        this.canciones.add(cancion);
        if (this.indicePistaActual == -1 && !this.canciones.isEmpty()) {
            this.indicePistaActual = 0;
        }
    }

    public String obtenerPistaActual() {
        if (indicePistaActual >= 0 && indicePistaActual < canciones.size()) {
            return canciones.get(indicePistaActual);
        }
        return "No hay ninguna pista seleccionada.";
    }

}
