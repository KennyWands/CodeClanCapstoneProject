package Group1.DungeonGame.models.encounters;

public abstract class Encounter {

  private String name;

  public Encounter(String name) {
    this.name = name;
  }

  public Encounter() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
