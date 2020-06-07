package classes;
import java.util.Scanner;

public class Estoria {
  public void statusPrint() {
    System.out.println("0 - Exibir status");
  }
  public int prologo(Scanner ler) {
    // Estória do prólogo
    System.out.println("No meio da noite, um evento místico invoca os espíritos dos antigos Heróis às terras da Costa de Krimpland.");
    pausa(5);
    System.out.println("Diante de seus olhos o mundo ainda é etéreo, coberto por uma bruma escura.");
    pausa(4);
    System.out.println("Uma força obscura guia os Heróis até um ponto especifico, uma cidade não muito distante do monastério de Havenshine, onde ele se encontram no momento.\n");
    pausa(6);
    System.out.println("Ainda abalados e fracos depois do ritual da ressureição, eles iniciam a jornada quando a voz do Alto Clérigo ecoa em sua mentes:");
    pausa(5);
    System.out.println("Alto Clérigo: Que os três Deuses sejam louvados por isso! A mágica funcionou!");
    pausa(4);
    System.out.println("Rápido, aproximam-se do altar, peguem suas armas que eu deixei e aproximam-se da sala principal da nossa catedral! ESTAMOS EM PERIGO!");
    pausa(4);

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
    pausa(6);

    System.out.println("Mas, todos eles se voltam na direção dos heróis.");
    pausa(3);
    
    int op = prologoOp(ler);
    return op;
  }

  public int prologoOp(Scanner ler) {
    System.out.println("Escolha uma opção");
    System.out.println("1 - Expulsar os Assaltantes...");
    System.out.println("2 - Afastar-se");
    System.out.println("3 - Enfrentar os Assaltantes para roubar o baú...");
    // statusPrint();
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
    System.out.println("Avaliando a situação, o herói rapidamente decide que o que quer que esteja dentro do baú pode ser útil para sua missão.");
    pausa(5);
    System.out.println("Os assaltantes, sabendo que foram descobertos arremessam uma Adaga envenenada contra o herói e desaparecem as chamas");
    pausa(4);
    return 0;
  }
  
  public void cena1_9() {
    System.out.println("Com a ajuda dos heróis, o mercador consegue se mover atabalhoadamente para um lugar seguro com seus bens, mas, não antes de recompensá-los por sua ajuda.");
    pausa(7);
    System.out.println("Você recebeu uma poção de cura!");
    fim();
  }

  public void cena1_0() {
    System.out.println("Ignorando o ataque da Adaga, o assaltante sofre um ataque do herói e não resiste.");
    pausa(6);
    System.out.println("O herói então abre o baú.");
    pausa(3);
    System.out.println("Você recebeu 200 moedas de ouro!");
    fim();

  }

  public void cena1_11() {
    System.out.println("Qualquer esperança de salvação para o Reino dissolve-se na fumaça que sobe das ruínas da cidade arrasada.");
    pausa(7);
    System.out.println("Sem recompensas... tente novamente...");
  }
  
  public void fim() {
    System.out.println("Junto com seu último suspiro, o Alto Clérigo Claudius conta a estória da morte misteriosa do Rei.");
    pausa(5);
    System.out.println("- O corpo do rei parecia estranhamente leve e pálido no seu leito de morte...");
    pausa(4);
    System.out.println("E, para piorar ainda as coisas, o herdeiro real também desapareceu.");
    pausa(3);
    System.out.println("Ele fez uma breve pausa e depois continuou a contar a estória do rei.");
    pausa(3);

    System.out.println("- As trevas invadiram estas terras.");
    pausa(2);
    System.out.println("O Conde Dalv e seus guardas lutam em vão porque as forças do mal que eles estão enfrentando não são deste mundo...");
    pausa(6);
    System.out.println("Vocês são agora a nossa única esperança.");
    pausa(2);
    System.out.println("O ritual exigia o sacrifício de nossa mais preciosa relíquia, mas vocês estão aqui.");
    pausa(5);
    System.out.println("Com seus espíritos contidos no Artefato Mágico que vocês carregam, presa a vontade da magia.");
    pausa(5);
    
    System.out.println("- Vocês não podem morrer completamente, mas também não são completamente livres, até derrotarem esse Mal.");
    pausa(5);
    System.out.println("Sinto-me envergonhado por esta coerção, mas, para salvar o Reino, eu optei por amaldiçoar a minha alma.");
    pausa(5);
    System.out.println("A mágica de Mallazar´d lhes dará de volta a força, na medida que vocês forem derrotando as forças do mal, enquanto os aproxima cada vez mais de seu objetivo.");
    pausa(7);
    System.out.println("Minha vida termina agora... ");
    pausa(2);
    System.out.println("Mas eu me vou, sabendo que meu destino se cumpriu.");
    pausa(3);
    System.out.println("Agora, tudo depende de vocês.");
    pausa(2);
    System.out.println("O Clérigo Jhonson... guiará vocês.");
    pausa(2);
    System.out.println("Ele responderá suas dúvidas...");
    pausa(2);
    System.out.println("Adeus, Heróis...");
    pausa(2);
    System.out.println("Salvem...");
    pausa(2);
    System.out.println("este...");
    pausa(2);
    System.out.println("reino...");
    pausa(2);

    System.out.println("");
    System.out.println("RECOPENSA COM POR CONCLÚIDO A MISSÃO");
    System.out.println("• Cada herói recebe 50 moedas de ouro");
    System.out.println("• 1 item do empório a sua escolha");
    System.out.println("• Próxima missão: Jogue a missão 2");
    pausa(5);
    System.out.println("Obrigado por jogar");
  }

  public void pausa(int tempo) {
    // Pausando o sistema para ter o tempo de ler a estória
    try {
      int ms = tempo * 1000;
      // int ms = tempo;
      Thread.sleep(ms);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}