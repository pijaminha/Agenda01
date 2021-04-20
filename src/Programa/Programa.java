package Programa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Contato;

public class Programa extends Contato {
public Programa(String nome2, String telefone2, int codigo2) {
super(nome2, telefone2, codigo2);
}
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();
        int opcao, totalcontatos = 0;
        boolean achei;
        Scanner ler = new Scanner(System.in);

        do {
            //#region
            System.out.println("\n ************************************************************");
            System.out.println("\n                 Olá, digite a opção desejada: ");
            System.out.println("\n ************************************************************");
            System.out.println("\n 1 - para adicionar um contato");
            System.out.println("\n 2 - para listar os contatos adicionados por código");
            System.out.println("\n 3 - para listar os contatos adicionados por ordem alfabética");
            System.out.println("\n 4 - para procurar um contato por código");
            System.out.println("\n 5 - para procurar um contato por nome");
            System.out.println("\n 6 - deletar um contato");
            System.out.println("\n 0 - para encerrar");
            System.out.println("\n ************************************************************");
            opcao = ler.nextInt();
            ler.nextLine();

            //#endregion
            switch (opcao) {
                case 1:
                    int codigo;
                    do {
                        System.out.println("\n Digite 1 para cadastrar um novo contato ou 2 para retornar");
                        opcao = ler.nextInt();
                        ler.nextLine();

                        if (opcao == 1) {
                            System.out.println("Insira aqui o Nome do contato:");
                            String nome = ler.nextLine();
                            System.out.println("Insira aqui o Numero de telefone do contato");
                            String telefone = ler.nextLine();
                            System.out.println("Insira aqui o Código do contato");
                            codigo = ler.nextInt();

                            contatos.add(new Contato(nome, telefone, codigo));
                            System.out.println("Seu contato foi salvo!");

                        }
                        
                    } while (opcao == 2);
                    break;
                case 2:
                        contatos.sort(null);
                        System.out.println("\n****** Contatos ******** ");
                    for (Contato contato : contatos) {
                        System.out.println(">" + contato);     
                    }
                break;
                case 3: 
                    contatos.sort(null);
                    System.out.println("\n****** Contatos ******** ");
                    for (Contato contato: contatos) {
                        System.out.println(">" + contato);     
                }
                break;
                case 4:
                System.out.println("Digite o código do contato que deseja procurar: ");
                codigo = ler.nextInt();
                achei = false;
                ler.nextLine();
                for(Contato contato : contatos) {
                    if (contato.getCodigo() == codigo) {
                    System.out.printf("\nCódigo: %d", ((Contato) contatos).getCodigo()); 
                    System.out.printf("\nNome: %s", ((Contato) contatos).getNome()); 
                    System.out.printf("\nTelefone: %s", ((Contato) contatos).getTelefone());
                    achei = true;
                    break;
                    }
                    if (achei == false);
                    System.out.println("O código que voce digitou não está cadastrado");
                }
                break;
                case 5:
                System.out.println("Digite o nome do contato que deseja procurar: ");
                String nome = ler.nextLine();
                achei = false;
                for(int i=0; i<totalcontatos; i++) {
                    if (((Contato) contatos).getNome().equals(nome)) {
                    System.out.printf("\nCódigo: %d", ((Contato) contatos).getCodigo()); 
                    System.out.printf("\nNome: %s", ((Contato) contatos).getNome()); 
                    System.out.printf("\nTelefone: %s", ((Contato) contatos).getTelefone());
                    achei = true;
                    break;
                    }
                    if (achei == false);
                    System.out.println("O nome que voce digitou não está cadastrado");
                }
                break;
                case 6: 
                    System.out.println("\nEntendido! Digite o contato que deseja remover: ");
                    String contRemover = ler.nextLine();
                    contatos.removeIf(p -> p.getNome().equalsIgnoreCase(contRemover));
                    break;
                case 0:
                System.out.println("Entendido, encerrando a aplicação. Até logo :P");
                break;
                default:
                System.out.println("Opa, parece que essa opção está inválida!");
                break;
            }
        } while (opcao != 0);

        ler.close();
        
    }
}

