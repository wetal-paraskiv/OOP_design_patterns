package creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories;

public class FactoryGenerator {

    public static AbstractSausageFactory getFactory(FactoryEnum factoryEnum) {

        return switch (factoryEnum) {
            case SECTIA_FIERTE -> new FactoryBoiled();
            case SECTIA_SEMIAFUMATE -> new FactorySemiafumate();
            case SECTIA_CRUD_ZVANTATE -> new FactoryCrudZvantate();
        };
    }
}
