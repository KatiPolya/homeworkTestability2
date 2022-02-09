public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float IBM = service.calculate(55, 168);
        System.out.println("Индекс массы тела : " + IBM);
    }
}