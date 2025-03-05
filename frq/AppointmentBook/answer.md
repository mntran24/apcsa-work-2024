public int findFreeBlock(int period, int duration){
    int start = -1;
    for (int i=0;i<60;i++){
        if(isMinuteFree(period,i)){
            start = i;
            for (int x = start;x<start+duration;x++){
                if (!isMinuteFree(period,x)){
                    start = -1;
                    i = x;
                    break;
                }
            }
            return start;
        }
    }
    return -1;
}
public boolean makeAppointment(int startPeriod, int endPeriod,
                               int duration){
    for (int i = startPeriod; i<endPeriod+1;i++){
        if (findFreeBlock(i,duration)!=-1){
            reserveBlock(i,findFreeBlock(i,duration),duration)
            return true;
        }
    }
    return false;
}
