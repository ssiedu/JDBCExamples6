
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayData {
    public static void main(String[] args) throws Exception {
        Connection con=DataUtility.connect();
        String sql="SELECT * FROM emp WHERE sal>=25000";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
//            String s3=rs.getString(3);
            int s3=rs.getInt(3);
            int bonus=s3*10/100;
            
            //String s1=rs.getString("eno");
            //String s2=rs.getString("ename");
            //String s3=rs.getString("sal");
            System.out.println(s1+","+s2+","+s3+","+bonus);
            
        }
        
        
        
        con.close();
    }
}
