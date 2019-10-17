import java.sql.*;


public class StudentEntry {
    public static void main(String[] args) {
        try {
            //step-1(driver loading)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            
            //step-2 (connection establishment)
            String url="jdbc:mysql://localhost:3306/mydata";
            String uid="root";
            String pwd="root";
            Connection con=DriverManager.getConnection(url,uid,pwd);
            System.out.println("Connected Successfully");
            
            //step-3 (draft a SQL)
            //String sql="insert into student values(112,'bbb','c@gml.com','78783344556')";
            
            //step-4 (send this SQL to DB using Statement/PreparedStatement object)
            Statement stmt=con.createStatement();
            //int n=stmt.executeUpdate(sql);
            stmt.executeUpdate("insert into student values(111,'aaa','a@gml.com','7878334455')");
            stmt.executeUpdate("insert into student values(112,'bbb','b@gml.com','6767688995')");
            stmt.executeUpdate("insert into student values(113,'ccc','c@gml.com','8585864648')");
            stmt.executeUpdate("insert into student values(114,'ddd','d@gml.com','4422556668')");
            //step-5 (close the connection)
            con.close();
            
            
            
            System.out.println(" rows added");
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Cant Load Driver");
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
    }
}
