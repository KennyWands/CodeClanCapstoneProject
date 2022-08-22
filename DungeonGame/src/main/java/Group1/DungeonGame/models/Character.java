package Group1.DungeonGame.models;

import Group1.DungeonGame.models.weapons.Weapon;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name ="characters")
public class Character {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column (name ="name")
    private String name;

   @Column(name ="maxHealth")
    private int maxHealth;

   @Column(name ="exp")
   private int exp;

   @Column(name ="level")
    private int level;

//   @Column(name ="weapon")
   @JoinColumn(name ="weapon_id", nullable = false)
//   @JsonIgnoreProperties("weapon")
    private Weapon weapon;



    public Character(String name, int maxHealth, int exp, int level, Weapon weapon) {

        this.name = name;
        this.maxHealth = maxHealth;
        this.exp = exp;
        this.level = level;
        this.weapon = weapon;
    }
    public Character() {
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

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
