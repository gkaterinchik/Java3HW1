package task2;

import java.util.ArrayList;

public class ArrayToArrList<T> {
    ArrayList<T> list = new ArrayList<>();
    public ArrayList<T> makeList(T element[]){
        ArrayList<T> list = new ArrayList<>();
        for(int i=0; i< element.length; i++){
list.add(i,element[i]);
        }
     return list;
    }

}
