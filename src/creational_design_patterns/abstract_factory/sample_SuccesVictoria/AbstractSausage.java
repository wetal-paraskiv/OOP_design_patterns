package creational_design_patterns.abstract_factory.sample_SuccesVictoria;

import creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories.FactoryEnum;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageMembranes;

import java.util.Date;

public abstract class AbstractSausage {
    public String name;
    public FactoryEnum type;
    public SausageMembranes membrane;
    public Date expiryDate;

    public abstract String getDetails();
}
