
package Domain;

public class Cola {
    
    private Nodo head,rear;

    public Cola() {
        head = null;
        rear = null;
       
    }
     public boolean esVacia() {
        return head == null;
    }
    
     public void enqueue(String ID, String Nombre, String Carrera, String Sede, String Provincia){
     Nodo nuevo = new Nodo();
     
        nuevo.setID(ID);
        nuevo.setNombre(Nombre);
        nuevo.setCarrera(Carrera);
        nuevo.setSede(Sede);
        nuevo.setProvincia(Provincia);
        
       if(esVacia()){
       head = nuevo;
       }else if(rear == null){    
       rear = nuevo;
       head.setSiguiente(rear);
       }else {
       rear.setSiguiente(nuevo);
       rear = nuevo;
       }
     }
     
         public String dequeue() {
        Nodo nuevo = new Nodo();
        String info = "";
        if (!esVacia()) {
            info = head.getID() + head.getNombre() + head.getCarrera() + head.getSede() + head.getProvincia();
        }
        if (head == rear) {
            head = null;
            rear = null;
        } else {
            head = head.getSiguiente();
        }
        return info;
    }
     
     
     
       public String top() throws Exception {
        if (!esVacia()) {
            return head.getID() + head.getNombre() + head.getCarrera() + head.getSede() + head.getProvincia();
        } else {
            throw new Exception("La cola se encuentra vacía");
        }

}
}
