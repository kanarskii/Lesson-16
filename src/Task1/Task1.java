package Task1;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        String [] array = {"a", "b" , "a", "c", "b"};
        HashMap<String, Boolean> map = new HashMap<>();
        for(String str : array){
            if(map.containsKey(str)){
                map.put(str,true);
            }else {
                map.put(str, false);
            }
        }
        System.out.println(map);
    }
}
