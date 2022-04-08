package br.edu.iftm.fila.estruturadados;
@SuppressWarnings("unchecked")

public class FilaCmPrioridade<T> extends Fila<T> {

    @Override
    public boolean enfileirar( T elemento){
        
        Comparable<T> chave = (Comparable<T>)  elemento;

        int i;

        for (i = 0; i < this.tamanho; i++) {
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }

        
        }
        this.enfileirar(i, elemento);
        
        
        return true;
    }
    
}
