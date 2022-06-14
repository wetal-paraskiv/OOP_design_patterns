package creational_design_patterns.prototype_design_pattern;

/**
 * The prototype design pattern enables you to create new instances by copying existing instances to avoid the overhead
 * involved in creating objects that can consume more resources.
 * Thinkstock. Design patterns are used to solve recurring problems and complexities in software development.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop wetalik = new BookShop();
        wetalik.setShopName("Wetalik's");
        wetalik.loadData();

        BookShop arta = wetalik.clone();
//        arta.setShopName("Arta's");

        wetalik.getBooks().remove(0);
        wetalik.setShopName("WETAL");



        System.out.println(wetalik);

        System.out.println(arta);
    }
}
