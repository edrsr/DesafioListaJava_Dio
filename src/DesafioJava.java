import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesafioJava {

    public static void main(String[] args) {

        //Exercicio proposto no conteúdo de Lista em Java

        //Criando a lista nomeLista
        List<String> nomesLista = new ArrayList<>();

        //Adicionando os nomes solicitados na lista
        nomesLista.add("Juliana");
        nomesLista.add("Pedro");
        nomesLista.add("Carlos");
        nomesLista.add("Larissa");
        nomesLista.add("João");

        System.out.println("Imprimindo a Lista: "+nomesLista);

        //Navegue na lista exibindo cada nome no console
        for (String listaNomes: nomesLista){
            System.out.println("Imprimindo lista com for: "+listaNomes);
        }

        //Substitua o nome Carlos por Roberto
        nomesLista.set(2, "Roberto");
        System.out.println("Imprimindo a Lista: "+nomesLista);

        //Retorne o nome da posição 1 (Considerando o índice 0, ou seja, elemento 1)
        System.out.println("Imprimindo o nome da posição 1: "+nomesLista.get(0));

        //Remova o nome da posição 4
        nomesLista.remove(3);
        System.out.println("Imprimindo a Lista: "+nomesLista);

        //Remova o nome do João
        nomesLista.remove(3);
        System.out.println("Imprimindo a Lista: "+nomesLista);

        //Retorne a quantidade de ítens da lista
        int qtdNomes = nomesLista.size();
        System.out.println("Quantidade de nomes da lista: "+qtdNomes);

        //Verifique se o nome Juliano está existe na lista.
        boolean resultado = nomesLista.contains("Juliano");
        System.out.println("Juliano está na lista? "+resultado);

        //Crie uma nova lista
        List<String> novaListaDeNomes = new ArrayList<>();

        //Adicione os nomes Ismael e Rodrigo a nova lista
        novaListaDeNomes.add("Ismael");
        novaListaDeNomes.add("Rodrigo");

        System.out.println("Imprimindo a Lista: "+nomesLista);

        System.out.println("Imprimindo a Lista: "+novaListaDeNomes);

        //Adicione todos os ítens da nova lista na primeira lista criada.
        System.out.println("Imprimindo a Lista Antiga: "+nomesLista);

        //Adicionando os ítens da segunda lista na primeira
        nomesLista.addAll(novaListaDeNomes);
        System.out.println("Imprimindo a Lista Nova Com Ismael e Rodrigo: "+nomesLista);

        //ordene a lista em ordem alfabética
        Collections.sort(nomesLista);
        System.out.println("Imprimindo a Lista em ordem alfabética : "+nomesLista);

        //Verifiqeu se a lista está vazia
        boolean vazia = nomesLista.isEmpty();
        System.out.println("A Lista está vazia? "+vazia);


    }
}
