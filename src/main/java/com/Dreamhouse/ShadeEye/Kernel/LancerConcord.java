package com.Dreamhouse.ShadeEye.Kernel;

import com.Dreamhouse.ShadeEye.Annals.PilotData;
import com.fs.starfarer.api.combat.ShipAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LancerConcord
{
  public final LancerSystem lancerSystem;

  public String faction;
  String company;
  Long uuid;

  public LancerConcord(LancerSystem _lancerSystem)
  {
    this.lancerSystem = _lancerSystem;
  }

  public LancerConcord(
    PilotData pilotData, LancerSystem lancerSystem, String faction, String company, Long uuid
  )
  {
    this.lancerSystem = lancerSystem;
    this.faction = faction;
    this.company = company;
    this.uuid = uuid;
  }

  PilotData setPilotData(
    PilotData pilotData
  )
  {
    return pilotData;
  }

  public List<ShipAPI> Lances(ShipAPI wing, PilotData pilot)
  {
    List<ShipAPI> wings = new ArrayList<>();

    List<PilotData> pilots = new ArrayList<>();

    Map<ShipAPI, PilotData> lance = new HashMap<>(Map.ofEntries(Map.entry(wing,
                                                                          pilot
    )));

    for (var entry : lance.entrySet())
    {
      pilots.add(this.setPilotData(new PilotData("Interpellates",
                                                "Elite",
                                                "Perambulator",
                                                "Dissimilar",
                                                0L
      )));
      lance.put(wings.getFirst(), pilots.getFirst());
    }

    return wings;
  }
}

