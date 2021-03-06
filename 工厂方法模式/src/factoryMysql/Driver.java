package factoryMysql;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
public interface Driver {
	Connection connect(String url,java.util.Properties info) throws SQLException;
	boolean acceptsURL(String url) throws SQLException;
	DriverPropertyInfo[] getPropertyInfo(String url,java.util.Properties info) throws SQLException;
	int getMajorVersion();
	int getMinorVersion();
	boolean jdbcCompliant();
}
