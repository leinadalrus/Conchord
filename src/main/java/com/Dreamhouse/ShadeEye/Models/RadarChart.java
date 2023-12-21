package com.Dreamhouse.ShadeEye.Models;

import com.Dreamhouse.ShadeEye.Annals.LabelName;
import com.Dreamhouse.ShadeEye.Annals.VectorPosition;
import jakarta.persistence.Entity;

@Entity
public class RadarChart
{
  LabelName labelName;
  VectorPosition vectorPosition;

  public RadarChart() {}

  public RadarChart(LabelName _labelName, VectorPosition _vectorPosition)
  {
    this.labelName = _labelName;
    this.vectorPosition = _vectorPosition;
  }
}
