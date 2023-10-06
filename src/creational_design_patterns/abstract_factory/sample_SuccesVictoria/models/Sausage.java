package creational_design_patterns.abstract_factory.sample_SuccesVictoria.models;

import creational_design_patterns.abstract_factory.sample_SuccesVictoria.factories.FactoryEnum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sausage extends AbstractSausage {
    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Sausage(String name, FactoryEnum factoryEnum, SausageMembranes membrane, Date expiryDate) {
        this.name = name;
        this.type = factoryEnum;
        this.membrane = membrane;
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Sausage {" +
               "name: '" + name + '\'' +
               ", type: " + type +
               ", membrane: " + membrane.toString() +
               ", expiry date: " + dateFormat.format(expiryDate) +
               '}';
    }

}
