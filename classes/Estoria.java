package classes;
import java.util.Scanner;

public class Estoria {
  public int prologo() {
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
    System.out.println("Escolha uma opção");
    System.out.println("1 - Expulsar os Assaltantes...");
    System.out.println("2 - Afastar-se");
    System.out.println("3 - Enfrentar os Assaltantes para roubar o baú...");
    System.out.print("Escolha sua opção: ");
    
    // Lendo a opção e mandando retorno
    // Scanner aba = new Scanner(System.in);
    // String op = aba.nextLine();
    // aba.close();
    
    return 0;
  }

  public int cena1_6() {
    return 0;
  }

  public int cena1_7() {
    return 0;
  }

  public int cena1_8() {
    return 0;
  }

  public void pausa(int tempo) {
    // Pausando o sistema para ter o tempo de ler a estória
    try {
      int ms = tempo * 1000;
      Thread.sleep(ms);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}