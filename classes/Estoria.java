package classes;
import java.util.Scanner;

public class Estoria {
  public void statusPrint() {
    System.out.println("0 - Exibir status");
  }
  public int prologo(Scanner ler) {
    // Estória do prólogo
    System.out.println("No meio da noite, um evento místico invoca os espíritos dos antigos Heróis às terras da Costa de Krimpland.");
    pausa(6);
    System.out.println("Diante de seus olhos o mundo ainda é etéreo, coberto por uma bruma escura.");
    pausa(5);
    System.out.println("Uma força obscura guia os Heróis até um ponto especifico, uma cidade não muito distante do monastério de Havenshine, onde ele se encontram no momento.\n");
    pausa(7);
    System.out.println("Ainda abalados e fracos depois do ritual da ressureição, eles iniciam a jornada quando a voz do Alto Clérigo ecoa em sua mentes:");
    pausa(6);
    System.out.println("Alto Clérigo: Que os três Deuses sejam louvados por isso! A mágica funcionou!");
    pausa(5);
    System.out.println("Rápido, aproximam-se do altar, peguem suas armas que eu deixei e aproximam-se da sala principal da nossa catedral! ESTAMOS EM PERIGO!");
    pausa(5);

    System.out.println("...\n");
    pausa(1);

    System.out.println("Os heróis chegam à cidade com os primeiros raios da alvorada.");
    pausa(4);
    System.out.println("Do outro lado do portão uma visão de sangue os saúda.");
    pausa(4);
    System.out.println("Bando de Gremlins estão atacando pessoas e estabelecimentos e começando incêndios em toda parte.\n");
    pausa(5);

    System.out.println("A entrada da catedral é claramente visível para os heróis;");
    pausa(3);
    System.out.println("enquanto eles caminham na sua direção, alguma coisa chama a atenção deles.");
    pausa(3);
    System.out.println("Alguns humanos de aparência perigosa, vestindo pesadas armaduras de couro talhadas com estranhos símbolos, e portando, espadas de lâmina curva abrem um baú que se encontra sobre uma carroça");
    pausa(7);

    System.out.println("Mas, todos eles se voltam na direção dos heróis.");
    pausa(4);
    
    int op = prologoOp(ler);
    return op;
  }

  public int prologoOp(Scanner ler) {
    System.out.println("Escolha uma opção");
    System.out.println("1 - Expulsar os Assaltantes...");
    System.out.println("2 - Afastar-se");
    System.out.println("3 - Enfrentar os Assaltantes para roubar o baú...");
    statusPrint();
    System.out.print("Escolha sua opção: ");
    
    // Lendo a opção e mandando retorno
    int op = ler.nextInt();
    return op;
  }

  public int cena1_6(Scanner ler) {
    System.out.println("O herói vê um mercador ferido caído junto a sua carroça. Os assaltantes, sabendo que foram descobertos, preparam suas armas para o combate!");
    pausa(7);

    System.out.println("Dois assaltantes seguem para sua direção!");
    return 0;
  }

  public int cena1_7(Scanner ler) {
    System.out.println("Depois de uma olhada rápida, o herói decide que a missão é mais importante que este incidente menor.");
    pausa(5);
    System.out.println("Ele se afasta e continua em frente, os heróis deixam os humanos à mercê da própria sorte, seja ela qual for.");
    pausa(6);

    cena1_9();
    return 0;
  }

  public int cena1_8(Scanner ler) {

    System.out.println("cena 1.8");
    return 0;
  }
  
  public void cena1_9() {
    System.out.println("Com a ajuda dos heróis, o mercador consegue se mover atabalhoadamente para um lugar seguro com seus bens, mas, não antes de recompensá-los por sua ajuda.");
    pausa(7);
    System.out.println("Você recebeu uma poção de cura!");
  }

  public void pausa(int tempo) {
    // Pausando o sistema para ter o tempo de ler a estória
    try {
      // int ms = tempo * 1000;
      int ms = tempo;
      Thread.sleep(ms);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}