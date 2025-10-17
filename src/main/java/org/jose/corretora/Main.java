package org.jose.corretora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Cadastro do Proprietário ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Proprietario proprietario = new Proprietario(nome, telefone, cpf);

        Casa casa = new Casa("Rua Alphaville, 123", 123, proprietario);
        Apartamento ap = new Apartamento("Av. Tamboré, 456", 45, proprietario);

        System.out.println("\n=== Situação Inicial ===");
        System.out.println(casa.status());
        System.out.println(ap.status());

        casa.alugado = true;
        ap.alugado = false;

        System.out.println("\n=== Situação Atualizada ===");
        System.out.println(casa.status());
        System.out.println(ap.status());

        System.out.println("\n=== Cálculo do Aluguel ===");
        System.out.print("Digite o valor base: ");
        int valorBase = sc.nextInt();

        System.out.println("Valor do aluguel da casa: R$ " + casa.calcularAluguel(valorBase));
        System.out.println("Valor do aluguel do apartamento: R$ " + ap.calcularAluguel(valorBase));

        System.out.println("\n=== Contato do Proprietário ===");
        System.out.println(casa.contatoProprietario());

        sc.close();



    }
}