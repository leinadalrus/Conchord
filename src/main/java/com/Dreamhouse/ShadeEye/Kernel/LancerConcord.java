package com.Dreamhouse.ShadeEye.Kernel;

import com.Dreamhouse.ShadeEye.Data.PilotData;
import com.fs.starfarer.api.combat.ShipAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LancerConcord extends LancerSystem
{
  String faction;
  String company;
  Long uuid;

  PilotData createPilot(PilotData pilotData, String faction, String company, Long uuid)
  {
    this.faction = faction;
    this.company = company;
    this.uuid = uuid;

    return pilotData;
  }

  public List<ShipAPI> Lances(ShipAPI wing, PilotData pilot)
  {
    List<ShipAPI> wings = new ArrayList<>();

    List<PilotData> pilots = new ArrayList<>();

    Map<ShipAPI, PilotData> lance = new java.util.HashMap<>(Map.ofEntries(Map.entry(wing, pilot)));

    for (var entry : lance.entrySet())
    {
      pilots.add(this.createPilot(new PilotData(), "Horus", "Iron Lotus", 11033L));
      lance.put(wings.getFirst(), pilots.getFirst());
    }

    return wings;
  }

  @Override
  public void Execute()
  {
  }
}

