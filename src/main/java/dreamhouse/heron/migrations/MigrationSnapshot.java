package DreamHouse.Heron.Migrations;

public class MigrationSnapshot
{
  int uuid;
  String filename;
  String creationDate;
  String accessDate;
  String modifyDate;

  ClonedSnapshot createSnapshot()
  {
    return new ClonedSnapshot();
  }

  int restoreWith(ClonedSnapshot clonedSnapshot)
  {
    return 1;
  }
}
