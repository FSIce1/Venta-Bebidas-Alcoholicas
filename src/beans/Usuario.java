
package beans;

public class Usuario {
    
    private int id_usuario;
    private String cuenta_usuario;
    private String contra_usuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, String cuenta_usuario, String contra_usuario) {
        this.id_usuario = id_usuario;
        this.cuenta_usuario = cuenta_usuario;
        this.contra_usuario = contra_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCuenta_usuario() {
        return cuenta_usuario;
    }

    public void setCuenta_usuario(String cuenta_usuario) {
        this.cuenta_usuario = cuenta_usuario;
    }

    public String getContra_usuario() {
        return contra_usuario;
    }

    public void setContra_usuario(String contra_usuario) {
        this.contra_usuario = contra_usuario;
    }
    
}
