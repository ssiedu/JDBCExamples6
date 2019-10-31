
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class TotalSalaryOne {

    public static void main(String[] args) throws Exception {
        
        Connection con=DataUtility.connect();
        String sql="select pcode,sal from emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        int tot1=0,tot2=0,tot3=0;
        while(rs.next()){
            String code=rs.getString(1);
            int sal=rs.getInt(2);
            
            switch(code){
                case "p111":
                    tot1=tot1+sal;
                break;
                case "p112":
                    tot2=tot2+sal;
                break;
                case "p113":
                    tot3=tot3+sal;
                break;
            }
        }
        
        System.out.println("P111 : "+tot1);
        System.out.println("P112 : "+tot2);
        System.out.println("P113 : "+tot3);
        
        con.close();
    }
}
