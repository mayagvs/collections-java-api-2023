package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributo

    private Set<Convidado> convidadoset;

    public ConjuntoConvidados() {
        this.convidadoset = new HashSet<>();
    }

    public void AdicionarConvidado(String nome, int codigoConvite){
        convidadoset.add(new Convidado(nome, codigoConvite));
    }

    public void RemoverConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoset){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoset.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoset.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoset);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.AdicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.AdicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.AdicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.AdicionarConvidado("Convidado 4", 1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)  dentro do Set de Convidados");

      //  conjuntoConvidados.RemoverConvidadoPorCodigoConvite(1234);
      //  System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)  dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }

}
