package clases;


public class Persona {
    private String nombre;
    private String mail;
    private String dni;

    public Persona(String nombre, String mail, String dni) {
        this.nombre = nombre;
        this.mail = mail;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

