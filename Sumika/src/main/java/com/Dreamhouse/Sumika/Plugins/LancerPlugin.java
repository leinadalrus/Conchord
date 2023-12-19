package com.Dreamhouse.Sumika.Plugins;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.combat.CombatEngineAPI;
import com.fs.starfarer.api.combat.ShipAPI;
import com.fs.starfarer.combat.entities.Ship;
import com.fs.starfarer.ui.P;

import java.util.List;

public class LancerPlugin extends BaseModPlugin
{
  private void Execute()
  {
    this.Handle();
  }

  private void Handle()
  {
    Global.getCombatEngine();
  }

  public ShipAPI getShip(CombatEngineAPI combatEngineAPI, List<ShipAPI> ships, String name, String factionID)
  {
    combatEngineAPI.getShips(); // Predicate this List template...code: NOTE
    return ships.getFirst();
  }
}
