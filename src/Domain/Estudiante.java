package Domain;

public class Estudiante {

    public Nodo inicio, fin; //Punteros para saber donde està el inicio y donde està el fin de la lista
    private int tamanio;

    public Estudiante() {
        inicio = null;
        fin = null;
        tamanio = 0;

    }

    //Método para agregar al inicio
    public void agregarInicio(String ID, String Nombre, String Carrera, String Sede, String Provincia) {
        inicio = new Nodo(ID, Nombre, Carrera, Sede, Provincia, inicio);
        if (fin == null) {
            fin = inicio;

        }
        tamanio++;
    }

    public void mostrarLista() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.println("ID: " + recorrer.getID() + ",Nombre: " + recorrer.getNombre() + ", Carrera: " + recorrer.getCarrera()+ ", Sede: " + recorrer.getSede()
                    + ", Provincia: " + recorrer.getProvincia());
            recorrer = recorrer.getSiguiente();
        }

    }

    public void recorrerPorID() {
        Nodo recorreID = inicio;
        System.out.println("Id de Estudiantes");
        while (recorreID != null) {
            System.out.println("ID: " + recorreID.getID() + " Nombre del estudiante: " + recorreID.getNombre());
            recorreID = recorreID.getSiguiente();
        }
    }

    public void recorrerPorNombre() {
        Nodo recorreNombre = inicio;
        System.out.println("Recorrido de estudiantes por nombre: ");
        while (recorreNombre != null) {
            System.out.println("Nombre: " + recorreNombre.getNombre());
            recorreNombre = recorreNombre.getSiguiente();
        }
    }

    public String getEstudiante(int posicion) {

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {
                return "Nombre: "+inicio.getNombre()+" Carrera: " + inicio.getCarrera()+ " Sede: " + inicio.getSede()+ " Provincia: "+  inicio.getProvincia();
            } else {
                Nodo aux = inicio;
                
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return "Nombre: "+aux.getNombre()+" Carrera: " + aux.getCarrera()+ " Sede: " + aux.getSede() + " Provincia: "+  aux.getProvincia();

            }

        }
        return null;
    }
    
    public boolean editarEstudiante(String id, String nuevoId, String nombre,  String carrera, String sede, String provincia){
         int posicion = buscarID(id);
         boolean modificacion = false;
        if (posicion != -1) {
            Nodo aux = inicio;
            for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente(); 
                }
                aux.setID(nuevoId);
                aux.setNombre(nombre); 
                aux.setCarrera(carrera);
                aux.setSede(sede);
                aux.setProvincia(provincia);
                modificacion = true;
            
        }
        return modificacion;
    }
    
    public boolean eliminarEstudiante(int posicion) {
        
        boolean eliminado = false;
        if(posicion >= 0 && posicion < tamanio) {
            if(posicion == 0){    
                inicio = inicio.getSiguiente();
            }
            
            else{
                Nodo aux = inicio;
                
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            
            tamanio--;
            eliminado = true;
        }
        
        return eliminado;
    }
    
    public String mostrarEstudiantePorID(String id) {
       
        int posicion = buscarID(id);
        String datos;
        
        if(posicion != -1) {
            
            datos = getEstudiante(posicion); 
        }
        else {
            datos = "No se encontro al estudiante";
        }
        return datos;
    }
    
    public String mostrarEstudiantePorNombre(String nombre) {
       
        int posicion = buscarNombre(nombre);
        String datos;
        
        if(posicion != -1) {
            
            datos = getEstudiante(posicion); 
        }
        else {
            datos = "No se encontro al estudiante";
        }
        return datos;
    }
    
    
    
    public int buscarID(String id){
        int posicion = 0;
        Nodo aux = inicio;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if ( id.equals(aux.getID()) ){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
                posicion++;
            }
        }
        
        if(!encontrado) {
            posicion = -1;
        }
        
        return posicion;
    }
    
    public int buscarNombre(String nombre){
        int posicion = 0;
        Nodo aux = inicio;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if ( nombre.equals(aux.getNombre()) ){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
                posicion++;
            }
        }
        
        if(!encontrado) {
            posicion = -1;
        }
        
        return posicion;
    }
    public int getTamanio() {
        return tamanio;
    }

}
