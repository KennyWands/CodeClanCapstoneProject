package Group1.DungeonGame.models.weapons;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "katanas")
public class Katana extends Weapon{
    public Katana(String name, int damage) {
        super(name, damage);
    }
}
