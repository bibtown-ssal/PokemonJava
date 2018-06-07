package Pokemon;

public class Bulbasaur extends Pokemon implements ExpMedSlow {
    protected static String species = "Bulbasaur";
    protected static String[] type1 = {"Grass","Poison"};

    public Bulbasaur(int level){
        super(level,45,49,49,65,65,45, species);
        this.gender = "";
    }

    @Override
    public int recalculateExp(int level) {
        return ExpMedSlow.super.recalculateExp(level);
    }

}

