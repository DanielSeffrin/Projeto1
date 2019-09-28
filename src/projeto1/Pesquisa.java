package projeto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pesquisa {
    
    public static void Menu() { 
        String Opcao;
        
        System.out.println("MENU");
        System.out.println("0 - Sair do Sistema");
        System.out.println("1 - Iniciar Questionário");
        System.out.println("2 - Percentual de Respostas");
        System.out.println("3 - Listar Peguntas");
        System.out.println("Digite a opção: ");
        Scanner LeitorTeclado = new Scanner(System.in);        

        Opcao = LeitorTeclado.nextLine();
        while(!Opcao.equals("0")) {
            if(Opcao.equals("1")) {
                    Questionario();
            }
            else if(Opcao.equals("2")) {
                PercentualRespostas();
            }
            else if(Opcao.equals("3")) {
                ListarPerguntas();
            }else{
                System.out.println("Digite uma opção válida!");
            }
            
            Opcao = LeitorTeclado.nextLine();
        }
    }

    public static void main(String[] args) {

        Scanner LeitorTeclado = new Scanner(System.in);
 
        Entrevistados(); //Pergunta o Numero de Entrevistados
/*
        System.out.println("Pesquisa!");
        System.out.println("Digite o número de entrevistados: ");
        QtdEnt = LeitorTeclado.nextInt();
        System.out.println("Digite start para iniciar.");
        Opcao = LeitorTeclado.nextLine();        
        if (("start".equals(Opcao))) {
            for (int i = 1; i <=QtdEnt ; i++) {
                Questoes Questao1 = new Questoes("Questão 1: ");
                System.out.println(Questao1);
                if ("a".equals(Entrada)) {
                    ContA = ContA + 1;
                    TotalQuestoes = TotalQuestoes + 1;
                }
                if ("b".equals(Entrada)) {
                    ContB = ContB + 1;
                    TotalQuestoes = TotalQuestoes + 1;
                }
                if ("c".equals(Entrada)) {
                    ContC = ContC + 1;
                    TotalQuestoes = TotalQuestoes + 1;
                }
                if ("d".equals(Entrada)) {
                    ContD = ContD + 1;
                    TotalQuestoes = TotalQuestoes + 1;
                }
                if ("e".equals(Entrada)) {
                    ContE = ContE + 1;
                    TotalQuestoes = TotalQuestoes + 1;
                }

            }
        }*/
    }
     public static void Entrevistados() {
        Questoes.MostraEntr();
    }
    
    public static void Questionario() {
        Questoes.AlternativasResp();
    }
    
    public static void PercentualRespostas() {
        Questoes.ResPercentual();
    }
    
    public static void ListarPerguntas() {
        Questoes.MostrarQuestoes();
    }
}