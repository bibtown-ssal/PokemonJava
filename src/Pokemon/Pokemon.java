package Pokemon;
import java.util.HashMap;

public abstract class Pokemon {
    protected String name;
    protected int level;
    protected String gender;
    protected int currentHP;
    private HashMap<String, Integer> stats = new HashMap<>();
    private HashMap<String, Integer> iv = new HashMap<>();
    private HashMap<String, Integer> base = new HashMap<>();
    protected int experience = 0;
    protected int expToLvlUp = 0;
    private int EV = 0;
    abstract protected HashMap<String, Integer> baseStats;

    public Pokemon(int level, String name){
        this.iv.put("health", 1+(int)(Math.random()*31));
        this.iv.put("attack", 1+(int)(Math.random()*31));
        this.iv.put("defense", 1+(int)(Math.random()*31));
        this.iv.put("spAtt", 1+(int)(Math.random()*31));
        this.iv.put("spDef", 1+(int)(Math.random()*31));
        this.iv.put("Speed", 1+(int)(Math.random()*31));

        this.name = name;
        this.level = level;
        refreshStats();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getGender() {
        return gender;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public String getStats() {
        String stats = "Health : " + this.stats.get("health") + "\nAttack : " + this.stats.get("attack") + "\nDefense : "
                + this.stats.get("defense") + "\nSpecial Attack : " + this.stats.get("spAttack") + "\nSpecial Defense : "
                + this.stats.get("spDef") + "\nSpeed : " + this.stats.get("speed");
        return stats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIv() {
        String iv = "Health : " + this.iv.get("health") + "\nAttack : " + this.iv.get("attack") + "\nDefense : "
                + this.iv.get("defense") + "\nSpecial Attack : " + this.iv.get("spAttack") + "\nSpecial Defense : "
                + this.iv.get("spDef") + "\nSpeed : " + this.iv.get("speed");
        return iv;
    }

    public int getAttack() {
        return this.stats.get("attack");
    }

    public int getDefence() {
        return this.stats.get("defence");
    }

    public int getHealth() {
        return this.stats.get("health");
    }

    public int getSpAttack() {
        return this.stats.get("spAttack");
    }

    public int getSpDef() {
        return this.stats.get("spDef");
    }

    public int getSpeed() {
        return this.stats.get("speed");
    }

    public void addExp(int exp){
        this.experience += exp;
        if(this.experience >= this.expToLvlUp){
            this.levelUp();
        }
    }

    private void levelUp(){
        experience -= expToLvlUp;
        level ++;
        expToLvlUp = recalculateExp(this.level);

        refreshStats();
    };

    private void refreshStats(){
        this.stats.put("health", calculateHealth());
        this.stats.put("attack", calculateStat(this.baseStats.get("attack")));
        this.stats.put("defense", calculateStat(this.baseStats.get("defense")));
        this.stats.put("spAtt", calculateStat(this.baseStats.get("spAtt")));
        this.stats.put("spDef", calculateStat(this.baseStats.get("spDef")));
        this.stats.put("speed", calculateStat(this.baseStats.get("speed")));
    }

    private int calculateHealth(int base){
     return (int)Math.floor(((base + this.iv.get("health"))*2+Math.floor(Math.sqrt(EV)/4))*this.level/100)+level+10;
    }

    private int calculateStat(int base){
        return (int)Math.floor(((base + this.iv.get("health"))*2+Math.floor(Math.sqrt(EV)/4))*this.level/100)+5;
    }
    protected abstract int recalculateExp(int level);
}
