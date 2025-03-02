package exercise;

// BEGIN
public class MaxThread extends Thread {
    private int[] numbers;
    private int maxNumber;
    public void MaxNumberFinderThread(int[] numbers) {
        this.numbers = numbers;
    }

    public MaxThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пуст или равен null.");
            return;
        }

        maxNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Максимальное число в массиве: " + maxNumber);
    }
    public int getMaxNumber() {
        return maxNumber;
    }


}
// END
