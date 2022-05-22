package Domain;

public class Nodo {
    
    private String ID;
    private String Nombre;
    private String Carrera;
    private String Sede;
    private String Provincia;
    private Nodo siguiente; 

    //Constructor para insertar al inicio de la lista; 
    public Nodo(String ID, String Nombre, String Carrera,String Sede, String Provincia) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Sede = Sede;
        this.Provincia = Provincia;
    }

    //Constructor para insertar al final de la lista
    public Nodo(String ID, String Nombre,  String Carrera, String Sede, String Provincia, Nodo siguiente) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Sede = Sede;
        this.Provincia = Provincia;
        this.siguiente = siguiente;
    }

    public Nodo() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Edad) {
        this.Sede = Edad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  
}
