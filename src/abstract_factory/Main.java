package abstract_factory;

public class Main {

    public static void main(String[] args) {
        AbstractSausage doctNatur = FactoryGenerator.getFactory(FactoryType.SECTIA_FIERTE).getSausage(SausageEnum.DOCTORSCAIA_NATUR);
        System.out.println(doctNatur.getDetails());

        AbstractSausage mosc = FactoryGenerator.getFactory(FactoryType.SECTIA_CRUD_ZVANTATE).getSausage(SausageEnum.MOSCOVSCAIA);
        System.out.println(mosc.getDetails());

        AbstractSausage doctPoliamid = FactoryGenerator.getFactory(FactoryType.SECTIA_FIERTE).getSausage(SausageEnum.DOCTORSCAIA_POLYAMID);
        System.out.println(doctPoliamid.getDetails());
    }
}
