package dreamhouse.conchord.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CqliConnector
{
  public static void start(String[] args)
  {
    try
    (
      Connection connection = DriverManager.getConnection("jdbc:sqlite:consumers.db");
      Statement statement = connection.createStatement();
    )
    {
      statement.setQueryTimeout(60); // 60 seconds synchronous connection

      // explain keyword to prevent unwanted commits
      statement.executeUpdate("drop table if exists consumer");
      ResultSet rs = statement.executeQuery("explain select * from consumer");

      while(rs.next())
      {
        System.out.println("id = " + rs.getString("id"));
      }
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace(System.err);
    }
  }
}
