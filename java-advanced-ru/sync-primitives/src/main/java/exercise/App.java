package exercise;

class App {

    public static void main(String[] args) {
        // BEGIN
        SafetyList list = new SafetyList();

        ListThread thread1 = new ListThread(list);
        ListThread thread2 = new ListThread(list);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Основной поток был прерван: " + e.getMessage());
        }

        System.out.println("Количество элементов в списке: " + list.getSize());

        // END
    }
}

