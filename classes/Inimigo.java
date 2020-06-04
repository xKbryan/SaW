package classes;

public class Inimigo {
  private String nome;
  private int vitalidade;
  private int resistencia;
  private int forca;

  public Inimigo(String nome, int vitalidade, int resistencia, int forca) {
    this.nome = nome;
    this.vitalidade = vitalidade;
    this.resistencia = resistencia;
    this.forca = forca;
  }

  public void status() {
    System.out.println("Nome: " + getNome());
    System.out.println("Vitalidade: " + getVitalidade());
    System.out.println("Resistencia: " + getResistencia());
    System.out.println("Força: " + getForca());
  }

  // Gets and Sets
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVitalidade() {
    return vitalidade;
  }

  public void setVitalidade(int vitalidade) {
    this.vitalidade = vitalidade;
  }

  public int getResistencia() {
    return resistencia;
  }

  public void setResistencia(int resistencia) {
    this.resistencia = resistencia;
  }

  public int getForca() {
    return forca;
  }

  public void setForca(int forca) {
    this.forca = forca;
  }
}