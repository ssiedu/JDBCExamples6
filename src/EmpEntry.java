
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class EmpEntry {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ECode : ");
        int x=sc.nextInt();
        System.out.println("Enter EName : ");
        String y=sc.next();
        System.out.println("Enter ESal  : ");
        int z=sc.nextInt();
        
        String sql="insert into emp values(?,?,?)";
        
        Connection con=DataUtility.connect();
        
        PreparedStatement ps=con.prepareStatement(sql);
        
        //setting the values for parameter of sql
        ps.setInt(1, x);
        ps.setString(2, y);
        ps.setInt(3, z);
        
        int n=ps.executeUpdate();
        
        con.close();
        
        System.out.println(n+" row added");
        
        
    }

}
