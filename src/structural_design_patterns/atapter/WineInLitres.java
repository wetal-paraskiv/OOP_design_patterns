package structural_design_patterns.atapter;

public class WineInLitres implements WineInLitresInterface{
    @Override
    public Wine purchaseWine(double quantityInLitres) {
        System.out.println("Purchasing " + quantityInLitres + " litres iof Wine.");
        return new Wine(quantityInLitres);
    }
}
