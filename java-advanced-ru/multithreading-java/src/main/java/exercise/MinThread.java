package exercise;

// BEGIN
public class MinThread extends Thread {
    private int[] numbers;
    private int minNumber;
    public void MaxNumberFinderThread(int[] numbers) {
        this.numbers = numbers;
    }

    public MinThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пуст или равен null.");
            return;
        }

        minNumber = numbers[0];

        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Максимальное число в массиве: " + minNumber);
    }
    public int getMinNumber() {
        return minNumber;
    }
}
// END
