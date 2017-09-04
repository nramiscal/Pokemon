public class PokeTest {
    public static void main(String [] args){

        Pokedex pd = new Pokedex();
        Pokemon p = pd.createPokemon("Pikachu", "Electric", 10);
        Pokemon r = pd.createPokemon("Raichu", "Psychic", 5);
        Pokemon f = pd.createPokemon("Flygon", "Dragon", 15);
        pd.attackPokemon(r);
        pd.pokemonInfo(r);
        pd.attackPokemon(p);
        pd.pokemonInfo(p);
        System.out.println("Number of Pokemons: "+Pokemon.howMany());

	}
}
