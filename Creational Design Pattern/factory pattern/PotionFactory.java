public class PotionFactory {
    public Potion createPotion(String type) {
        switch (type) {
            case "healing":
                return new HealingPotion();
            case "invisibility":
                return new InvisibilityPotion();
            case "strength":
                return new StrengthPotion();
            default:
                throw new IllegalArgumentException("Unknown potion type: " + type);
        }
    }
}
