package Collections.List.Desafio.OrdenacaoDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<OrdenacaoNumeros> {

    private List<Integer> numeroInt;

    public OrdenacaoNumeros() {
        this.numeroInt = new ArrayList<>();
    }

    public void adicionaNumero(int numero) {
        numeroInt.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeroInt);
    }

    public void ordenarDescendente() {
        Collections.sort(numeroInt, Collections.reverseOrder());
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros: " + numeroInt;
    }

    @Override
    public int compareTo(OrdenacaoNumeros o) {
       
        return 0; 
    }
    
}
 







