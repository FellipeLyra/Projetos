import java.util.HashMap;
import java.util.Map;

public class Pokemon {
    private String nome;
    private TipoPokemon tipo;
    private int pontosDeVida;
    private Map<String, Integer> ataques;

    public Pokemon(String nome, TipoPokemon tipo, int pontosDeVida) {
        this.nome = nome;
        this.tipo = tipo;
        this.pontosDeVida = pontosDeVida;
        this.ataques = new HashMap<>();
    }


    public String getNome() {
        return nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void receberAtaque(int dano) {
        pontosDeVida -= dano;
    }

    public void adicionarAtaque(String nomeAtaque, int dano) {
        ataques.put(nomeAtaque, dano);
    }

    public Map<String, Integer> getAtaques() {
        return ataques;
    }
}
