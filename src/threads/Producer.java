package threads;

import java.util.List;


public class Producer extends Thread {
    private List<Integer> integerList;
    private int element = 0;

    public Producer(List<Integer> integerList) {
        this.integerList = integerList;

    }

    public void fillList(List<Integer> integerList) throws Exception {
        if (integerList.size() > 100) {
            System.out.println("Size is 100 please wait");
            Thread.sleep(5000);

        } else {
            integerList.add(++element);
        }
    }


    @Override
    public void run() {
        try {
            while (true) {
                fillList(this.integerList);
            }
        } catch (Exception e) {
        }
    }
}
