package structural_design_patterns.atapter_design_pattern;

public class WineInLitresImpl implements WineInLitresInterface{
    @Override
    public Wine purchaseWine(double quantityInLitres) {
        System.out.println("\tPurchasing " + quantityInLitres + " litres of Wine.");
        return new Wine(quantityInLitres);
    }
}
