
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.





public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon("Sword", "Dragon Slayer");
        Boss boss = new Boss(1000, 50);
        boss.setWeapon(bossWeapon);

        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getWeaponType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getName());
    }
}