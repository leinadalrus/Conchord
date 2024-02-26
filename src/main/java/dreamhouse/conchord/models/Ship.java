package dreamhouse.conchord.models;

import dreamhouse.conchord.catalog.ShipTypePrefixes;

import java.util.ArrayList;
import java.util.Map;

public class Ship
{
  ShipTypePrefixes shipTypePrefix;
  ArrayList<String> capabilities;
  String training;
  Map<String, Integer> speed;
  Map<String, Integer> endurance;
  Map<Integer, Integer> dimensions;
  String propulsion;
  ArrayList<String> navigation;
  String communications;
  String weapons;
  String accommodation;
  String lifeSavingEquipment;
  String shipsBoat;
  
  public Ship() {}
}
