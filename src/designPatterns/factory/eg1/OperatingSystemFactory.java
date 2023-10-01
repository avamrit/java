package designPatterns.factory.eg1;

public class OperatingSystemFactory {
    private OperatingSystemFactory(){}

    public static OperatingSystem getInstance(String type, String version,String architecture){
        switch (type){
            case "WINDOWS":
                return new WindowsOperatingSys(version,architecture);
            case "LINUX":
                return new LinuxOperationSys(version,architecture);
            default:
                throw new IllegalArgumentException("OS not supported");
        }
    }
}
