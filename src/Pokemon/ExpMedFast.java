package Pokemon;

public interface ExpMedFast {
    default int recalculateExp(int level){
        return (int)(Math.pow(level, 3)) - (int)(Math.pow(level-1, 3));
    }
}
