package patronesCreacionales.singleton;

public class Main {

public static void main(String[] args) {
        
	Conexion conMysql = Conexion.getSingletonInstance("MySql");
    Conexion conOracle = Conexion.getSingletonInstance("Oracle");
    
    // conMysql y conOracle son referencias a un único objeto de la clase Conexion
    System.out.println("conexion con BD : " + conMysql.getNombre());
    System.out.println("conexion con BD : " + conOracle.getNombre()); 
    }
}
