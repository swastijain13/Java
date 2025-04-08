package JavaTopics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class collections {
    //ArrayList
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Cherry");
        list.add("Orange");

        System.out.println("First element: " + list.get(0));

        list.remove(1);

        System.out.println("Elements in ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("Size of ArrayList: " + list.size());


        //Hashmaps
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Price of Banana: " + map.get("Banana"));
        map.remove("Apple");

        System.out.println("Elements in HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("Size of HashMap: " + map.size());



        //HashSet
        HashSet<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  

        System.out.println("Contains Apple? " + set.contains("Apple"));
        System.out.println("Contains Orange? " + set.contains("Orange"));
        
        // Iterate through HashSet
        System.out.println("Elements in HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        
        // Size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
        


        //ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Apple");
        deque.addLast("Banana");

        System.out.println("Elements in ArrayDeque:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }
        System.out.println("Size of ArrayDeque: " + deque.size());

        System.out.println("First element: " + deque.removeFirst());
        System.out.println("Last element: " + deque.removeLast());

        System.out.println("Size of ArrayDeque: " + deque.size());




        //PRIORITY QUEUE
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(20);

        System.out.println("Elements in minHeap :");
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(15);
        maxHeap.add(20);

        System.out.println("Elements in maxHeap :");
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }

    }

}
