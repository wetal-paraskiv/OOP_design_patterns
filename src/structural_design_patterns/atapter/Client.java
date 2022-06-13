package structural_design_patterns.atapter;

public class Client {
    public static void main(String[] args) {
        WineInGallonsInterface adapterInterfaceClass = new WineInGallonsImplClass();
        adapterInterfaceClass.purchaseWineInGallons(10);
    }
}
