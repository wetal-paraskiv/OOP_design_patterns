package structural_design_patterns.atapter_dp.sample_wine;

public class WineInGallonsImpl extends WineInLitresImpl implements WineInGallonsInterface{
    @Override
    public Wine purchaseWineInGallons(double gallons) {
        double litres = convertGallonsInLitres(gallons);
        System.out.println("\tTransforming " + gallons + " gallons to litres.");

        return purchaseWine(litres);
    }

    private double convertGallonsInLitres(double gallons) {
        return gallons * 3.79;
    }
}
