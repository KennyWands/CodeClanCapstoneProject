package encounterTests;

import Group1.DungeonGame.models.Enemy;
import Group1.DungeonGame.models.encounters.BattleEncounter;
import Group1.DungeonGame.models.encounters.Encounter;
import Group1.DungeonGame.models.weapons.Axe;
import Group1.DungeonGame.models.weapons.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class battleEncounterTests {

  BattleEncounter testBattleEncounter;
  Enemy testEnemy;
  Weapon testAxe;

  @BeforeEach
  public void before(){
    testAxe = new Axe("Durin", 19);
    testEnemy = new Enemy("Orc", 100, 20, 1, testAxe);
    testBattleEncounter = new BattleEncounter("The First Battle", testEnemy, 1);
  }

  @Test
  public void getName(){
    assertEquals("The First Battle", testBattleEncounter.getName());
  }

  @Test
  public void getEnemy(){
    assertEquals(testEnemy, testBattleEncounter.getEnemy());
  }

  @Test
  public void getBattleCounter(){
    assertEquals(1, testBattleEncounter.getTurnCounter());
  }

}
