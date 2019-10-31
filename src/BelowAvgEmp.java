
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BelowAvgEmp {
public static void main(String[] args) throws Exception {
   
        Connection con=DataUtility.connect();
        Statement stmt=con.createStatement();
        String sql="SELECT ENAME, SAL FROM EMP WHERE SAL<=(SELECT AVG(SAL) FROM EMP)";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            System.out.println(s1+","+s2);
        }
        con.close();
    }    
}
