package exercise;

// BEGIN
public class ListThread extends Thread {
    private final SafetyList list;
    public ListThread(SafetyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.err.println("Поток был прерван: " + e.getMessage());
                Thread.currentThread().interrupt();
                return;
            }

            list.add(i);
        }
    }
}
// END
