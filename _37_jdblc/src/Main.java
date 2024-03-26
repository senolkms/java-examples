import java.sql.Connection;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        DbHelper helper = new DbHelper();

        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}