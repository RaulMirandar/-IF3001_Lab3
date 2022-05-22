package Domain;

public class Pila{

    private Nodo inicio;
    private int tamano;

    public Pila() {

        inicio = null;
        tamano = 0;

    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamano() {
        return tamano;
    }

    public void push(String ID, String Nombre, String Carrera, String Sede, String Provincia) {
        Nodo nuevo = new Nodo();

        nuevo.setID(ID);
        nuevo.setNombre(Nombre);
        nuevo.setCarrera(Carrera);
        nuevo.setSede(Sede);
        nuevo.setProvincia(Provincia);

        if (esVacia()) {
            inicio = nuevo;

        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
        tamano++;

    }

    public void pop() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamano--;

        }
    }

    public String top() throws Exception {
        if (!esVacia()) {
            return inicio.getID() + inicio.getNombre() + inicio.getCarrera() + inicio.getSede() + inicio.getProvincia();
        } else {
            throw new Exception("La pila se encuentra vacía");
        }

}
    public String buscarNombre(String nombre){
        String datos = "";
        Nodo aux = inicio;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if ( nombre.equals(aux.getNombre()) ){
                encontrado = true;
                datos = aux.getID() + aux.getNombre() + aux.getCarrera() + aux.getSede() +aux.getProvincia();
            }
            else{
                aux = aux.getSiguiente();
               
            }
        }
        
        if(!encontrado) {
            datos = ("No se encontró ese estudiante");
        }
        
        return datos;
    }
    
    public String buscarID(String ID){
        String datos = "";
        Nodo aux = inicio;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if ( ID.equals(aux.getID()) ){
                encontrado = true;
                datos = aux.getID() + aux.getNombre() + aux.getCarrera() + aux.getSede() +aux.getProvincia();
            }
            else{
                aux = aux.getSiguiente();
               
            }
        }
        
        if(!encontrado) {
            datos = ("No se encontró ese estudiante");
        }
        
        return datos;
    }
    
    
}
