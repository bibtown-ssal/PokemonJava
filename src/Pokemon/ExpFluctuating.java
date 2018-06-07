package Pokemon;

public interface ExpFluctuating {
    default int recalculateExp(int level){
        int exp;
        if(level <= 15){
            exp = (int) ( (Math.floor((level+1)/3)+24)/50 ) - (int) ( (Math.floor((level)/3)+24)/50 );
        }else if(level <= 36){
            exp = (int) ( (level + 14) / 50)-(int) ( (level + 13) / 50);
        }else{
            exp = (int) ((Math.floor( level / 2)+32)/50) - (int) ((Math.floor( (level-1) / 2)+32)/50);
        }
        return exp;
    }
}
