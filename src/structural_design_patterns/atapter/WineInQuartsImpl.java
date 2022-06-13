package structural_design_patterns.atapter;


public class WineInQuartsImpl extends WineInLitresImpl implements WineInQuartsInterface {
    @Override
    public Wine purchaseWineInQuarts(double quantityInQuarts) {
        double litres = convertQuartsToLitres(quantityInQuarts);
        return purchaseWine(litres);
    }

    private double convertQuartsToLitres(double quantityInQuarts) {
        return quantityInQuarts * 4 * 3.79;
    }
}
