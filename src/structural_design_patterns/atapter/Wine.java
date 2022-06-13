package structural_design_patterns.atapter;

public class Wine {
    private double winePrice;

    public Wine(double quantityInLitres) {
        this.winePrice = quantityInLitres * 19.99;
        System.out.println("Your wine order today is: " + winePrice + " USD.");
        System.out.printf("Thank you for your order!");
    }
}
