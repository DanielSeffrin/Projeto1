package projeto1;

import java.util.ArrayList;
import java.util.Scanner;
import static projeto1.Pesquisa.menu;

public class Questoes {
    
    public static ArrayList<String> questao = new ArrayList<>();
    public static ArrayList<String> alternativa = new ArrayList<>();
    public static Integer qtdEnt = 0;
    public static String resp = null;
    public static int contA = 0;
    public static int contB = 0;
    public static int contC = 0;
    public static int contD = 0;
    public static int contE = 0;
    public static int totalQuestoes = 0;
    public static float percA = 0;
    public static float percB = 0;
    public static float percC = 0;
    public static float percD = 0;
    public static float percE = 0;
    
    public static void entrevistados() {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.print("Digite o número de entrevistados: ");
        qtdEnt = leitorTeclado.nextInt();
        menu();
    }

    public static void mostrarQuestoes() {
        // Mostrar as questoes
        System.out.println(questao);
    }
    
    public static void questionario() {
        // Iniciar o questionario
        for (int i=1; i <= qtdEnt; i++){
            Scanner leitorTeclado = new Scanner(System.in);
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 1: De quem é a famosa frase “Penso, logo existo”?");
            System.out.println("a) Platão");
            System.out.println("b) Galileu Galilei");
            System.out.println("c) Descartes");
            System.out.println("d) Sócrates");
            System.out.println("e) Francis Bacon");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 2: Atualmente, quantos elementos químicos a tabela periódica possui?");
            System.out.println("a) 113");
            System.out.println("b) 109");
            System.out.println("c) 108");
            System.out.println("d) 118");
            System.out.println("e) 92");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 3: Qual o número mínimo de jogadores numa partida de futebol?");
            System.out.println("a) 8");
            System.out.println("b) 10");
            System.out.println("c) 9");
            System.out.println("d) 5");
            System.out.println("e) 7");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 4: Quanto tempo a luz do Sol demora para chegar à Terra?");
            System.out.println("a) 12 minutos");
            System.out.println("b) 1 dia");
            System.out.println("c) 12 horas");
            System.out.println("d) 8 minutos");
            System.out.println("e) segundos");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 5: Qual a montanha mais alta do Brasil?");
            System.out.println("a) Pico da Neblina");
            System.out.println("b) Pico Paraná");
            System.out.println("c) Monte Roraima");
            System.out.println("d) Pico Maior de Friburgo");
            System.out.println("e) Pico da Bandeira");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 6: Em qual local da Ásia o português é língua oficial?");
            System.out.println("a) Índia");
            System.out.println("b) Filipinas");
            System.out.println("c) Moçambique");
            System.out.println("d) Macau");
            System.out.println("e) Portugal");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 7: De onde é a invenção do chuveiro elétrico?");
            System.out.println("a) França");
            System.out.println("b) Inglaterra");
            System.out.println("c) Brasil");
            System.out.println("d) Austrália");
            System.out.println("e) Itália");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 8: Qual destes países é transcontinental?");
            System.out.println("a) Rússia");
            System.out.println("b) Filipinas");
            System.out.println("c) Istambul");
            System.out.println("d) Groenlândia");
            System.out.println("e) Brasil");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 9: Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?");
            System.out.println("a) Yuri Gagarin, em 1961");
            System.out.println("b) Buzz Aldrin, em 1969");
            System.out.println("c) Charles Conrad, em 1969");
            System.out.println("d) Charles Duke, em 1971");
            System.out.println("e) Neils Armstrong, em 1969");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
            System.out.println("Entrevistado " + i);
            System.out.println("Questão 10: As pessoas de qual tipo sanguíneo são consideradas doadores universais?");
            System.out.println("a) Tipo A");
            System.out.println("b) Tipo B");
            System.out.println("c) Tipo O");
            System.out.println("d) Tipo AB");
            System.out.println("e) Tipo ABO");
            System.out.print("Digite a resposta: ");
            resp = leitorTeclado.nextLine(); 
            testaResp();
        }
        menu();
    }
    
    public static void testaResp() {
        // Testa as respostas digitadas
        Scanner leitorTeclado = new Scanner(System.in);
        while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && (!resp.equals("d")) && !resp.equals("e")){
            System.out.print("Resposta inválida, digite novamente: ");
            resp = leitorTeclado.nextLine(); 
        }
        if (resp.equals("a")){
            contA = contA + 1;
            totalQuestoes = totalQuestoes + 1;
        }
        if (resp.equals("b")){
            contB = contB + 1;
            totalQuestoes = totalQuestoes + 1;
        }
        if (resp.equals("c")){
            contC = contC + 1;
            totalQuestoes = totalQuestoes + 1;
        }
        if (resp.equals("d")){
            contD = contD + 1;
            totalQuestoes = totalQuestoes + 1;
        }
        if (resp.equals("e")){
            contE = contE + 1;
            totalQuestoes = totalQuestoes + 1;
        }
    }
    
    public static void respPercentual(){
        // Calcula o percentual das respostas e mostra na tela
        System.out.println("Percentual das respostas: ");
        percA = (contA * 100) / totalQuestoes;
        System.out.println("Percentual A: " + percA);
        percB = (contB * 100) / totalQuestoes;
        System.out.println("Percentual B: " + percB);
        percC = (contC * 100) / totalQuestoes;
        System.out.println("Percentual C: " + percC);
        percD = (contD * 100) / totalQuestoes;
        System.out.println("Percentual D: " + percD);
        percE = (contE * 100) / totalQuestoes;
        System.out.println("Percentual E: " + percE);
        menu();
    }
    
}
