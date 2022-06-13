package creational_design_patterns.abstract_factory.abstract_factory_SuccesVictoria;

public class FactoryCrudZvantate extends AbstractSausageFactory {

    ExpiryCalendar expiry = new ExpiryCalendar();

    @Override
    Sausage getSausage(SausageEnum sausageName) {

        switch (sausageName) {
            case MOSCOVSCAIA -> {
                return new Sausage("Moscovskaia", FactoryType.SECTIA_CRUD_ZVANTATE, SausageMembranes.BELCOZIN, expiry.getExpiryDate(10));
            }
            case STOLICHNAIA -> {
                return new Sausage("Stolichnaia", FactoryType.SECTIA_CRUD_ZVANTATE, SausageMembranes.BELCOZIN, expiry.getExpiryDate(10));
            }
        }
        return null;
    }
}
