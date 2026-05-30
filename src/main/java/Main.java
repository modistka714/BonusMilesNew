public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double rost = 1.87;
        int ves = 98;

        int index = service.calculate(rost, ves);

        System.out.println(index);

    }
}

