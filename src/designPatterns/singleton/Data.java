package designPatterns.singleton;

public class Data {
    public static void main(String[] args) {
     DatabaseLayer d1 = DatabaseLayer.getDbInstance();
        System.out.println(d1);
        DatabaseLayer d2 = DatabaseLayer.getDbInstance();
        System.out.println(d2);
    }
}
