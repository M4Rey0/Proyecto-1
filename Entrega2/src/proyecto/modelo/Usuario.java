package proyecto.modelo;

public class Usuario {

  private String idUsuario;
  private String Hnombre;
  private String email;
  private String password;

  public Usuario(String idUsuario, String Hnombre, String email, String password){
    this.idUsuario = idUsuario;
    this.Hnombre = Hnombre;
    this.email = email;
    this.password = password;
  }

  //fetters & setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getHnombre() {
        return Hnombre;
    }

    public void setHnombre(String Hnombre) {
        this.Hnombre = Hnombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


  
}
