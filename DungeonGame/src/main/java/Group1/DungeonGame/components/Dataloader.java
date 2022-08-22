package Group1.DungeonGame.components;

import Group1.DungeonGame.models.weapons.Axe;
import Group1.DungeonGame.models.weapons.Katana;
import Group1.DungeonGame.models.weapons.Sword;
import Group1.DungeonGame.models.weapons.Weapon;
import Group1.DungeonGame.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {
    @Autowired
    WeaponRepository weaponRepository;

    public Dataloader() {}

    public void run(ApplicationArguments args) {
        Weapon longSword = new Sword("Long Sword", 25);
        weaponRepository.save(longSword);

        Weapon shortSword = new Sword("Short Sword", 18);
        weaponRepository.save(shortSword);

        Weapon battleAxe = new Axe("Battle Axe", 30);
        weaponRepository.save(battleAxe);

        Weapon handAxe = new Axe("Hand Axe", 14);
        weaponRepository.save(handAxe);

        Weapon wakizashi = new Katana("Wakizashi", 28);
        weaponRepository.save(wakizashi);

        Weapon kodachi = new Katana("Kodachi", 18);
        weaponRepository.save(kodachi);
    }
}
