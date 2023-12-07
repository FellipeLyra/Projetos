import java.util.Scanner;

public class JogoPokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonDataProvider baseDeDados = new CompositeDadosPokemon();

        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Bem-vindo ao Jogo Pokémon!");

            String[] pokemonsDisponiveis = baseDeDados.getPokemonsDisponiveis();
            System.out.println("Pokémons disponíveis para escolha:");

            for (int i = 0; i < pokemonsDisponiveis.length; i++) {
                System.out.println("(" + (i + 1) + ") " + pokemonsDisponiveis[i]);
            }
            System.out.println("====================================");
            System.out.println("Escolha o número correspondente ao Pokémon desejado:");
            int escolhaPokemon = scanner.nextInt();

            if (escolhaPokemon >= 1 && escolhaPokemon <= pokemonsDisponiveis.length) {
                String nomePokemonEscolhido = pokemonsDisponiveis[escolhaPokemon - 1];
                Pokemon usuario = baseDeDados.getPokemon(nomePokemonEscolhido);
                Pokemon cpu = baseDeDados.getPokemonAleatorio();

                System.out.println("====================================");

                System.out.println("Você escolheu o Pokémon " + nomePokemonEscolhido + "!");
                System.out.println("O adversário escolheu o Pokémon " + cpu.getNome() + " do tipo " + cpu.getTipo() + "!");

                System.out.println("====================================");

                while (usuario.getPontosDeVida() > 0 && cpu.getPontosDeVida() > 0) {
                    System.out.println("Escolha o ataque:");
                    int i = 1;
                    for (String ataque : usuario.getAtaques().keySet()) {
                        System.out.println(i + ". " + ataque);
                        i++;
                    }

                    int escolhaAtaque = scanner.nextInt();
                    System.out.println("====================================");

                    String[] ataquesUsuario = usuario.getAtaques().keySet().toArray(new String[0]);
                    if (escolhaAtaque >= 1 && escolhaAtaque <= ataquesUsuario.length) {
                        String ataqueEscolhido = ataquesUsuario[escolhaAtaque - 1];

                        int dano = usuario.getAtaques().getOrDefault(ataqueEscolhido, 5);
                        cpu.receberAtaque(dano);
                        System.out.println("O "+ cpu.getNome() +" tomou "+ dano + " de dano. Vida restante: " + cpu.getPontosDeVida() );

                        int danoCpu = (int) (Math.random() * 15) + 5;
                        usuario.receberAtaque(danoCpu);
                        System.out.println("Seu Pokémon recebeu " + danoCpu + " de dano. Vida restante: " + usuario.getPontosDeVida());
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }

                System.out.println("====================================");

                if (usuario.getPontosDeVida() <= 0) {
                    System.out.println("Você perdeu! Seu Pokémon foi derrotado.");
                } else {
                    System.out.println("Parabéns! Você venceu a batalha!");
                }

                System.out.println("Deseja jogar novamente? (S/N)");
                String escolha = scanner.next();
                jogarNovamente = escolha.equalsIgnoreCase("S");
            } else {
                System.out.println("Opção inválida. Encerrando o jogo.");
                jogarNovamente = false;
            }
        }

        scanner.close();
    }
}
