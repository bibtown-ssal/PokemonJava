package Pokemon;

import java.util.HashMap;

public class Bulbasaur extends Pokemon implements ExpMedSlow {
    protected static String species = "Bulbasaur";
    protected static String[] type1 = {"Grass","Poison"};

    @Override
    protected static HashMap<String, Integer> baseStats = new HashMap<>();

    {
        this.baseStats.put("health", 45);
        this.baseStats.put("attack", 49);
        this.baseStats.put("defense", 49);
        this.baseStats.put("spAtt", 65);
        this.baseStats.put("spDef", 65);
        this.baseStats.put("speed", 45);
    }

    public Bulbasaur(int level){
        super(level, species);
        this.gender = "";
    }

    @Override
    public int recalculateExp(int level) {
        return ExpMedSlow.super.recalculateExp(level);
    }

}

