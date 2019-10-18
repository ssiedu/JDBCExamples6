
import java.sql.Connection;
import java.sql.Statement;


public class SalaryIncrement {
    public static void main(String[] args) throws Exception {
            Connection con=DataUtility.connect();
            String sql="update emp set sal=sal+1000 where eno=111";
            Statement stmt=con.createStatement();
            int n=stmt.executeUpdate(sql);
            con.close();
            System.out.println(n+" row modified");
    }
}
