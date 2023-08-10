package br.ulbra.dao;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Tarefas lista = new Tarefas();
        int op = 0;
        Scanner ler = new Scanner(System.in);
        while (op != 3) {
            System.out.println("MENU");
            System.out.println("1 - SALVAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - SAIR");
            System.out.println("4 - SAIR");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a tarefa:");
                    lista.salvar(ler.next());
                    break;
                case 2:
                    System.out.println("Informe a tarefa:");
                    lista.listar();
                    break;
                case 3:
                    lista.listar();
                    System.out.println("Informe o item que deseja excluir:");
                    int i = ler.nextInt();
                    lista.remover(i);
                    break;
                case 4:
                    lista.listar();
                    System.out.println("Qual item deseja alterar:");
                    int o = ler.nextInt();
                    System.out.println("Qual o novo nome para este item:");
                    String novo = ler.next();
                    lista.alterar(o, novo);
                    break;
                   
                default:
                    if (op == 4) {
                        System.out.println("Tchau Xiru!");

                    } else {
                        System.out.println("opção inválida");
                    }

            }
        }
    }

}

