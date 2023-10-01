package designPatterns.singleton;

public class DatabaseLayer {

    public static DatabaseLayer  db;
    private DatabaseLayer(){
        if(db!=null){
            throw new RuntimeException("get your object by  getDBinstance()"); // avoiding the object creation from Reflcetion Api
        }
    }
    public static DatabaseLayer getDbInstance(){
        if(db==null){
            //using double checking in case  of multithreaded env
            synchronized (DatabaseLayer.class){
                if(db==null){
                    db = new DatabaseLayer();
                }
            }
        }
        return db;
    }
}
