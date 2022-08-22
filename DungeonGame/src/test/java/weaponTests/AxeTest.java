package weaponTests;

import Group1.DungeonGame.models.weapons.Axe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AxeTest {

    Axe axe;

    @BeforeEach
    public void before() {
        axe = new Axe("Durin", 19);
    }

    @Test
    public void canGetAxeName() {
        assertEquals("Durin", axe.getName());
    }

    @Test
    public void canGetAxeDamage() {
        assertEquals(19, axe.getDamage());
    }
}
