
package ed2;

public class ED2 {

    public static String veredicto(String modulos, String horas){
        if(Integer.parseInt(modulos) > Integer.parseInt(horas)) 
            return "Poco tiempo de estudio. Debes dedicar más tiempo";
        else if (modulos.equals(horas))
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        return "Ideal. Trabajas los contenidos en casa.";
    }
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        
        System.out.println(veredicto(args[1], args[2]));
        
    }
    
}
