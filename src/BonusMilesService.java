public class BonusMilesService {
    public int calculate(int cost) {
        int rublesMile = 20;
        int numMiles = cost / rublesMile;
        return numMiles;
    }
}
