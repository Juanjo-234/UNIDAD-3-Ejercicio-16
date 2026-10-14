//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
ListaReproduccion playlist = new ListaReproduccion("Extios del Rock");

    playlist.agregarCancion("Bohemian Rhapsody - Queen");
    playlist.agregarCancion("Hotel California - Eagles");
    playlist.agregarCancion("Stairway to Heaven - Led Zeppelin");


    System.out.println("Reproduciendo: " + playlist.obtenerPistaActual());

    playlist.anterior();
    playlist.siguiente();
    playlist.siguiente();

    System.out.println("Pista actual definitiva: " + playlist.obtenerPistaActual());
}

