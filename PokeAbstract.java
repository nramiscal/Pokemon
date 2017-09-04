public abstract class PokeAbstract implements PokeInterface {

    // creates a Pokemon
    public Pokemon createPokemon(String name, String type, int health){
        return new Pokemon(name, type, health);
    }

    // lowers the attacked Pokemon's health by 10
    public void attackPokemon(Pokemon pokemon){
        pokemon.setHealth(pokemon.getHealth() - 10);
        System.out.println(pokemon.getName() + "'s health is now " + pokemon.getHealth());
    }

}
