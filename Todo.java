package todo;

public class Todo {
  public String texto;
  public Boolean estado;

  public Todo(String t){
    texto = t;
    estado = false;
  }

  public String getTexto(){
    return this.texto;
  }

  public Boolean getEstado(){
    return this.estado;
    }

  public void Editar(String t){
    texto = t;
  }
  public void Editar(Boolean e){
    estado = e;
  }
}
