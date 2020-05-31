import java.util.Scanner;
import classes.Personagem;
import classes.Estoria;

class SaW {
  public static void main(String[] args) {
    // Instanciando o Scanner e o ato 1
    Scanner ler = new Scanner(System.in);
    Estoria ato1 = new Estoria();

    // Lendo como entrada o nome
    System.out.print("Seja bem vindo ao Sword and War, digite o nome: ");
    String nome = ler.nextLine();

    System.out.println("1 - Mago");
    System.out.println("2 - Arqueiro");
    System.out.println("3 - Bárbaro");
    System.out.println("4 - Anão");
    System.out.print("Escolha uma classe para " + nome + ": ");
    int classe = ler.nextInt();

    int xp = 0, niv = 0, vit = 0, res = 0, forc = 0, des = 0, mag = 0 , sort = 0, ini = 0, cri = 0;
    switch (classe) {
      case 1:
        niv = 6;
        vit = 7;
        res = 4;
        forc = 2;
        des = 4;
        mag = 9;
        break;
        
      case 2:
        niv = 7;
        vit = 5;
        res = 3;
        forc = 3;
        des = 8;
        sort = 1;
        break;
        
      case 3:
        niv = 8;
        vit = 9;
        res = 8;
        forc = 7;
        des = 2;
        cri = 3;
        break;

      case 4:
        niv = 9;
        vit = 8;
        res = 8;
        forc = 7;
        des = 5;
        ini = 4;
        break;
    }

    Personagem jogador = new Personagem(nome, xp, niv, vit, res, forc, des);

    jogador.setClasse(classe);
    jogador.setMagia(mag);
    jogador.setSorte(sort);
    jogador.setCritical(cri);
    jogador.setIniciativa(ini);

    // jogador.status();
    System.out.println("Bem vindo, " + jogador.getNome());

    // Fechando a instância de Scanner
    // ler.close();

    // Executar o Prólogo do ato 1
    int op = ato1.prologo(ler);

    System.out.println(op);

    // Receber a opção da ação feita no Prologo

    do {
      if (op == 1) {
        op = ato1.cena1_6(ler);
        // Sistema de batalha
      } else if (op == 2) {
        op = ato1.cena1_7(ler);
      } else if (op == 3) {
        op = ato1.cena1_8(ler);
      } else if (op == 0) {
        System.out.println("Abrindo atributos...");
        jogador.status();
      } else {
        // op = ato1.check(op);
      }

      if (op == 0) {
        op = 4;
      }
    } while (op > 0 || op < 4);

  }
}