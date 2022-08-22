package Group1.DungeonGame.models.encounters;

import Group1.DungeonGame.models.Enemy;

import javax.persistence.Id;

public class BattleEncounter extends Encounter{

  @Id
  private Long id;
  private Enemy enemy;
  private int turnCounter;


  public BattleEncounter(String name, Enemy enemy, int turnCounter) {
    super(name);
    this.enemy = enemy;
    this.turnCounter = turnCounter;
  }

  public BattleEncounter(String name) {
    super(name);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Enemy getEnemy() {
    return enemy;
  }

  public void setEnemy(Enemy enemy) {
    this.enemy = enemy;
  }

  public int getTurnCounter() {
    return turnCounter;
  }

  public void setTurnCounter(int turnCounter) {
    this.turnCounter = turnCounter;
  }
}
