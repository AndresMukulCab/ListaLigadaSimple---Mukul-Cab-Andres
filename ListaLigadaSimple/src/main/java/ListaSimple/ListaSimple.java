
package ListaSimple;

public class ListaSimple{
	Node top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}

	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}
        
            //Métodos para la tarea 
            //Método para buscar un nodo por su posición
        public Node buscarPorPosicion(int posicion) {
            Node temp = top;
            //contador para buscar la posicion actual del nodo
            int contador = 0;
            
            //se recorre la lista mientras el nodo no sea nulo y no se alcance la posisicion
            while (temp != null && contador < posicion) {
            temp = temp.next;
            contador++;
             }
            //se devuele el nodo encontrado y si no se econtro pues se devuelve un null
             return temp;
        }
             //Metodo para insertar un nuevo nodo antes del último
        public void insertarAntesUltimo(String nombre) {
            //se crea el nodo y su nombre
            Node temp = new Node();
            temp.name = nombre;
            temp.next = null;
            
            //ver si la lista esta vacia o no
             if (top == null) {
            top = temp;
            return;
            }
             //nodo temporal
              Node temp2 = top;
              //recorrer la lista hasta el ultimo nodo
              while (temp2.next != null && temp2.next.next != null) {
            temp2 = temp2.next;
               }
              //se enlaza el nuevo nodo antes del ultimo
              temp.next = temp2.next;
              temp2.next = temp;
              }

               public boolean intercambiarNodo(String nombreBuscado, Node nuevoNodo) {
            //nodo temporal
            Node temp = top;
            //se busca el nodo con su nombre
            while (temp != null && !temp.name.equals(nombreBuscado)) {
                temp = temp.next;
            }
            //revisar si se encontró el nodo con el nombre
            if (temp != null) {
                //se intercambia el nodo encontrado por el nuevo
                nuevoNodo.next = temp.next;
                temp.next = nuevoNodo;
                return true;
            }
              return false; // Indicar que el nodo buscado no fue encontrado
}
}













