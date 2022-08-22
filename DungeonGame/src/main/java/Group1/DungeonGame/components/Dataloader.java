package Group1.DungeonGame.components;

import Group1.DungeonGame.models.characters.Character;
import Group1.DungeonGame.models.weapons.Axe;
import Group1.DungeonGame.models.weapons.Katana;
import Group1.DungeonGame.models.weapons.Sword;
import Group1.DungeonGame.models.weapons.Weapon;
import Group1.DungeonGame.repositories.CharacterRepository;
import Group1.DungeonGame.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {
    @Autowired
    WeaponRepository weaponRepository;

    @Autowired
    CharacterRepository characterRepository;

    public Dataloader() {}

    public void run(ApplicationArguments args) {

        Weapon longSword = new Weapon("Long Sword", 25);
        weaponRepository.save(longSword);

        Weapon shortSword = new Weapon("Short Sword", 18);
        weaponRepository.save(shortSword);

        Weapon battleAxe = new Weapon("Battle Axe", 30);
        weaponRepository.save(battleAxe);

        Weapon handAxe = new Weapon("Hand Axe", 14);
        weaponRepository.save(handAxe);

        Weapon wakizashi = new Weapon("Wakizashi", 28);
        weaponRepository.save(wakizashi);

        Weapon kodachi = new Weapon("Kodachi", 18);
        weaponRepository.save(kodachi);

        Character gimli = new Character("Gimli", 130, 0, 1, battleAxe);
        characterRepository.save(gimli);
    }
}
