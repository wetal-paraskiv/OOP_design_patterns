package creational_design_patterns.abstract_factory.sample_SuccesVictoria;

import creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories.FactoryEnum;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories.FactoryGenerator;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.AbstractSausage;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageEnum;

public class Main {

    public static void main(String[] args) {
        AbstractSausage doctNatur = FactoryGenerator.getFactory(FactoryEnum.SECTIA_FIERTE).getSausage(SausageEnum.DOCTORSCAIA_NATUR);
        System.out.println(doctNatur.getDetails());

        AbstractSausage mosc = FactoryGenerator.getFactory(FactoryEnum.SECTIA_CRUD_ZVANTATE).getSausage(SausageEnum.MOSCOVSCAIA);
        System.out.println(mosc.getDetails());

        AbstractSausage doctPoliamid = FactoryGenerator.getFactory(FactoryEnum.SECTIA_FIERTE).getSausage(SausageEnum.DOCTORSCAIA_POLYAMID);
        System.out.println(doctPoliamid.getDetails());

        AbstractSausage moscovium = FactoryGenerator.getFactory(FactoryEnum.SECTIA_SEMIAFUMATE).getSausage(SausageEnum.MOSCOVSCAIA);
        System.out.println(moscovium.getDetails());
    }
}
