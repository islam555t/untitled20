public class Weapon {
    private String weaponType;
    private String name;

    public Weapon(String weaponType, String name) {
        this.weaponType = weaponType;
        this.name = name;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getName() {
        return name;
    }
}
