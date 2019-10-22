
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckData {
public static void main(String[] args) throws Exception {
        Connection con=DataUtility.connect();
        Statement stmt=con.createStatement();
        
        String sql="SELECT * from emp order by eno desc";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println("________________________");
        }
        
        /*
        String sql="SELECT eno,ename,sal as pay, sal*12 as yearlysal FROM EMP";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("eno"));
            System.out.println(rs.getString("ename"));
            System.out.println(rs.getString("sal"));
            System.out.println(rs.getString("yearlysal"));
            System.out.println("________________________");
        }
        */
        
        con.close();
    }    
}

