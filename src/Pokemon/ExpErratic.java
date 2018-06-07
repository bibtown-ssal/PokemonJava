package Pokemon;

public interface ExpErratic {
    default int recalculateExp(int level){
        int exp = 0;
        if(level <= 50){
            exp = (int)( ( Math.pow(level, 3) * ( 100 - level ) ) / 50 )
                    -(int)( ( Math.pow(level-1, 3) * ( 101 - level ) ) / 50 );
        }else if (level <= 68){
            exp = (int) ( ( Math.pow(level, 3) * ( 150 - level ) ) / 100 )
                    -(int) ( ( Math.pow(level-1, 3) * ( 151 - level ) ) / 100 );
        }else if(level <= 98){
            exp = (int) ( ( Math.pow(level, 3) * Math.floor(( 1911 - (level*10) )/3) ) / 500 )
                    -(int) ( ( Math.pow(level-1, 3) * Math.floor(( 1911 - ((level-1)*10) )/3) ) / 500 );
        }else{
            exp = (int) ( ( Math.pow(level, 3) * ( 160 - level ) ) / 100 )
                    - (int) ( ( Math.pow(level-1, 3) * ( 161 - level ) ) / 100 );
        }

        return exp;
    }

}
