package PersonasYAlumnos;

public class Persona {
	public static String nombrePersona;
	public static String eMail;
	public static int dni;
	
	public Persona (String nombrePersona, String eMail, int dni) {
		this.nombrePersona = nombrePersona;
		this.eMail = eMail;
		this.dni = dni;
	}
	
	public String getNombrePersona() {
		return nombrePersona;
	}

	public String getEMail() {
		return eMail;
	}
	
	public int getDNI() {
		return dni;
	}
	
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	
	public void setDNI(int dni) {
		this.dni = dni;
	}
}
