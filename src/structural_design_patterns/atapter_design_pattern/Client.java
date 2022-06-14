package structural_design_patterns.atapter_design_pattern;

public class Client {
    public static void main(String[] args) {

        WineInLitresInterface wineInLitres = new WineInLitresImpl();
        wineInLitres.purchaseWine(10);

        // for purchasing wine in gallons -> made an adapter class extending WineInLitresImpl implementing WineInGallonsInterface
        WineInGallonsInterface adapterInterfaceClass = new WineInGallonsImpl();
        adapterInterfaceClass.purchaseWineInGallons(10);

        // for purchasing in quarts
        WineInQuartsInterface adapterInQuarts = new WineInQuartsImpl();
        adapterInQuarts.purchaseWineInQuarts(10);

    }
}
