package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Bruno", 123456);
        agendaContatos.adicionarContato("Marina", 654321);
        agendaContatos.adicionarContato("Regina", 135783);
        agendaContatos.adicionarContato("Gabriel", 498765);
        agendaContatos.adicionarContato("Gaby", 777867);
        agendaContatos.adicionarContato("Kani", 997887);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Gaby");
        agendaContatos.exibirContato();

        System.out.println("o numero é: " + agendaContatos.pesquisarPorNome("Gabriel"));
    }
}
