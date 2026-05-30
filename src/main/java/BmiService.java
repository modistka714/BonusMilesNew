public class BmiService {
    public int calculate(double rost, int ves) {
        int index;
        index = (int)  (ves /  (rost * rost));
        return index;

    }
}
