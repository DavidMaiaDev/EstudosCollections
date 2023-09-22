package Collections.List.Desafio.PesquisaDesafio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

    private List<Integer> somas;


    public SomaNumero(){
        this.somas = new ArrayList();
    }

    public void adicionaNumero(Integer numero){
        somas.add(numero);
    }

    public int calcularSoma(){
        Integer somaTotal = 0;
        if(!somas.isEmpty()){
            for(Integer somatorio : somas){
                somaTotal += somatorio;
            }
        }
        return somaTotal;
    }

    public int encontrarMenorNumero(){
        Integer MenorNumero = Integer.MAX_VALUE;
        if(!somas.isEmpty()){
            for(Integer somatorio : somas){
                if(somatorio < MenorNumero){
                    MenorNumero = somatorio;
                }
            }
        }
        return MenorNumero;

    }
    public List<Integer> exibirNumeros(){
        List<Integer> todosNumeros = new ArrayList();
        if(!somas.isEmpty()){
            for ( Integer todos : somas){
                todosNumeros.add(todos);
            }
        }
        return todosNumeros;
    }

}
