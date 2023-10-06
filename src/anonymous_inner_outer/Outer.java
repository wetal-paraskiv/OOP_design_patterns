package anonymous_inner_outer;

public class Outer {
    public String name = this.getClass().getSimpleName();

    public void whatsUp() {
        System.out.println("What's up ? instance of " + this.name + "...from..." + this.getClass().getName());
    }

    public class Inner {
        public String name = this.getClass().getSimpleName();

        public void whatsUp() {
            System.out.println("What's up ? instance of " + this.name + "...from..." + this.getClass().getName());
        }
    }

    public static class InnerStatic {
        public String name = this.getClass().getSimpleName();

        public void whatsUp() {
            System.out.println("What's up ? instance of " + this.name + "...from..." + this.getClass().getName());
        }
    }


}
