
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetDeletion {
public static void main(String[] args) throws Exception {

        Connection con = DataUtility.connect();
        String sql = "SELECT * FROM EMP";
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String s1 = rs.getString(1);
            String s2 = rs.getString(2);
            String s3 = rs.getString(3);
            System.out.println(s1 + "," + s2 + "," + s3);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to delete a row 1 to yes ");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter Row No To Be Deleted : ");
            int rowno = sc.nextInt();
            //now deleting a row using ResultSet
            //step-1 (move the cursor to the row to be deleted)
            rs.absolute(rowno);
            //step-2 (call the deleteRow method)
            rs.deleteRow();
            System.out.println("One Row Removed");
            System.out.println("UPDATED RESULTSET");
            rs.beforeFirst();
            while (rs.next()) {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                System.out.println(s1 + "," + s2 + "," + s3);
            }

        } else {
            System.out.println("You Opted Not To Remove");
        }

        con.close();
    }    
}
