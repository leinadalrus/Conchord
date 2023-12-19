package com.Dreamhouse.Sumika.Models;

import com.Dreamhouse.Sumika.Data.Label;
import com.Dreamhouse.Sumika.Data.Position;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Entity
class RadarChart
{
  private @Id
  @GeneratedValue int id;
  private String author = "/author/";
  private String dateCreated = "2023-10-12";

  public RadarChart()
  {
  }

  int GetID()
  {
    return this.id;
  }

  public String GetAuthor()
  {
    return this.author;
  }

  public void SetAuthor(String _author)
  {
    this.author = _author;
  }

  public String GetDateCreated()
  {
    return this.dateCreated;
  }

  public void SetDateCreated(String _dateCreated)
  {
    this.dateCreated = _dateCreated;
  }
}

public class RadarService
{
  Label label;
  Position position;
  RadarChart radarChart;

  public boolean FavoursAGrade(Label _label)
  {
    return Objects.equals(Label.labelName, "/label/");
  }

  public List<Label> FilterLabels(List<Label> _labels, Predicate<Label> _p)
  {
    List<Label> resultsInto = new ArrayList<>();

    for (Label l : _labels)
    {
      if (_p.test(l))
      {
        resultsInto.add(l);
      }
    }

    return resultsInto;
  }
}

class AnnulServiceRadar
{
  RadarService radarService;

  void destroyService()
  {
    // NOTE(Null Service): this needs memory-free-ing-
    // -and pointer deletion.
    this.radarService = null;
  }
}