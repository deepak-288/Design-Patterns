public class Main {
    public static void main(String[] args) {
        PotionFactory factory = new PotionFactory();

        Potion healingPotion = factory.createPotion("healing");
        healingPotion.drink();

        Potion invisibilityPotion = factory.createPotion("invisibility");
        invisibilityPotion.drink();

        Potion strengthPotion = factory.createPotion("strength");
        strengthPotion.drink();
    }
}
