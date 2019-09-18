package projeto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Projeto1 {

    public static void main(String[] args) {

        ArrayList<String> Respostas = new ArrayList<String>();
        Scanner LeitorTeclado = new Scanner(System.in);
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
        System.out.println("Digite 1 para iniciar.");
        Opcao = LeitorTeclado.nextLine();
        if (("1".equals(Opcao))) {

            for (int i = 0; i < 1; i++) {
                System.out.println("Questão 1: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 2: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 3: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 4: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 5: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 6: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 7: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 8: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 9: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
                //
                System.out.println("Questão 10: ?");
                System.out.println("(a) A.");
                System.out.println("(b) B.");
                System.out.println("(c) C.");
                System.out.println("(d) D.");
                System.out.println("(e) E.");
                System.out.print("Resposta: ");
                Entrada = LeitorTeclado.nextLine();
                Respostas.add(Entrada);
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
            System.out.println("Você deseja ver o percentual das respostas?");
            System.out.println("Opção 1: Sim");
            System.out.println("Opção 2: Não");
            Opcao2 = LeitorTeclado.nextLine();
            if ("1".equals(Opcao2)) {
                PercentualA = (ContA * 100) / TotalQuestoes;
                PercentualB = (ContB * 100) / TotalQuestoes;
                PercentualC = (ContC * 100) / TotalQuestoes;
                PercentualD = (ContD * 100) / TotalQuestoes;
                PercentualE = (ContE * 100) / TotalQuestoes;

                System.out.println("Quantidade de respostas a = " + ContA + ", correspondem a " + PercentualA + "% do total.");
                System.out.println("Quantidade de respostas b = " + ContB + ", correspondem a " + PercentualB + "% do total.");
                System.out.println("Quantidade de respostas c = " + ContC + ", correspondem a " + PercentualC + "% do total.");
                System.out.println("Quantidade de respostas d = " + ContD + ", correspondem a " + PercentualD + "% do total.");
                System.out.println("Quantidade de respostas e = " + ContE + ", correspondem a " + PercentualE + "% do total.");
            }

            if ("2".equals(Opcao2)) {

            }
        }
        
        System.out.println("");
        System.out.println("Menu de opções: ");
        System.out.println("Opção 1: mostrar as perguntas.");
        System.out.println("Opção 2: mostrar as respostas.");
        System.out.println("O que você deseja fazer? ");
        Opcao3 = LeitorTeclado.nextLine();
        if ("1".equals(Opcao3)) {
            System.out.println("Questão 1: ?");
            System.out.println("Questão 2: ?");
            System.out.println("Questão 3: ?");
            System.out.println("Questão 4: ?");
            System.out.println("Questão 5: ?");
            System.out.println("Questão 6: ?");
            System.out.println("Questão 7: ?");
            System.out.println("Questão 8: ?");
            System.out.println("Questão 9: ?");
            System.out.println("Questão 10: ?");

        }

        if ("2".equals(Opcao3)) {

            System.out.println("Questão 1, resposta: a");
            System.out.println("Questão 2, resposta: c");
            System.out.println("Questão 3, resposta: d");
            System.out.println("Questão 4, resposta: b");
            System.out.println("Questão 5, resposta: e");
            System.out.println("Questão 6, resposta: a");
            System.out.println("Questão 7, resposta: c");
            System.out.println("Questão 8, resposta: d");
            System.out.println("Questão 9, resposta: a");
            System.out.println("Questão 10, resposta: e");

        }

    }
}
