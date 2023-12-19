package com.Dreamhouse.ShadeEye.Models;

import com.Dreamhouse.ShadeEye.Data.LabelName;
import com.Dreamhouse.ShadeEye.Data.VectorPosition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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
