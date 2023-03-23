package one.digitalinnovation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("");

        int i=0,opcao;
        String txt,sair="nao";
        do{
            System.out.println("\tSelecione uma opção");
            System.out.println("\t[1] Mostrar lista atual " +
                    "\n\t[2] Mostrar elemento da lista " +
                    "\n\t[3] Adicionar novo elemento na lista " +
                    "\n\t[4] Remover elemento da Lista " +
                    "\n\t[5] Mostrar tamanho da lista " +
                    "\n\t[6] Finalizar programa");
            System.out.print("Informe sua opção: ");

            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    if(!minhaListaEncadeada.isEmpty()){
                        System.out.println(minhaListaEncadeada);
                    } else {
                        while(true){
                            System.out.println("A lista está atualmente vazia, deseja adicionar novo elemento?");
                            System.out.print("- ");
                            txt = scan.next();
                            if(txt.equalsIgnoreCase("sim")){
                                System.out.println("Adicione um novo elemento");
                                System.out.print("- ");
                                txt = scan.next();
                                minhaListaEncadeada.add(txt);
                                System.out.println("Novo elemento adicionado na lista");
                                System.out.println("");
                                break;

                            } else if (txt.equalsIgnoreCase("nao")){
                                break;
                            } else {
                                System.out.println("Por favor digite sim ou nao");
                                System.out.println("");
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("Selecione o indice");
                    System.out.print("- ");
                    i = scan.nextInt();
                    System.out.println("O elemento no indice "+i+" é \""+minhaListaEncadeada.get(i)+"\"");
                    System.out.println("");

                    break;

                case 3:
                    System.out.println("Adicione um novo elemento");
                    System.out.print("- ");
                    txt = scan.next();
                    minhaListaEncadeada.add(txt);
                    System.out.println("Novo elemento adicionado na lista");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Selecione o indice a ser removido");
                    System.out.print("- ");
                    i = scan.nextInt();
                    minhaListaEncadeada.remove(i);
                    System.out.println("Elemento removido");
                    break;

                case 5:
                    System.out.println("A lista possui "+minhaListaEncadeada.size()+" elemento(s)");
                    System.out.println("");
                    break;
                case 6:
                    sair = "sim";
                    break;

                default:
                    System.out.println("Por favor digite uma opção valida");
                    break;
            }

        }while(sair!="sim");
    }

}
