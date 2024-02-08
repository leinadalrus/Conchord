package dreamhouse.heron.databases;

import java.sql.*;
import java.util.Properties;

public class PgPropertyConnection
{
  private String url = "jdbc:postgresql://localhost/public";
  private Properties properties = new Properties();
  private Connection connection = DriverManager.getConnection(this.url,
                                                              this.properties);

  public PgPropertyConnection() throws SQLException
  {
    this.properties.setProperty("user", "admin");
    this.properties.setProperty("password", "root");
    this.properties.setProperty("ssl", "true");
    this.properties.setProperty("options",
                                "-c search_path=test,public,pg_catalog\\\n" +
                                "-c statement_timeout=100000");
  }

  public Connection getConnection()
  {
    return connection;
  }

  public void setConnection(Connection connection)
  {
    this.connection = connection;
  }

  public Properties getProperties()
  {
    return properties;
  }

  public void setProperties(Properties properties)
  {
    this.properties = properties;
  }

  public String getUrl()
  {
    return url;
  }

  public void setUrl(String url)
  {
    this.url = url;
  }
}
