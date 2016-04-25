

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySqlReadData {

	Connection connect = null;

	// Database URL.
	// "test" Is database name. You can change It as per your database name.
	String sqldb_url = "jdbc:mysql://localhost:3306/test";

	// Use your database usename here.
	String sqldb_uname = "root";

	// Use your database password here.
	String sqldb_pass = "root";

	@BeforeTest
	public void setUp() throws Exception {
		try {
			String dbClass = "com.mysql.jdbc.Driver";
			Class.forName(dbClass).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void printTableData() {
		try {
			// To Create database connection.
			connect = DriverManager.getConnection(sqldb_url, sqldb_uname, sqldb_pass);

			// preparing query with where clause using PreparedStatement.
			PreparedStatement pstmt = connect.prepareStatement("select * from user where name = ? and age = ?");
			// 1st value after where clause
			pstmt.setString(1, "loki");
			// 2nd value after where clause
			pstmt.setString(2, "25");

			// Print results.
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				System.out.println(String.format("%s - %s - %s - %s ",
						res.getString(1), res.getString(2), res.getString(3),
						res.getString(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() throws Exception {
		// Close database connection.
		if (connect != null) {
			connect.close();
		}
	}
}