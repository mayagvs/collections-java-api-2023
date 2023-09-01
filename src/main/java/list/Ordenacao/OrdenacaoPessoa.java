package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributos

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenacaoPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaopessoa = new OrdenacaoPessoa();
        ordenacaopessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaopessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaopessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaopessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaopessoa.pessoaList);//lista SEM ordenação, a ordem
        //seguira a sequencia que foi digitada.

        System.out.println(ordenacaopessoa.ordenadoPorIdade());
        System.out.println(ordenacaopessoa.ordenacaoPorAltura());

    }
}
