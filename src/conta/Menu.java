package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
	// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Jos� da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
	// Teste da Classe Conta Poupan�a
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND +
							   "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO GUILHERME                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.print("            Entre com a op��o desejada:                ");

			try {
					opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Digite valores inteiros");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Guilherme - O seu Futuro come�a aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");
					keyPress();
					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");
					keyPress();
					break;
				case 3:
					System.out.println("Consultar dados da Conta - por n�mero\n\n");
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");
					keyPress();
					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");
					keyPress();
					break;
				case 6:
					System.out.println("Saque\n\n");
					keyPress();
					break;
				case 7:
					System.out.println("Dep�sito\n\n");
					keyPress();
					break;
				case 8:
					System.out.println("Transfer�ncia entre Contas\n\n");
					keyPress();
					break;
				default:
					System.out.println("\nOp��o Inv�lida!\n");
					keyPress();
					break;
			}
		}
	}
	
	public static void keyPress() {
		
		try {
			
			System.out.println(Cores.TEXT_RESET + "\nPressione Enter para Continuar..");
			System.in.read();
		} catch(IOException e) {
			
			System.out.println("Voc� pressionou uma tecla diferente de Enter!");
		}
	}

}