package structural_design_patterns.atapter_dp.sample_wine;

import java.text.DecimalFormat;

public class Wine {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private final double PRICE = 19.99;
    private double totalCost;

    public Wine(double litres) {
        this.totalCost = litres * PRICE;
        System.out.println("Total cost of today's wine order is: " + df.format(totalCost) + " USD.");
        System.out.println("\t\tThanks for ordering with our company :)\n");
    }
}
