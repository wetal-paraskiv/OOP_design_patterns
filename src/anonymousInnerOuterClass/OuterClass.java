package anonymousInnerOuterClass;

public class OuterClass {
    public String name = "Outer Class";

    public void saySomething() {
        System.out.println("What's up ? instance of " + this.name + "...from..." + this.getClass().getName());
    }

    public class InnerClass {
        public String name = "Inner Class";

        public void whatsUp() {
            System.out.println("What's up ? instance of " + this.name + "...from..." + this.getClass().getName());
        }
    }

    public static class StaticInnerClass {
        public String name = "Static Inner Class";

        public void staticWhatsUp() {
            System.out.println("What's up ? instance of " + this.name + "...from..." + this.getClass().getName());
        }
    }


}
