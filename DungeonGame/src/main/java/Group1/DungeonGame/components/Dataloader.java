package Group1.DungeonGame.components;

import Group1.DungeonGame.models.Enemy;
import Group1.DungeonGame.models.weapons.Axe;
import Group1.DungeonGame.models.weapons.Katana;
import Group1.DungeonGame.models.weapons.Sword;
import Group1.DungeonGame.models.weapons.Weapon;
import Group1.DungeonGame.repositories.EnemyRepository;
import Group1.DungeonGame.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {
    @Autowired
    WeaponRepository weaponRepository;

    EnemyRepository enemyRepository;

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

        Enemy Ogre = new Enemy("Og the Ogre", 100, 50, 1, shortSword);
        enemyRepository.save(Ogre);

        Enemy Troll = new Enemy("Tom the Troll", 100, 50, 1, shortSword);
        enemyRepository.save(Troll);

        Enemy Bat = new Enemy("Bob the Bat", 100, 50, 1, shortSword);
        enemyRepository.save(Bat);

        Enemy Slug = new Enemy("Sam the Slug", 100, 50, 1, shortSword);
        enemyRepository.save(Slug);
    }
}
