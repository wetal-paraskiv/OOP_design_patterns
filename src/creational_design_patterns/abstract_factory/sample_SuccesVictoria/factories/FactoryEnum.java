package creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories;

/**
 *
 */
public enum FactoryEnum {
    SECTIA_FIERTE("fiert"),
    SECTIA_SEMIAFUMATE("semiafumat"),
    SECTIA_CRUD_ZVANTATE("crud-zvantat");

    private final String type;

    FactoryEnum(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
