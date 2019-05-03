package singleton;

public class DatabaseConnection {

    private static DatabaseConnection dbConnection = null;

    private DatabaseConnection(){

    }

    static DatabaseConnection getDbConnection(){
        if(dbConnection == null){
            dbConnection = new DatabaseConnection();
        }
        return dbConnection;
    }
}
