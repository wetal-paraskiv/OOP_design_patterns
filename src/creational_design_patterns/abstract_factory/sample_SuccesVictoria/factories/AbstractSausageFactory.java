package creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories;

import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.Sausage;
import creational_design_patterns.abstract_factory.sample_SuccesVictoria.models.SausageEnum;

public abstract class AbstractSausageFactory {
    public abstract Sausage getSausage(SausageEnum sausageName);
}
