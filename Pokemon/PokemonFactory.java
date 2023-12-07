public class PokemonFactory {
    public static Pokemon criarPokemon(String nome, TipoPokemon tipo, int pontosDeVida) {
        return new Pokemon(nome, tipo, pontosDeVida);
    }
}
