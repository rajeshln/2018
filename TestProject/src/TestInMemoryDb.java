import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestInMemoryDb {

	
	public static void main(String [] args ) {
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		String connectionUrl = "jdbc:derby:memory:myInMemDB;create=true";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		
		
		
		try {
			Connection conn = DriverManager.getConnection(connectionUrl);
			
			System.out.println("  "+conn.toString());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
