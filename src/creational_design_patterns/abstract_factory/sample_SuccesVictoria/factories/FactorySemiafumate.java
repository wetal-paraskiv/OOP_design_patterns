package creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories;

import creational_design_patterns.abstract_factory.sample_SuccesVictoria.*;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.Sausage;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageEnum;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageMembranes;

public class FactorySemiafumate extends AbstractSausageFactory {
    private final FactoryEnum PROD_SECTION = FactoryEnum.SECTIA_SEMIAFUMATE;
    @Override
    public Sausage getSausage(SausageEnum sausageName) {

        ExpiryCalendar expiry = new ExpiryCalendar();

        switch (sausageName) {
            case DE_CASA -> {
                return new Sausage("Salam de casa", PROD_SECTION, SausageMembranes.NATUR, expiry.getExpiryDate(10));
            }
            case DE_VITA -> {
                return new Sausage("Salam de vita", PROD_SECTION, SausageMembranes.BELCOZIN, expiry.getExpiryDate(15));
            }
            case TARANESC -> {
                return new Sausage("Salam taranesc", PROD_SECTION, SausageMembranes.NATUR, expiry.getExpiryDate(10));
            }
            case MOSCOVSCAIA -> {
                return new Sausage("Salam moscovium", PROD_SECTION, SausageMembranes.BELCOZIN, expiry.getExpiryDate(15));
            }
        }
        return null;
    }
}
