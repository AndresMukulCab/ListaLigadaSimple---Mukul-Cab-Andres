
package ListaSimple;
public class UsaLista {

    public static void main(String[] args) {
     
        ListaSimple lista = new ListaSimple();
        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "A");

        System.out.println("Lista antes de las operaciones:");
        lista.imprimir();
        
        // Se busca un nodo por su posición en este caso la posición 2
        int posicionBuscada = 2;
        Node nodoEnPosicion = lista.buscarPorPosicion(posicionBuscada);
        System.out.println("Nodo en la posición " + posicionBuscada + ": " + nodoEnPosicion.name);

        //se insertar un nuevo nodo antes del último el nodo "W"
        lista.insertarAntesUltimo("W");
        System.out.println("\nLista después de insertar antes del último:");
        lista.imprimir();

        // se intercambiar un nuevo nodo por otro buscado en este caso el nodo "H"
        Node nuevoNodo = new Node();
        nuevoNodo.name = "I";
        boolean intercambioExitoso = lista.intercambiarNodo("H", nuevoNodo);

        if (intercambioExitoso) {
            System.out.println("\nLista después de intercambiar un nodo:");
            lista.imprimir();
        } else {
            System.out.println("\nNodo no encontrado para intercambiar.");
        }
    }
}
