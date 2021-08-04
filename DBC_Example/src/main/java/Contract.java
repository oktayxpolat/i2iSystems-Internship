public class Contract {
    //Check weight limit for plane baggage
    public static boolean checkWeight(int num){
        if(num<15 && num>0)
            return true;
        else
            return false;
    }
}
