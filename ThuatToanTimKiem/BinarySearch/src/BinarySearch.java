import java.util.ArrayList;

public class BinarySearch {
    public static boolean BinarySearch(ArrayList<Integer> array,int value,int first, int last){
        int m = (last+first)/2;
        while (first<=last){

            if(value==array.get(m)){
                return true;

            }else if(value>array.get(m)){

                return BinarySearch(array,value,m+1,last);

            }else if(value<array.get(m)){

                return BinarySearch(array,value,first,m-1);
            }

        }
        return false;


    }
}
