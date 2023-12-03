import java.util.HashMap;
import java.util.Map;

public class DadosPokemon {
    private Map<String, Pokemon> pokemons;

    public String[] getPokemonsDisponiveis() {
        // Lógica para obter os nomes dos Pokémon disponíveis e retornar como um array de Strings
        return new String[]{"Pikachu", "Charmander", "Squirtle", "Bulbasaur", "Jangmo-o", "Sudowoodo", "Clefairy", "Meowth", "Diglett",
    "Ekans", "Rookidee", "Machop", "Caterpie", "Misdreavus", "Aron", "Abra", "Glaceon", };
    }

    public DadosPokemon() {
        this.pokemons = new HashMap<>();
        inicializarPokemons();
    }

    public Pokemon getPokemonAleatorio() {
        // Lógica para obter um Pokémon aleatório da base de dados e retorná-lo
        // Por exemplo, seleção aleatória entre os Pokémon disponíveis
        String[] pokemonsDisponiveis = getPokemonsDisponiveis();
        int index = (int) (Math.random() * pokemonsDisponiveis.length);
        String nomePokemonAleatorio = pokemonsDisponiveis[index];
        return getPokemon(nomePokemonAleatorio);
    }

    private void inicializarPokemons() {
        Pokemon pikachu = new Pokemon("Pikachu", TipoPokemon.ELÉTRICO, 100);
        pikachu.adicionarAtaque("Thunder", 10);
        pikachu.adicionarAtaque("Thunder Wave", 20);
        pokemons.put("Pikachu", pikachu);

        Pokemon charmander = new Pokemon("Charmander", TipoPokemon.FOGO, 100);
        charmander.adicionarAtaque("Blaze Kick", 10);
        charmander.adicionarAtaque("Flame Charge", 20);
        pokemons.put("Charmander", charmander);

        Pokemon bulbasaur = new Pokemon("Bulbasaur", TipoPokemon.PLANTA, 100);
        bulbasaur.adicionarAtaque("Petal Dance", 10);
        bulbasaur.adicionarAtaque("Magical Leaf", 20);
        pokemons.put("Bulbasaur", bulbasaur);

        Pokemon squirtle = new Pokemon("Squirtle", TipoPokemon.ÁGUA, 100);
        squirtle.adicionarAtaque("Crabhammer", 10);
        squirtle.adicionarAtaque("Bubble Beam", 20);
        pokemons.put("Squirtle", squirtle);

        Pokemon jangmoo = new Pokemon("Jangmo-o", TipoPokemon.DRAGÃO, 100);
        jangmoo.adicionarAtaque("Dragon Rage", 10);
        jangmoo.adicionarAtaque("Dragon Breath", 20);
        pokemons.put("Jangmo-o", jangmoo);

        Pokemon sudowoodo = new Pokemon("Sudowoodo", TipoPokemon.PEDRA, 100);
        sudowoodo.adicionarAtaque("Rock Slide", 10);
        sudowoodo.adicionarAtaque("Accelerock", 20);
        pokemons.put("Sudowoodo", sudowoodo);

        Pokemon clefairy = new Pokemon("Clefairy", TipoPokemon.FADA, 100);
        clefairy.adicionarAtaque("Nature's Madness", 10);
        clefairy.adicionarAtaque("Sparkly Swirl", 20);
        pokemons.put("Clefairy", clefairy);

        Pokemon meowth = new Pokemon("Meowth", TipoPokemon.NORMAL, 100);
        meowth.adicionarAtaque("Multi-Attack", 10);
        meowth.adicionarAtaque("Chip Away", 20);
        pokemons.put("Meowth", meowth);

        Pokemon diglett = new Pokemon("Diglett", TipoPokemon.TERRESTRE, 100);
        diglett.adicionarAtaque("Thousand Arrows", 10);
        diglett.adicionarAtaque("Mud Bomb", 20);
        pokemons.put("Diglett", diglett);

        Pokemon ekans = new Pokemon("Ekans", TipoPokemon.VENENOSO, 100);
        ekans.adicionarAtaque("Belch", 10);
        ekans.adicionarAtaque("Sludge", 20);
        pokemons.put("Ekans", ekans);

        Pokemon rookidee = new Pokemon("Rookidee", TipoPokemon.VOADOR, 100);
        rookidee.adicionarAtaque("Hurricane", 10);
        rookidee.adicionarAtaque("Drill Peck", 20);
        pokemons.put("Rookidee", rookidee);

        Pokemon machop = new Pokemon("Machop", TipoPokemon.LUTADOR, 100);
        machop.adicionarAtaque("Jump Kick", 10);
        machop.adicionarAtaque("Counter", 20);
        pokemons.put("Machop", machop);

        Pokemon caterpie = new Pokemon("Caterpie", TipoPokemon.INSETO, 100);
        caterpie.adicionarAtaque("Leech Life", 10);
        caterpie.adicionarAtaque("Bug Bite", 20);
        pokemons.put("Caterpie", caterpie);

        Pokemon misdreavus= new Pokemon("Misdreavus", TipoPokemon.FANTASMA, 100);
        misdreavus.adicionarAtaque("Hex", 10);
        misdreavus.adicionarAtaque("Shadow Punch", 20);
        pokemons.put("Misdreavus", misdreavus);

        Pokemon aron= new Pokemon("Aron", TipoPokemon.AÇO, 100);
        aron.adicionarAtaque("Meteor Mash", 10);
        aron.adicionarAtaque("Magnet Bomb", 20);
        pokemons.put("Aron", aron);

        Pokemon abra= new Pokemon("Abra", TipoPokemon.PSÍQUICO, 100);
        abra.adicionarAtaque("Psychic", 10);
        abra.adicionarAtaque("Psybeam", 20);
        pokemons.put("Abra", abra);

        Pokemon glaceon= new Pokemon("Glaceon", TipoPokemon.GELO, 100);
        glaceon.adicionarAtaque("Ice Beam", 10);
        glaceon.adicionarAtaque("Aurora Beam", 20);
        pokemons.put("Glaceon", glaceon);

        
    }

    public Pokemon getPokemon(String nomePokemon) {
        return pokemons.get(nomePokemon);
    }
}
