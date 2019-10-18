import java.sql.Connection;
import java.sql.DriverManager;

public class DataUtility {
    
    public static Connection connect() throws Exception{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
      return con;      
    }
}
