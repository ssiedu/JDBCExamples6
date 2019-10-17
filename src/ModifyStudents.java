
import java.sql.*;



public class ModifyStudents {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
        String sql="update student set rno=rno+1000 where rno>=213";
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        System.out.println(n+ " row(s) modified");
        con.close();
        
    }
}
