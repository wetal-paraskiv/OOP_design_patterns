package creational_design_patterns.factory;

public class FactoryOS {
    public OS getSystem(OSEnum system) {
        switch (system) {
            case ANDROID: return new Android();
            case IOS: return new IOS();
            case WINDOWS: return new Windows();
        }
        return null;
    }
}
