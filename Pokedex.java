public class Pokedex extends PokeAbstract {

    // returns the name, health, and type of the pokemon
    public void pokemonInfo(Pokemon pokemon){
        System.out.println("Pokemon [ name = " + pokemon.getName() + ", type = " + pokemon.getType() + ", health = " + pokemon.getHealth() + "]");
    }
}
