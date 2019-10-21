
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ShowData {
    public static void main(String[] args) throws Exception {
        Connection con=DataUtility.connect();
        //SELECT for fetching emp earning more than or equals 250000
        String sql="SELECT * FROM emp WHERE sal>=25000";
        //Send the SELECT to DB 
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        //now we are reading data from ResultSet
        
        //step-1 (move the cursor to desired row)
        
        
        
        rs.next();  // beforeFirst to First
        
        
        
        //step-2 (read the column using getter methods)
        String s1=rs.getString(1);//1st col of currentrow
        String s2=rs.getString(2); //2nd col of currentrow
        String s3=rs.getString(3); //3rd col of currentrow
        System.out.println(s1); 
        System.out.println(s2);
        System.out.println(s3);
       
        rs.next(); //moving cursor from 1st to 2nd row
        s1=rs.getString(1); // 1st col of current row (2nd)
        s2=rs.getString(2);
        s3=rs.getString(3);
        System.out.println(s1); 
        System.out.println(s2);
        System.out.println(s3);
        
        
        
        con.close();
    }
}
