package test;
// IF3001 Algoritmos y Estructuras de Datos
// Lab #3 Pilas y colas
// Estudiantes: 
//Joseph Cantarero Alvarado C11614
//Raul Miranda Vargas C14813
import Domain.*;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Estudiante student = new Estudiante();

        String ID;
        String Nombre;
        String Carrera;
        String Sede;
        String Provincia; 

        Scanner sc = new Scanner(System.in);
        int option = 0;
        int posicion = 0; 
        System.out.println("------------Menu de Inicio------------\n");
        do {
            try {
                System.out.println("1: Ingrese estudiante\n"
                        + "2.  Mostrar estudiantes por ID\n" 
                        + "3.  Mostrar estudiantes por nombre\n" 
                        + "4.  Mostrar estudiantes con todos los datos\n" 
                        + "5.  Mostrar un solo estudiante y su id\n" 
                        + "6.  Mostrar un solo estudiante por nombre\n"
                        + "7.  Mostrar un estudiante por posición\n" 
                        + "8.  Modificar datos de un estudiante por ID\n" 
                        + "9.  Eliminar un estudiante por posicion\n" 
                        + "10. Mostrar cantidad de estudiantes\n" 
                        + "11. Salir\n" 
                        + "\n"
                        + "Ingrese una opción: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Ingrese el ID del Estudiante: ");
                        ID = sc.next();
                        System.out.println("Ingrese el Nombre del Estudiante: ");
                        Nombre = sc.next();
                        System.out.println("Ingrese la Carrera del Estudiante: ");
                        Carrera = sc.next();
                        System.out.println("Ingrese la Sede en la que se encuentra empadronado: ");
                        Sede = sc.next();
                        System.out.println("Ingrese la Provincia de la que proviene: ");
                        Provincia = sc.next();
                        student.agregarInicio(ID, Nombre, Carrera, Sede, Provincia);

                        break; 
                    case 2:
                        student.recorrerPorID();
                       
                        break;
                    case 3:
                        student.recorrerPorNombre();
                        break; 
                    case 4: 
                         student.mostrarLista();
                        break; 
                    case 5: 
                        System.out.println("Ingrese la ID del estudiante: ");
                        ID = sc.next(); 
                        System.out.println(student.mostrarEstudiantePorID(ID));
                        break;
                    case 6: 
                        System.out.println("Ingrese el Nombre del Estudiante: ");
                        Nombre = sc.next(); 
                        System.out.println(student.mostrarEstudiantePorNombre(Nombre));
                        break;
                    
                    case 7: 
                        System.out.println("Ingrese la posición del estudiante en la lista: ");
                        posicion = sc.nextInt(); 
                        System.out.println(student.getEstudiante(posicion));
                        break;
                        
                    case 8:
                        System.out.println("Ingrese la id del estudiante a modificar");
                        ID = sc.next(); 
                        System.out.println("Ingrese el nuevo Id del Estudiante");
                        String nuevoId = sc.next();
                        System.out.println("Ingrese el nuevo Nombre del Estudiante");
                        Nombre = sc.next(); 
                        System.out.println("Ingrese la nueva Carrera del Estudiante");
                        Carrera = sc.next(); 
                        System.out.println("Ingrese la nueva Sede del Estudiante");
                        Sede = sc.next(); 
                        System.out.println("Ingrese la nueva Provincia del Estudiante");
                        Provincia = sc.next();
                        boolean modificacion = student.editarEstudiante(ID, nuevoId, Nombre, Carrera, Sede, Provincia);
                        if(modificacion) {
                            System.out.println("Modificación exitosa");
                        }
                        else {
                            System.out.println("No se pudo realizar la modificacion");
                        }
                        break;
                    
                    case 9: 
                        
                        System.out.println("Ingrese la posicion del estudiante a eliminar");
                        int eliminar = sc.nextInt();
                        student.eliminarEstudiante(eliminar);
                        
                        break;
                        
                    case 10:
                        System.out.println("La cantidad de estudiantes que hay en la lista es: " + student.getTamanio());
                        break;                            
                }
            } catch (Exception e) {

            }

        } while (option != 11);

    }
}
