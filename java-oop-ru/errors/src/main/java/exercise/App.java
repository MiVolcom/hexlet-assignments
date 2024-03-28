package exercise;

// BEGIN
public class App {
    public static printSquare(Circle circle) {
        try {
            System.out.println(circle.getSquare());
        } catch (NegativeRadiusException e) {
            e.getMessage();
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
