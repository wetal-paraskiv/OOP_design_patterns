package anonymousInnerOuterClass;

public class OuterClass {
    public String name = "Outer Class";

    public void saySomething() {
        System.out.println("I am saying something from instance of OUTER Class...");
    }

    public class InnerClass{
        public String name = "Inner Class";

        public void whatsUp() {
            System.out.println("What's up ? from INNER Class...");
        }
    }

    public static class StaticInnerClass{
        public String name = "Static Inner Class";

        public void staticWhatsUp() {
            System.out.println("What's up ? from Static INNER Class...");
        }
    }


}
