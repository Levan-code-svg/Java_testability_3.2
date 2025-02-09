public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.87;
        int weight = 98;
        int index = service.calculate(heightMeter, weight);
        System.out.println("Индекс массы тела: " + index);
    }
}