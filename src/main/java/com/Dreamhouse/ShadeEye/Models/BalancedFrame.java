package com.Dreamhouse.ShadeEye.Models;

import com.Dreamhouse.ShadeEye.Kernel.LancerConcord;
import com.Dreamhouse.ShadeEye.Kernel.LancerSystem;
import com.fs.starfarer.api.combat.ShipAPI;

public class BalancedFrame extends LancerConcord
{
  public final LancerSystem lancerSystem;
  public BalancedFrame(LancerSystem _lancerSystem)
  {
    super(_lancerSystem);
    this.lancerSystem = _lancerSystem;
  }
}
