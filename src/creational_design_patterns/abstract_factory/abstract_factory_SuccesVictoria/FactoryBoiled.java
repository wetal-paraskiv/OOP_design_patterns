package creational_design_patterns.abstract_factory.abstract_factory_SuccesVictoria;

public class FactoryBoiled extends AbstractSausageFactory {

    ExpiryCalendar expiry = new ExpiryCalendar();
    FactoryType factory = FactoryType.SECTIA_FIERTE;

    @Override
    Sausage getSausage(SausageEnum sausageName) {

        switch (sausageName) {
            case DOCTORSCAIA_NATUR -> {
                return new Sausage("Parizer Doctorscaia", factory, SausageMembranes.NATUR, expiry.getExpiryDate(3));
            }
            case DOCTORSCAIA_BELCOZIN -> {
                return new Sausage("Parizer Doctorscaia", factory, SausageMembranes.BELCOZIN, expiry.getExpiryDate(7));
            }
            case DOCTORSCAIA_POLYAMID -> {
                return new Sausage("Parizer Doctorscaia", factory, SausageMembranes.POLYAMID, expiry.getExpiryDate(10));
            }
            case CRENVURSTI -> {
                return new Sausage("Crenvursti Premium", factory, SausageMembranes.CELULOZA, expiry.getExpiryDate(3));
            }
            case MOLOCINAIA -> {
                return new Sausage("Parizer Molocinaia", factory, SausageMembranes.BELCOZIN, expiry.getExpiryDate(5));
            }
        }
        return null;
    }
}
