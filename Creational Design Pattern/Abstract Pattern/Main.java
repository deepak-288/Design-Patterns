public class Main {
    public static void Main(String[] args) {
        PotionFactory elixirFactory = new ElixirPotionFactory();
        HealingPotion elixirHealingPotion = elixirFactory.createHealingPotion();
        InvisibilityPotion elixirInvisibilityPotion = elixirFactory.createInvisibilityPotion();
        elixirHealingPotion.drink();
        elixirInvisibilityPotion.drink();

        PotionFactory potionFactory = new PotionPotionFactory();
        HealingPotion potionHealingPotion = potionFactory.createHealingPotion();
        InvisibilityPotion potionInvisibilityPotion = potionFactory.createInvisibilityPotion();
        potionHealingPotion.drink();
        potionInvisibilityPotion.drink();
    }
}
