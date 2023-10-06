package structural_design_patterns.atapter_dp.sample_wine;

public class WineInLitresImpl implements WineInLitresInterface{
    @Override
    public Wine purchaseWine(double litres) {
        System.out.println("Purchasing " + litres + " litres of Wine.");
        return new Wine(litres);
    }
}
