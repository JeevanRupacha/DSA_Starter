package dsa.algo.queues;

import java.util.HashMap;
import java.util.Iterator;

public class StackMethod {

    String name = "test";

    public static void main(String[] args) {

        HashMap<String, Integer> user = new HashMap<>();

        user.put("age", 23);
        user.put("name", 45);
        user.put("age2", 34);
        user.put("age4", 56);

        Iterator itr = user.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

