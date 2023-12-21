package com.Dreamhouse.ShadeEye.Kernel;

import com.fs.starfarer.api.combat.ShipAPI;

public abstract class LancerSystem implements ShipAPI
{
  public LancerSystem(ShipAPI ship)
  {
  }

  public abstract void Execute();

  @Override
  public String getId()
  {
    return null;
  }

  @Override
  public String getName()
  {
    return null;
  }
}
