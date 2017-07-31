
package af_jb_e3;


public class AF_JB_E3 {


    public static void main(String[] args) {
        
        //Creo una persona 
        Persona p1 = new Persona("Eduardo", 39);
        
        //Introducimos DNI
        p1.MeterDni("74658132V");
        
        //Introducimos descripción
        p1.MeterDesc("Guapísimo!");
        
        //Muestro los datos de la persona
        p1.MostrarPersona();
        
        //Cambio la edad
        p1.CambiarEdad(40);
        
        //Muestro de nuevo los datos para ver si funcina CambiarEdad
        p1.MostrarPersona();
        
        

    }
    
}
