package abstract_factory;

public class FactorySemiafumate extends AbstractSausageFactory{
    @Override
    Sausage getSausage(SausageEnum sausageName) {

        ExpiryCalendar expiry = new ExpiryCalendar();

        switch (sausageName) {
            case DE_CASA -> {
                return new Sausage("Salam de casa", FactoryType.SECTIA_SEMIAFUMATE, SausageMembranes.NATUR, expiry.getExpiryDate(10));
            }
            case DE_VITA -> {
                return new Sausage("Salam de vita", FactoryType.SECTIA_SEMIAFUMATE, SausageMembranes.BELCOZIN, expiry.getExpiryDate(15));
            }
            case TARANESC -> {
                return new Sausage("Salam taranesc", FactoryType.SECTIA_SEMIAFUMATE, SausageMembranes.NATUR, expiry.getExpiryDate(10));
            }
        }
        return null;
    }
}
