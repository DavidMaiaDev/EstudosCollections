package Collections.List.Explicacoes.Pequisa;

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

public static void main(String [] args){
    CatalagoLivros livros = new CatalagoLivros();
    livros.adicionarLivro("A bela e a fera", "Severino", 2023);
    livros.adicionarLivro("O dilema do porco espinho", "LK", 2021);
    livros.adicionarLivro("Pandemia de Gripe", "Marcos Túlio", 2014);
    livros.adicionarLivro("O pequeno P", "Maria Antoônia", 2011);
    livros.adicionarLivro("Manga rosa", "Severo", 2016);
    livros.adicionarLivro("PC novo é lindo", "Edna Freire", 2016);
    livros.adicionarLivro("A bela e a fera", "Severino", 2023);

    System.out.println(livros.pesquisarPorAutor("Severino"));
    System.out.println(livros.pesquisaPorTitulo("Manga Rosa"));
    System.out.println(livros.pesquisaPorIntervaloAnos(2020, 2024));

}




    
}
