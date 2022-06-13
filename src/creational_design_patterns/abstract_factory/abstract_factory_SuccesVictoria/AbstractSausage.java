package creational_design_patterns.abstract_factory.abstract_factory_SuccesVictoria;

import java.util.Date;

public abstract class AbstractSausage {

    public String name;
    public FactoryType type;
    public SausageMembranes membrane;
    public Date expiryDate;

    public abstract String getDetails();
}
