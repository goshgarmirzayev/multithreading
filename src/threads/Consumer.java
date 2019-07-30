package threads;

import java.util.List;

public class Consumer extends Thread {
    private List<Integer> integerList;

    public Consumer(List<Integer> integerList) {
        this.integerList = integerList;

    }

    public void removeFromList(List<Integer> integerList) throws Exception {
        if (integerList.size() > 0) {
            System.out.println("removed " + integerList.remove(integerList.size() - 1));
        }


    }

    @Override
    public void run() {
        try {
            while (true) {
                removeFromList(this.integerList);
            }
        } catch (Exception e) {

        }
    }

}
