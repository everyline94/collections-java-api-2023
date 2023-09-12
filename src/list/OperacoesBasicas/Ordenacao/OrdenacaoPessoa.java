package list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, int altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Alice", 20, (int) 1.56);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, (int) 1.80);
        ordenacaoPessoa.adicionarPessoa("Charlie", 25, (int) 1.70);
        ordenacaoPessoa.adicionarPessoa("David", 17, (int) 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoa.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
