package weaponTests;

import Group1.DungeonGame.models.weapons.Katana;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatanaTest {

    Katana katana;

    @BeforeEach
    public void before() {
        katana = new Katana("Wakizashi", 17);
    }

    @Test
    public void canGetKatanaName() {
        assertEquals("Wakizashi", katana.getName());
    }

    @Test
    public void canGetKatanaDamage() {
        
    }
}
