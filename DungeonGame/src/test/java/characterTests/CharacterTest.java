package characterTests;

import Group1.DungeonGame.models.characters.Character;
import Group1.DungeonGame.models.weapons.Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    Weapon axe;
    Character character;

    @Before
    public void beforeEach(){
        axe = new Weapon("Barry",100);
        character = new Character("Kevin", 100, 10,1, axe);
    }

    @Test
    public void characterHasName(){
        assertEquals("Kevin", character.getName());
    }

    @Test
    public void characterHasHealth(){
        assertEquals(100, character.getMaxHealth());
    }
    @Test
    public void characterHasExp(){
        assertEquals(10, character.getExp());
    }
    @Test
    public void characterHasLevel(){
        assertEquals(1, character.getLevel());
    }
    @Test
    public void characterHasWeapon(){
        assertEquals("Barry", character.getWeapon().getName());
    }



}
