import ru.netology.sqr.SqrtService;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        System.out.println("Количество квадратов: " + (service.calcSqrt(99) + " квадратов от 10 до 99"));
    }
}