package Task2;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String [] array = {"man", "moon", "good", "night"};
        HashMap <String , String> hashMap = new HashMap<>();
        for (String str : array){
            String first = "" + str.charAt(0);
            String last = "" + str.charAt(str.length()-1);
            hashMap.put(first,last);
        }
        System.out.println(hashMap);
    }
}
