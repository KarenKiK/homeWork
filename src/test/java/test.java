import ru.itpark.CalculateBonus;

public class test {
    public static void main(String[] args) {
        CalculateBonus service = new CalculateBonus();
        System.out.println(service.calculate(10_000,150_001));
    }
}
