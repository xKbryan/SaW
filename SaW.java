import java.util.Scanner;
import classes.Personagem;
import classes.Estoria;

class SaW {
  public static void main(String[] args) {
    // Instanciando o jogador, Scanner e o ato 1
    Personagem jogador = new Personagem();
    Scanner ler = new Scanner(System.in);
    Estoria ato1 = new Estoria();

    // Lendo como entrada o nome
    System.out.print("Seja bem vindo ao Sword and War, digite o nome: ");
    String nome = ler.nextLine();

    // Setando o nome do jogador
    jogador.setNome(nome);
    System.out.println("Bem vindo, " + jogador.getNome());

    // Fechando a instância de Scanner
    ler.close();

    // Executar o Prólogo do ato 1
    int op = ato1.prologo();

    // Receber a opção da ação feita no Prologo

    // if (op == 1) {
    //   op = ato1.cena1_6();
    // } else if (op == 2) {
    //   op = ato1.cena1_7();
    // } else if (op == 3) {
    //   op = ato1.cena1_8();
    // } else if (op == 0) {
    //   System.out.println("Abrindo atributos...");
    //   op = ato1.prologo();
    // }
  }
}