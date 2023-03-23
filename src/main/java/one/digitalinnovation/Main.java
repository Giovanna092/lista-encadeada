package one.digitalinnovation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo!");

        int i=0,opcao;
        String txt;
        do{
            System.out.println("Selecione uma opção");
            System.out.println("[1] Mostrar lista atual " +
                    "\n[2] Mostrar primeiro elemento " +
                    "\n[3] Adicionar novo elemento na lista " +
                    "\n[4] Remover elemento da Lista " +
                    "\n[4] Mostrar tamanho da lista " +
                    "\n[5] Finalizar programa");

            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    if(!minhaListaEncadeada.isEmpty()){
                    }

                    while(true){
                        System.out.println("A lista está atualmente vazia, deseja adicionar novo elemento?");
                        txt = scan.next();
                        if(txt.equalsIgnoreCase("sim") || txt.equalsIgnoreCase("nao")){
                            break;

                        } else {
                            System.out.println("Por favor digite sim ou nao");
                        }
                    }

                    if (txt.equalsIgnoreCase("sim")){
                        System.out.println("Adicione um novo elemento");
                        txt = scan.next();
                        minhaListaEncadeada.add(txt);
                        System.out.println("Novo elemento adicionado na lista");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }


            i++;
        }while(i < 2);
    }

}
