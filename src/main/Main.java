package main;

import threads.Consumer;
import threads.Producer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> excperiencedList = Collections.synchronizedList(new ArrayList<Integer>());
        Thread cons = new Consumer(excperiencedList);
        Thread prod = new Producer(excperiencedList);
        cons.start();
        prod.start();

    }
}
