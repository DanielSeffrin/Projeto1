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
            System.out.print("");
            resp = leitorTeclado.nextLine(); 
            testaResp();
        }
        menu();
    }
    
    public static void testaResp() {
        // Testa as respostas digitadas
        Scanner leitorTeclado = new Scanner(System.in);
        while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && (!resp.equals("d")) && !resp.equals("e")){
            System.out.print("Resposta inválida, digite novamente:");
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
        System.out.println("");
        menu();
    }
    
}
