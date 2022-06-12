package abstract_factory;

import java.util.Date;

public abstract class AbstractSausage {

    public String name;
    public FactoryType type;
    public SausageMembranes membrane;
    public Date expiryDate;

    public abstract String getDetails();
}
