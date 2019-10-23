
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class ResultSetUpdate {
    public static void main(String[] args) throws Exception {

        Connection con=DataUtility.connect();
        String sql="SELECT * FROM EMP";
        //Statement stmt=con.createStatement();
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            System.out.println(s1+","+s2+","+s3);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rowno : ");
        int rowno=sc.nextInt();
        System.out.println("Enter New Salary : ");
        int sal=sc.nextInt();
        //updating using ResultSet
        //step-1 (moving the cursor to the row to be changed)
        rs.absolute(rowno);
        //step-2 (update the column in ResultSet)
        rs.updateInt(3, sal);
        //step-3 (save the changes to DB)
        rs.updateRow();
        System.out.println("ROW MODIFIED ");
        System.out.println("AFTER MODIFICATION RESULT SET ");
        rs.beforeFirst();
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            System.out.println(s1+","+s2+","+s3);
        }
        
        
        
        
        con.close();
    }
}
