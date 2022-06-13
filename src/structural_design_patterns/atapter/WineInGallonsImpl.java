package structural_design_patterns.atapter;

public class WineInGallonsImpl extends WineInLitresImpl implements WineInGallonsInterface{
    @Override
    public Wine purchaseWineInGallons(double quantityInGallons) {
        double quantityInLitres = convertGallonsInLitres(quantityInGallons);
        return purchaseWine(quantityInLitres);
    }

    private double convertGallonsInLitres(double quantityInGallons) {
        return quantityInGallons * 3.79;
    }
}
