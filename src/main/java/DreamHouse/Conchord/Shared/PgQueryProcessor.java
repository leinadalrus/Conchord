package DreamHouse.Conchord.Shared;

import java.sql.*;
import java.util.Properties;

public class PgQueryProcessor
{
  PgPropertyConnection propertyConnection = new PgPropertyConnection();

  PgQueryProcessor(Connection connection, Properties properties)
  throws SQLException
  {
    this.propertyConnection.setConnection(connection);
    this.propertyConnection.setProperties(properties);
  }

  String query(int id, String[] arguments) throws SQLException
  {
    Statement statement = this.propertyConnection.getConnection()
                                                 .createStatement();

    for (var code : arguments)
    {
      ResultSet resultSet = statement.executeQuery(code);
      System.out.println(resultSet.getString(arguments[id]));
      return resultSet.getString(code);
    }

    return "";
  }
}
