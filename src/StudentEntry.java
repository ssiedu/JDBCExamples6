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
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Cant Load Driver");
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
    }
}
