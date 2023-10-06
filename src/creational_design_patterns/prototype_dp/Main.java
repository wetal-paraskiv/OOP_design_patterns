package creational_design_patterns.prototype_dp;

/**
 * The prototype design pattern enables you to create new instances by copying existing instances to avoid the overhead
 * involved in creating objects that can consume more resources.
 * Think stock. Design patterns are used to solve recurring problems and complexities in software development.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop wetalShop = new BookShop();
        wetalShop.setShopName("Wetalik's");
        wetalShop.loadData();

        BookShop artaShop = wetalShop.clone();
        artaShop.setShopName("artaShop");

        wetalShop.getBooks().remove(0);
        wetalShop.setShopName("WETAL's shop");

        System.out.println(wetalShop);
        System.out.println(artaShop);
    }
}
