package singleton;

public class Main {
    public static void main(String args[]){

        DatabaseConnection dbConnection = DatabaseConnection.getDbConnection();
        DatabaseConnection dbConnection1 = DatabaseConnection.getDbConnection();
        DatabaseConnection dbConnection2 = DatabaseConnection.getDbConnection();
        DatabaseConnection dbConnection3 = DatabaseConnection.getDbConnection();
        DatabaseConnection dbConnection4 = DatabaseConnection.getDbConnection();

        System.out.println(dbConnection);
        System.out.println(dbConnection1);
        System.out.println(dbConnection2);
        System.out.println(dbConnection3);
        System.out.println(dbConnection4);
    }
}
