package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionaLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){

            List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;

                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionaLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionaLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionaLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionaLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionaLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
