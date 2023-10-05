package creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories;

import creational_design_patterns.abstract_factory.sample_SuccesVictoria.*;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.Sausage;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageEnum;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageMembranes;

public class FactoryCrudZvantate extends AbstractSausageFactory {

    ExpiryCalendar expiry = new ExpiryCalendar();

    @Override
    public Sausage getSausage(SausageEnum sausageName) {

        switch (sausageName) {
            case MOSCOVSCAIA -> {
                return new Sausage("Moscovskaia", FactoryEnum.SECTIA_CRUD_ZVANTATE, SausageMembranes.BELCOZIN, expiry.getExpiryDate(10));
            }
            case STOLICHNAIA -> {
                return new Sausage("Stolichnaia", FactoryEnum.SECTIA_CRUD_ZVANTATE, SausageMembranes.BELCOZIN, expiry.getExpiryDate(10));
            }
        }
        return null;
    }
}
