package com.Dreamhouse.Sumika.Generators;

import com.Dreamhouse.Sumika.Kernel.LancerConcord;
import com.Dreamhouse.Sumika.Data.PilotData;
import com.fs.starfarer.api.combat.CombatEngineAPI;
import com.fs.starfarer.api.combat.ShipAPI;


public class LancerGenerator
{
  public void Generate(CombatEngineAPI combatEngineAPI, ShipAPI shipAPI, LancerConcord concord, PilotData pilot)
  {
    shipAPI.getWingLeader();
    shipAPI.getShipTarget();

    for (ShipAPI variant : concord.Lances(shipAPI.getWingLeader(), pilot))
    {
      combatEngineAPI.getShips();
      combatEngineAPI.getPlayerShip();
      combatEngineAPI.getShipPlayerLastTransferredCommandTo(); // have this checked with a Sentinel: NOTE
      combatEngineAPI.getShipPlayerIsTransferringCommandTo();
      combatEngineAPI.getShipPlayerIsTransferringCommandFrom();
      combatEngineAPI.endCombat(1.0f);
    }
  }
}
