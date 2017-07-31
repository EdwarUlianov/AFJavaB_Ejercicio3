package af_jb_e3;

//Creo la clase Persona
public class Persona {
    
    //Atributos de la clase Persona
    private String nombre;
    private int edad;
    private String dni;
    private String descripcion;
    
    //Constructor de la clase
    public Persona (String n,int e){
    
        nombre = n; //Asigna el nombre
        edad = e;   //Asigna la edad
                
    }    
        
    //Métodos de la clase
    
    //Método para introducir el DNI
    public void MeterDni(String d){
        
        dni = d;   
    
    }
    
    //Método para introducir la descripción
    public void MeterDesc(String desc){
    
        descripcion = desc;
        
    }
    
    //Método para cambiar la edad de la persona
    public void CambiarEdad(int num){
    
        edad = num;
        
    }
    
    //Método para mostrar los datos de una persona
    public void MostrarPersona()
    {      
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Descripción: " + descripcion);
    }
               
    
    
    
}
