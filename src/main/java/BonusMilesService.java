public class BonusMilesService {
    public int calculate(int price) {
        int costForMiles = 20;
        return price / costForMiles;
    }
}
