package org.jose.corretora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro do Proprietário ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Proprietario proprietario = new Proprietario(nome, telefone, cpf);

        System.out.println("\n=== Cadastro do Imóvel ===");
        System.out.print("Tipo de imóvel (1 - Casa / 2 - Apartamento): ");
        int tipo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Endereço (rua/avenida): ");
        String endereco = sc.nextLine();

        System.out.print("Número: ");
        int numero = sc.nextInt();

        Imovel imovel;

        if (tipo == 1) {
            imovel = new Casa(endereco, numero, proprietario);
        } else {
            imovel = new Apartamento(endereco, numero, proprietario);
        }

        System.out.print("\nO imóvel está alugado? (s/n): ");
        sc.nextLine(); // limpar buffer
        String resposta = sc.nextLine();
        imovel.alugado = resposta.equalsIgnoreCase("s");

        System.out.print("Digite o valor base do aluguel: ");
        int valorBase = sc.nextInt();

        System.out.println("\n=== Resumo do Cadastro ===");
        System.out.println("Proprietário: " + proprietario.getNome());
        System.out.println("Telefone: " + proprietario.getTelefone());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println(imovel.contatoProprietario());

        if (imovel instanceof Casa) {
            System.out.println(((Casa) imovel).status());
        } else if (imovel instanceof Apartamento) {
            System.out.println(((Apartamento) imovel).status());
        }

        System.out.println("Valor total do aluguel: R$ " + imovel.calcularAluguel(valorBase));

        sc.close();
    }
}