import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeRepository {
    public void save() {
        String objectStr = MyUtils.serializeIntoAString(this);
        Connection connection = null;
        Statement stat = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3106//MyDB", "root", "password");
            stat = connection.createStatement();
            stat.execute("INSERT INTO EMPLOYEE VALUES (" + objectStr + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
