package abstract_factory;

public class FactoryGenerator {

    public static AbstractSausageFactory getFactory(FactoryType factoryType) {

        switch (factoryType) {
            case SECTIA_FIERTE:
                return new FactoryBoiled();
            case SECTIA_SEMIAFUMATE:
                return new FactorySemiafumate();
            case SECTIA_CRUD_ZVANTATE:
                return new FactoryCrudZvantate();
        }
        return null;
    }
}
