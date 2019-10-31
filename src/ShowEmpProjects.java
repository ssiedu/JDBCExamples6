
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ShowEmpProjects {
    public static void main(String[] args) throws Exception {
        String sql="SELECT ename,ptitle FROM emp,projects where emp.pcode=projects.pcode";
        Connection con=DataUtility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            System.out.println(s1+","+s2);
            
        }
        con.close();
    }
}
