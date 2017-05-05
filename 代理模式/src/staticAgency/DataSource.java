package staticAgency;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
public class DataSource {
	private static LinkedList<Connection> connectionList=new LinkedList<Connection>();
	static{
		try{
			Class.forName("com.microsoft.sqlserver.jdbc");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	private DataSource(){
		if(connectionList==null || connectionList.size()==0){
			for(int i=0;i<1;i++){
				try{
					connectionList.add(createNewConnection());
				}
				catch(SQLException e){
					e.printStackTrace();
			}
		}
		}
	}
	public Connection getConnection() throws Exception{
		if(connectionList.size()>0){
			return new ConnectionProxy(connectionList.remove());
		}
		return null;
	}
	public void recoverConnection(Connection connection){
		connectionList.add(connection);
	}
	public static DataSource getInstance(){
		return DataSourceInstance.dataSource;
	}
	private static class DataSourceInstance{
		private static DataSource dataSource=new DataSource();
	}
}
