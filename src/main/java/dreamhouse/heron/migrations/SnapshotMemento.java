package dreamhouse.heron.migrations;

public interface SnapshotMemento
{
  // NOTE(David): No need for a constructor
  String getFilename();
  String getSnapshotCreationDate();
  String getSnapshotAccessDate();
  String getSnapshotModifyDate();
  Integer getSnapshotUuid();
}
// Based this on RPC of file internal properties/parameters

