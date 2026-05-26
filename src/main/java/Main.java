public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили
        int ticketPrice = 13676;
        int costForMiles = 20;

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int milesForTicket = ticketPrice / costForMiles;
        System.out.println("количество бонусных миль: " + milesForTicket);

    }
}
