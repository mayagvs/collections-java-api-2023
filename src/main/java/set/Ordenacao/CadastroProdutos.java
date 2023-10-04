package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionaProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtoSet;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorpreco = new TreeSet<>(new ComparatorPorpreco());
        produtosPorpreco.addAll(produtoSet);
        return produtosPorpreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionaProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionaProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionaProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionaProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }


}
