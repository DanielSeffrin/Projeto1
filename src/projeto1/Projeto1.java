package projeto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Questionario {

    public static void main(String[] args) {

        Scanner LeitorTeclado = new Scanner(System.in);
        ArrayList<String> Quest = new ArrayList<>();
        String Opcao;
        String Opcao2;
        String Opcao3;
        String Entrada;
        int ContA = 0;
        int ContB = 0;
        int ContC = 0;
        int ContD = 0;
        int ContE = 0;
        int TotalQuestoes = 0;
        float PercentualA;
        float PercentualB;
        float PercentualC;
        float PercentualD;
        float PercentualE;

        System.out.println("Questionário de Perguntas!");
        System.out.println("Digite start para iniciar.");
        Opcao = LeitorTeclado.nextLine();
        if (("start".equals(Opcao))) {
            for (int i = 0; i < 1; i++) {
                Quest Quest1 = new Quest("a");
                Quest1.Quest.add("Questão 1: ");
                
                Alternativas AlternativaA = new Alternativas();
                AlternativaA.Alternativa = "A: Teste";
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                //Respostas.add(Entrada);
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
        }
    }
}