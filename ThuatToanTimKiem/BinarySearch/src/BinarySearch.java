import java.util.ArrayList;

public class BinarySearch {
    public static boolean BinarySearch(ArrayList<Integer> array,int value){
        int l = 0;
        int r = array.size()-1;
        int m = (l+r)/2;
        while (array.size()>=1){
            if(value==array.get(m)){
                return true;
            }else if(value>array.get(m)){
                int newSize = array.size()/2;
                while (array.size()>newSize){array.remove(0);}
                m/=2;
            }else if(value<array.get(m)){
                int newSize = array.size()/2;
                while (array.size()>newSize){array.remove(array.size()-1);}
                m/=2;
            }

        }
        return false;


    }
}
