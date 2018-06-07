package Pokemon;

public interface ExpMedSlow {

    default int recalculateExp(int level){
        return (int)( ( ( 6/5 ) * Math.pow( level+1,3 ) ) - ( 15*Math.pow ( level+1, 2 ) ) + ( 100 * level+1 ) - 140 )
                -(int)( ( ( 6/5 ) * Math.pow( level,3 ) ) - ( 15*Math.pow ( level, 2 ) ) + ( 100 * level ) - 140 );
    }
}
