
import java.sql.Connection;
import java.sql.DatabaseMetaData;


public class DBMDExample {

    public static void main(String[] args) throws Exception {
        
        Connection con=DataUtility.connect();
        
        DatabaseMetaData dbmd=con.getMetaData();
        
        String s1=dbmd.getDatabaseProductName();
        String s2=dbmd.getDatabaseProductVersion();
        String s3=dbmd.getDriverName();
        String s4=dbmd.getDriverVersion();
        
        
        System.out.println("Product Name    : "+s1);
        System.out.println("Product Version : "+s2);
        System.out.println("Driver  Name    : "+s3);
        System.out.println("Driver Version  : "+s4);
        
        
        con.close();

    }
}
