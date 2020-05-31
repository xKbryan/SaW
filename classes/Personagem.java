package classes;

public class Personagem {
  private String nome;
  private int xp;
  private int nivel;
  private int vitalidade;
  private int resistencia;
  private int forca;
  private int destreza;
  private int magia;
  private int sorte;
  private int critical;
  private int iniciativa;
  private int classe;

  public Personagem(String _nome, int _xp, int _nivel, int _vitalidade, int _resistencia, int _forca, int _destreza) {
    this.nome = _nome;
    this.xp = _xp;
    this.nivel = _nivel;
    this.vitalidade = _vitalidade;
    this.resistencia = _resistencia;
    this.forca = _forca;
    this.destreza = _destreza;
  }

  public void status() {
    System.out.println("Nome: " + getNome());
    System.out.println("Xp: " + getXp());
    System.out.println("Nível: " + getNivel());
    System.out.println("Vitalidade: " + getVitalidade());
    System.out.println("Resistencia: " + getResistencia());
    System.out.println("Força: " + getForca());
    System.out.println("Destreza: " + getDestreza());
    System.out.println("Magia: " + getMagia());
    System.out.println("Crítico: " + getCritical());
    System.out.println("Sorte: " + getSorte());
    System.out.println("Iniciativa: " + getIniciativa());
  }

  // Gets and Sets
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMagia() {
    return magia;
  }

  public void setMagia(int magia) {
    this.magia = magia;
  }

  public int getSorte() {
    return sorte;
  }

  public void setSorte(int sorte) {
    this.sorte = sorte;
  }

  public int getCritical() {
    return critical;
  }

  public void setCritical(int critical) {
    this.critical = critical;
  }

  public int getIniciativa() {
    return iniciativa;
  }

  public void setIniciativa(int iniciativa) {
    this.iniciativa = iniciativa;
  }

  public int getXp() {
    return xp;
  }

  public void setXp(int xp) {
    this.xp = xp;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
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

  public int getDestreza() {
    return destreza;
  }

  public void setDestreza(int destreza) {
    this.destreza = destreza;
  }

  public int getClasse() {
    return classe;
  }

  public void setClasse(int classe) {
    this.classe = classe;
  }
}
