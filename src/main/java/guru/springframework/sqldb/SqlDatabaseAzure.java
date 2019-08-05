package co.com.computec.sqldb;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class SqlDatabaseAzure {

	public static void main(String[] args) {

		// Connect to database
//		String hostName = "select-server.database.windows.net"; // update me
//		String dbName = "SELECT"; // update me
//		String user = "cperez"; // update me
//		String passd = "Computec2019*"; // update me
////		String url = String.format(
////				"jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
////						+ "hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
////				hostName, dbName, user, passd);
//		Connection connection = null;
//
//		try {
////			connection = DriverManager.getConnection(url);
////			String schema = connection.getSchema();
////			co.com.computec("Successful connection - Schema: " + schema);
//
//			co.com.computec("Query data example:");
//			co.com.computec("=========================================");
//
//			// Create and execute a SELECT SQL statement.
//			String selectSql = "select * from TABLAS_COMUNES_FELECV4.TRAZABILIDAD_INTERNA_DOCUMENTO\r\n"
//					+ "where NUM_DOCUMENTO IN ('1234','7747')";
//
//			try (Statement statement = connection.createStatement();
//					ResultSet resultSet = statement.executeQuery(selectSql)) {
//
//				// Print results from select statement
//				co.com.computec("Top 20 categories:");
//				while (resultSet.next()) {
//					co.com.computec(resultSet.getString(1) + " " + resultSet.getString(2));
//				}
//				connection.close();
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//		} finally {
//			try {
//				if (connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//			}
//
//		}
	}
}