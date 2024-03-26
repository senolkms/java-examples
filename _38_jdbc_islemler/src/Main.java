import java.sql.*;
import java.util.ArrayList;
//ilk islemler aşağıdaki fonkda
public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        DbHelper helper = new DbHelper();

        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement(); //sorguyu bağlantıya gönderdik
            resultSet = statement.executeQuery("select actor_id,first_name,last_name from actor");//sorguyu çalıştır
            ArrayList<Actor> actors=new ArrayList<>();
            while (resultSet.next())//cümleleri tek tek gez
            {
                //System.out.println(resultSet.getString("first_name"));
                actors.add(new Actor(
                        resultSet.getInt("actor_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")));
                System.out.println(resultSet.getInt("actor_id")+" "+resultSet.getString("first_name")+" "+resultSet.getString("last_name"));
            }
            System.out.println(actors.size()+" elemandan oluşuyor");

        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
    public static void insertInto() throws SQLException{
        Connection connection=null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null; //PreparedStatement : cümle hazırla,sql hazırla
        try {
            connection = helper.getConnection();
            //statement=connection.prepareStatement("insert into actor(first_name,last_name) values('Şenol','Kumaş')");//sorguyu çalıştır
            String sql="insert into actor(first_name,last_name) values(?,?)";
            statement= connection.prepareStatement(sql);
            statement.setString(1,"Şenol");
            statement.setString(2,"Kumaşş");

            statement.executeUpdate();
            System.out.println("Kayıt eklendi");

        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
        }
        public static void update() throws SQLException{
            Connection connection=null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement=null; //PreparedStatement : cümle hazırla,sql hazırla
            try {
                connection = helper.getConnection();
                String sql="update actor set last_name = 'güncellemeeee',first_name='deneme' where actor_id=?";

                statement= connection.prepareStatement(sql);
                statement.setInt(1,202);

                statement.executeUpdate();
                System.out.println("Kayıt güncellendi");

            }catch (SQLException exception){
                helper.showErrorMessage(exception);
            }
            finally {
                statement.close();
                connection.close();
            }
    }
    public static void delete() throws SQLException{
        Connection connection=null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null; //PreparedStatement : cümle hazırla,sql hazırla
        try {
            connection = helper.getConnection();
            String sql="delete from actor where actor_id=?";

            statement= connection.prepareStatement(sql);
            statement.setInt(1,203);

            statement.executeUpdate();
            System.out.println("Kayıt Silindi");

        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
}
