package designPatterns.factory.eg1;

public class LinuxOperationSys  extends OperatingSystem  {

    public LinuxOperationSys(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
