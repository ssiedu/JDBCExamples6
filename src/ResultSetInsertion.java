
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetInsertion {

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
        System.out.println("Do you want to add new row press 1 to yes ");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter Eno    : ");
            int eno = sc.nextInt();
            System.out.println("Enter Ename  : ");
            String ename = sc.next();
            System.out.println("Enter Salary : ");
            int sal = sc.nextInt();
            //now inserting a new row
            //adding a new row
            rs.moveToInsertRow();
            //updating the values of new row
            rs.updateInt(1, eno);
            rs.updateString(2, ename);
            rs.updateInt(3, sal);
            //storing the new row to DB
            rs.insertRow();
            System.out.println("One New Row Added ");
            System.out.println("UPDATED RESULTSET");
            rs.beforeFirst();
            while (rs.next()) {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                System.out.println(s1 + "," + s2 + "," + s3);
            }

        } else {
            System.out.println("You Opted Not To Add Row");
        }

        con.close();
    }
}
