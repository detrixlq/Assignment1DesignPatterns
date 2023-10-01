public class Main {
    public static void main(String[] args) {
        System.out.println("The Battle Begins!");
        System.out.println("...");

        Character knight = new Knight(new SwordWeapon(), new HeavyArmor(), new SwordplaySkill());
        knight.displayCharacter();
        knight.performAttack();
        knight.performDefence();
        knight.performSkill();
        System.out.println("...");

        Character archer = new Archer(new BowWeapon(), new LightArmor(), new PierceSkill());
        archer.displayCharacter();
        archer.performAttack();
        archer.performDefence();
        archer.performSkill();
        System.out.println("...");

        Character berserk = new Berserk(new AxeWeapon(), new HeavyArmor(), new CullingSkill());
        berserk.displayCharacter();
        berserk.performAttack();
        berserk.performDefence();
        berserk.performSkill();
        System.out.println("...");

        Character wizard = new Wizard(new StaffWeapon(), new NoArmor(), new FireSkill());
        wizard.displayCharacter();
        wizard.performAttack();
        wizard.performDefence();
        wizard.performSkill();
        System.out.println("...");
    }
}