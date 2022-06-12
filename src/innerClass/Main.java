package innerClass;


public class Main {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.saySomething();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.whatsUp();

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.staticWhatsUp();


    }
}
