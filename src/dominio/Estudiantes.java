
package dominio;

public class Estudiantes {
  private String nombre;
  private String sexo;
  private double []nota;
  private int altaCalificacion;
  private int numeroEstudiantes;
  
  public Estudiantes(String nombre,String sexo, double nota) {
      this.nombre=nombre;
      this.sexo=sexo;
  }
  
  public String getEstudiante() {
      return estudiante;
  }
  
  public char getSexo() {
      return sexo;
  }
  
  public void setNota(double nota[]) {
  this.nota=nota;
  }
  
  public int getAltaCalificacion() {
      return altaCalificacion;
  }
  @Override
  public String toString() {
      return this.estudiante+" "+this.sexo+" "+this.nota+" ";
  }
}
