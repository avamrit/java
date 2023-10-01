package designPatterns.factory.eg1;

public class WindowsOperatingSys extends OperatingSystem  {

    public WindowsOperatingSys(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println(dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println(dir);
    }
}
