package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.estruturadados.Fila;

public class App {
    public static void main(String[] args) throws Exception {
    
    Fila<String> fila = new Fila<>(3);
    System.out.println("A fila esta vazia? " + fila.estaVazia());
    fila.enfileirar("a");
    fila.enfileirar("b");
    fila.enfileirar("c");
    System.out.println("Elementos " + fila);
    System.out.println("A fila esta vazia? " + fila.estaVazia());
    fila.desenfileirar();
    System.out.println("A fila esta composta por " + fila + " e seu tamanho é de " + fila.tamanho() + " elementos e o primeiro da fila é o " + fila.espiar());
    fila.enfileirar("Z");
    fila.enfileirar("2");
    fila.enfileirar("4");
    System.out.println(fila);
    System.out.println("A fila esta composta por " + fila + " e seu tamanho é de " + fila.tamanho() + " elementos e o primeiro da fila é o " + fila.espiar());
    }
}
