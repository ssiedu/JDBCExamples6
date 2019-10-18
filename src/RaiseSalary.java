
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RaiseSalary {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ECode : ");
        int code=sc.nextInt();
        System.out.println("Enter Increment Amount : ");
        int amount=sc.nextInt();
        Connection con = DataUtility.connect();
        String sql = "update emp set sal=sal+? where eno=?";
        //create a PreparedStatement  object
        PreparedStatement ps=con.prepareStatement(sql);
        //set the parameters for sql
        ps.setInt(1, amount);
        ps.setInt(2, code);
        //execute the sql
        int n=ps.executeUpdate();
        con.close();
        System.out.println(n + " row modified");
    }
}
