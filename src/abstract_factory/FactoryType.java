package abstract_factory;

public enum FactoryType {
    SECTIA_FIERTE("fiert"),
    SECTIA_SEMIAFUMATE("semiafumat"),
    SECTIA_CRUD_ZVANTATE("crud-zvantat");

    private final String type;

    FactoryType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
