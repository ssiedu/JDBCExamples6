
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TotalSalaryTwo {
    public static void main(String[] args) throws Exception {
   
        Connection con=DataUtility.connect();
        Statement stmt=con.createStatement();
        String sql="SELECT pcode,SUM(sal) FROM emp GROUP BY pcode";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        
        con.close();
    }
}
