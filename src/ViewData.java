
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ViewData {

    public static void main(String[] args) throws Exception {
        Connection con=DataUtility.connect();
        Statement stmt=con.createStatement();
        String sql="SELECT * FROM EMP";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        rs.beforeFirst();
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        rs.beforeFirst();
        while(rs.next()){
            System.out.println(rs.getString(3));
        }
        rs.absolute(3);
        System.out.println(rs.getString(1)+","+rs.getString(2));
        rs.previous();
        System.out.println(rs.getString(1)+","+rs.getString(2));
        rs.last();
        System.out.println(rs.getString(1)+","+rs.getString(2));
        rs.first();
        System.out.println(rs.getString(1)+","+rs.getString(2));
        con.close();
    }
}
