package structural_design_patterns.atapter;

public class WineInLitresImpl implements WineInLitresInterface{
    @Override
    public Wine purchaseWine(double quantityInLitres) {
        System.out.println("\tPurchasing " + quantityInLitres + " litres of Wine.");
        return new Wine(quantityInLitres);
    }
}
