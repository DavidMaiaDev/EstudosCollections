package Collections.List.Explicacoes.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    List<Pessoa> pessoa;

    public OrdenacaoPessoa(){
        this.pessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaTemp = new ArrayList<>(pessoa);
        Collections.sort(listaTemp);
        return listaTemp;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaTemp = new ArrayList<>(pessoa);
        Collections.sort(listaTemp, new ComparatorPorAltura());
        return listaTemp;
    }
    


}
