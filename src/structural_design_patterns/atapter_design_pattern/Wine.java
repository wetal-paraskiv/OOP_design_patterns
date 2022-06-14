package structural_design_patterns.atapter_design_pattern;

import java.text.DecimalFormat;

public class Wine {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private double totalCost;

    public Wine(double quantityInLitres) {
        this.totalCost = quantityInLitres * 19.99;
        System.out.println("Total cost of today's wine order is: " + df.format(totalCost) + " USD.");
        System.out.println("Thanks for ordering with our company :)\n");
    }
}
