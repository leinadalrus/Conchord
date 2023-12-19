package com.Dreamhouse.ShadeEye.Kernel;

import com.fs.starfarer.combat.entities.Ship;

public abstract class LancerSystem
{
  Ship ship;

  public LancerSystem()
  {
  }

  public LancerSystem(Ship _ship)
  {
    this.ship = _ship;
  }

  public abstract void Execute();
}
