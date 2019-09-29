package projeto1;

import java.util.Scanner;
import static projeto1.Questoes.questionario;
import static projeto1.Questoes.entrevistados;
import static projeto1.Questoes.mostrarQuestoes;
import static projeto1.Questoes.respPercentual;

public class Pesquisa {

    public static void menu() {
        Scanner leitorTeclado = new Scanner(System.in);
        String opcao;
        System.out.println("MENU");
        System.out.println("0 - Sair do Sistema");
        System.out.println("1 - Iniciar Questionário");
        System.out.println("2 - Percentual de Respostas");
        System.out.println("3 - Listar Peguntas");
        System.out.print("Digite a opção: ");
        opcao = leitorTeclado.nextLine();
        System.out.println("");

        while (!opcao.equals("0")) {
            switch (opcao) {
                case "1":
                    questionario();
                    break;
                case "2":
                    respPercentual();
                    break;
                case "3":
                    mostrarQuestoes();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
            opcao = leitorTeclado.nextLine();
        }
    }

    public static void main(String[] args) {
        entrevistados(); //Pergunta o Numero de Entrevistados
    }
}
