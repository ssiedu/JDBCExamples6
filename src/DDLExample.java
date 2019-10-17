
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DDLExample {

    public static void main(String[] args) throws Exception {
        
        String sql="create table dummy (col1 char, col2 char)";
        //String sql="DROP TABLE dummy";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Table CREATED/DROPPED");
        con.close();
    }
}
