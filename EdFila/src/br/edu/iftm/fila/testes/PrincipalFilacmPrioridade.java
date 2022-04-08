package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.classes.Paciente;
import br.edu.iftm.fila.estruturadados.FilaCmPrioridade;

public class PrincipalFilacmPrioridade {

    
    public static void main(String[] args){

        FilaCmPrioridade<Paciente> fila = new FilaCmPrioridade<>();
        
        fila.enfileirar(new Paciente("A", 2));
        fila.enfileirar(new Paciente("B", 1));
        fila.enfileirar(new Paciente("C", 1));
        fila.enfileirar(new Paciente("D", 3));
        fila.enfileirar(new Paciente("F", 2));

        System.out.println(fila);

    }

}
