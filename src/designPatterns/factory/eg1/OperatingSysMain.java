package designPatterns.factory.eg1;

public class OperatingSysMain {
    public static void main(String[] args) {
        OperatingSystem op = OperatingSystemFactory.getInstance("WINDOWS","v.1","Fortam");
        op.changeDir("Windows die = cd enter");
        op.removeDir("windows rm  = rm enter");

    }
}
