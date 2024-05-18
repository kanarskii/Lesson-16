package TaskStar;

import java.util.*;

public class TaskStar {
    public static void main(String[] args) {
        System.out.println(checkBalance("([{{[(())]}}])"));
    }

    private static boolean checkBalance(String input) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            if (hashMap.containsValue(c)) {
                deque.push(c);
            } else if (hashMap.containsKey(c)) {
                if (deque.isEmpty() || deque.pop() != hashMap.get(c)) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
