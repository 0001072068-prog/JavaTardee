package Atividade12_05;

import java.util.Locale;
import java.util.Scanner;


public class product_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        main product01= new main();
        System.out.println("dados do produto: ");
        System.out.print("name: ");
        product01.name = sc.nextLine();
        System.out.println("preço: ");
        product01.price = sc.nextDouble();
        System.out.print("quantidade de estoque: ");
        product01.Quantity= sc.nextInt();

        System.out.println();
        System.out.println("dados do produtos: " + product01);

        System.out.println();
        System.out.print("insira a quantidade de produtos a serem adicionados em estoque: ");
        int quantity= sc.nextInt();
        product01.adicionarProduto(quantity);

        System.out.println("Dados atualizados: "+ product01);

        System.out.println();
        System.out.print("Dados atualizados: ");
        int quantityA= sc.nextInt();
        product01.removerProduto(quantityA);

        System.out.println();
        System.out.println("Retirada de estoque: "+ product01);

        sc.close();

    }
}
