package projeto1;

import java.util.Scanner;
import static projeto1.Questoes.questionario;
import static projeto1.Questoes.entrevistados;
import static projeto1.Questoes.listaGabarito;
import static projeto1.Questoes.listaPerguntas;
import static projeto1.Questoes.respPercentual;

public class Pesquisa {

    public static void menu() {
        Scanner leitorTeclado = new Scanner(System.in);
        String opcao;
        System.out.println("==============================");
        System.out.println("MENU");
        System.out.println("1 - Iniciar Questionário");
        System.out.println("2 - Percentual de Respostas");
        System.out.println("3 - Listar Peguntas");
        System.out.println("4 - Mostrar Gabarito");
        System.out.println("sair - Sair do Sistema");
        System.out.println("==============================");
        System.out.print("Digite a opção: ");

        opcao = leitorTeclado.nextLine();
        while (1 == 1) {
            switch (opcao) {
                case "sair":
                    System.exit(0);
                case "1":
                    questionario();
                    break;
                case "2":
                    respPercentual();
                    break;
                case "3":
                    listaPerguntas();
                    break;
                case "4":
                    listaGabarito();
                    break;
                default:
                    System.out.print("Digite uma opção válida: ");
                    break;
            }
            opcao = leitorTeclado.nextLine();
        }
    }

    public static void main(String[] args) {
        entrevistados(); //Pergunta o Numero de Entrevistados
    }
}
