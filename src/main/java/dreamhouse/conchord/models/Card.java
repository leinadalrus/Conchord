package dreamhouse.conchord.models;

public class Card
{
  private String title;
  private String description;
  private String categories;

  private String coverImage;

  Card(String title, String description, String categories, String coverImage)
  {
    this.title = title;
    this.description = description;
    this.categories = categories;
    this.coverImage = coverImage;
  }

  public String getTitle()
  {
    return this.title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getDescription()
  {
    return this.description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getCategories()
  {
    return this.categories;
  }

  public void setCategories(String categories)
  {
    this.categories = categories;
  }


  public String getCoverImage()
  {
    return this.coverImage;
  }

  public void setCoverImage(String coverImage)
  {
    this.coverImage = coverImage;
  }
}
