package Pokemon;

public interface ExpSlow {

    default int recalculateExp(int level){
        return (int)(5*Math.pow(level, 3)/4)-(int)(5*Math.pow(level-1, 3)/4);
    }
}
