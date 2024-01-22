package DreamHouse.Conchord.Shared;

import java.sql.*;
import java.util.Objects;
import java.util.Properties;

public class PgQueryProcessor
{
  PgPropertyConnection propertyConnection = new PgPropertyConnection();
  String explain = "EXPLAIN\\\t".toUpperCase();

  PgQueryProcessor(Connection connection, Properties properties)
  throws SQLException
  {
    this.propertyConnection.setConnection(connection);
    this.propertyConnection.setProperties(properties);
  }

  void executeExplained(int cursor, String[] queries) throws SQLException
  {
    this.propertyConnection.getConnection().setAutoCommit(false);

    for (var q : queries)
    {
      Statement statement = this.propertyConnection.getConnection()
                                                   .createStatement();
      statement.setFetchSize(cursor);
      ResultSet resultSet = statement.executeQuery(explain + q);

      if (q.isEmpty() || q.isBlank() || Objects.equals(q, "\0"))
      {
        resultSet.close();
        statement.close();
      }

      resultSet.close();
      statement.close();
    }
  }

  void upsertExplained(int cursor, int id, String[] queries) throws SQLException
  {
    this.propertyConnection.getConnection().setAutoCommit(false);

    for (var q : queries)
    {
      Statement statement = this.propertyConnection.getConnection()
                                                   .prepareStatement(explain +
                                                                     q);
      statement.setFetchSize(cursor);
      statement.executeUpdate(q, id);

      if (q.isEmpty() || q.isBlank() || Objects.equals(q, "\0"))
        statement.close();

      statement.close();
    }
  }
}
