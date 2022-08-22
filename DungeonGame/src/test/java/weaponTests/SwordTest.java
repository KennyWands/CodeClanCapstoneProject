package weaponTests;

import Group1.DungeonGame.models.weapons.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwordTest {

    Sword sword;

    @BeforeEach
    public void before() {
        sword = new Sword("Claw", 17);
    }

    @Test
    public void canGetSwordName() {
        assertEquals("Claw", sword.getName());
    }

    @Test
    public void canGetSwordDamage() {
        assertEquals(17, sword.getDamage());
    }
}
