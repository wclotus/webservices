package lab1Problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers and '-1' to get results");
        while (input.hasNext()) {
            int x = input.nextInt();
            if (x >= 0 && x <= 50){
                Integer val = counter.get(x);
                if(val == null){
                    counter.put(x, 1);
                } else {
                    counter.put(x, ++val);
                }
            } else if(x == -1){
                break;
            }
        }

        for(Integer key : counter.keySet()){
            System.out.println(key + " showed up " + counter.get(key) + " times");
        }
    }

}
