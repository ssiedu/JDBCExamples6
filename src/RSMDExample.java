
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;


public class RSMDExample {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter Table Name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        //to display all the rows and cols with col headers
        String sql="SELECT * FROM "+name;
        Connection con=DataUtility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        //creating ResultSetMetaData to fetch data about ResultSet
        ResultSetMetaData rsmd=rs.getMetaData();
        
        int n=rsmd.getColumnCount();
        System.out.println("________________________________________");
        for(int i=1; i<=n; i++){
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println();
        System.out.println("________________________________________");
        while(rs.next()){
            for(int i=1; i<=n; i++){
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }
        
        System.out.println("________________________________________");
        con.close();
    }
}
