package projecto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int opcao = 1, nrAluno = 0;
		String nomeAluno;
		BinSearchTree arvore = new BinSearchTree();
		
		System.out.println("Bem-Vindo!");
		
		do {
			System.out.println("Opções:");
			System.out.println("1 - Inserir Aluno");
			System.out.println("2 - Remover Aluno");
			System.out.println("3 - Procurar Aluno");
			System.out.println("4 - Editar Aluno");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = ler.nextInt();
			System.out.println("\n");
			if (opcao > 4 || opcao < 0) {
				System.out.println("Opção Inválida!");
				System.out.println("Por favor Selecione uma Opção Válida!");
				System.out.println("\n");
			}
			
			if (opcao == 1) {
				System.out.println("Inserir Aluno");
				System.out.print("Insira o Número do Aluno: ");
				nrAluno = ler.nextInt();
				System.out.println("\n");
				System.out.print("Insira o Nome do Aluno: ");
				nomeAluno = ler.next();
				System.out.println("\n");
				
				
				arvore.inserir(nrAluno, nomeAluno);
				System.out.println("\n");
			} else if (opcao == 2) {
				System.out.println("Remover Aluno");
				System.out.print("Insira o Número do Aluno: ");
				nrAluno = ler.nextInt();
				System.out.println("\n");
				
				if(arvore.remover(nrAluno) == true) {
					System.out.println("Aluno Removido com Sucesso!");
				} else {
					System.out.println("Aluno NÃO Removido!");
				}
				System.out.println("\n");
			} else if (opcao == 3) {
				System.out.println("Procurar Aluno");
				System.out.print("Insira o Número do Aluno: ");
				nrAluno = ler.nextInt();
				System.out.println("\n");
				
				NoBinTree no = arvore.procurar(nrAluno);
				System.out.println("Número do Aluno: " + no.getValor());
				System.out.println("Nome do Aluno: " + no.getNome());
				System.out.println("\n");
			} else if (opcao == 4) {
				System.out.println("Editar Nome Aluno");
				System.out.print("Insira o Número do Aluno: ");
				nrAluno = ler.nextInt();
				System.out.println("\n");
				System.out.print("Insira o Nome do Aluno: ");
				nomeAluno = ler.next();
				System.out.println("\n");
				
				if(arvore.editarNome(nrAluno, nomeAluno) == true) {
					System.out.println("Nome Aluno Alterado com Sucesso!");
				} else {
					System.out.println("Nome Aluno NÃO Alterado!");
				}
				System.out.println("\n");
			}
			
		} while(opcao != 0); 
		
		ler.close();
	}

}
