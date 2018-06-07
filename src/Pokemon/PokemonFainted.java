package Pokemon;

public class PokemonFainted extends Exception {
    public PokemonFainted(){
        super();
    }

    public PokemonFainted(String mess){
        super(mess);
    }
}
