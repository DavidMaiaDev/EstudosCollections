package Collections.List.Explicações;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livrosList;


    public CatalagoLivros(){
        this.livrosList = new ArrayList();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> listAutor = new ArrayList<>();
    if(!livrosList.isEmpty()){
        for(Livro livro : livrosList){
            if(livro.getAutor().equalsIgnoreCase(autor))
                listAutor.add(livro);
        }

    }
    return listAutor;
}

public List<Livro> pesquisaPorIntervaloAnos(int dataInicial, int dataFinal){
    List<Livro> listIntervaloAno = new ArrayList<>();
    if(!livrosList.isEmpty()){
        for(Livro livro : livrosList){
            if(livro.getAnoPublicacao() >= dataInicial && livro.getAnoPublicacao() < dataFinal){
                listIntervaloAno.add(livro);
            }
        }
    }

    return listIntervaloAno;
}

public Livro pesquisaPorTitulo(String titulo){
    Livro livroPesquisaTitulo = null;
    if(!livrosList.isEmpty()){
        for(Livro livro : livrosList){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroPesquisaTitulo = livro;
                break;
            }
        }
    }
    return livroPesquisaTitulo;

}




    
}
