import java.util.List;

public class OddList {
    public static void main(String[]args){
        

    }
    public static boolean oddList(List<Integer> list){
        for(int i:list){
            if(i %2==0){
                return false;
            }
            
        }
        return true;
    }
    
}
