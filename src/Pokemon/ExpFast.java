package Pokemon;

public interface ExpFast {
    default int recalculateExp(int level){
        return (int)(4*Math.pow(level, 3)/5) - (int)(4*Math.pow(level-1, 3)/5);
    }
}
