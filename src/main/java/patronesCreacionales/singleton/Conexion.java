package patronesCreacionales.singleton;

public class Conexion {

	private String nombre;
	private static Conexion conexion;

	private Conexion(String nombre) {
		this.nombre = nombre;
	}

	public static Conexion getSingletonInstance(String nombre) {
		if (conexion == null) {
			conexion = new Conexion(nombre);
		} 
		return conexion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Conexion getConexion() {
		return conexion;
	}

	public static void setConexion(Conexion conexion) {
		Conexion.conexion = conexion;
	}
	
	
}
