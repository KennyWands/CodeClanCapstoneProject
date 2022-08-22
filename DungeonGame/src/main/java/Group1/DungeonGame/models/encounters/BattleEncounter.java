package Group1.DungeonGame.models.encounters;

import Group1.DungeonGame.models.enemies.Enemy;

import javax.persistence.*;

@Entity
@Table(name = "battle-encounters")
public class BattleEncounter {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "enemy")
  private Enemy enemy;

  @Column(name = "turn-counter")
  private int turnCounter;

  public BattleEncounter(String name, Enemy enemy, int turnCounter) {
    this.name = name;
    this.enemy = enemy;
    this.turnCounter = turnCounter;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
