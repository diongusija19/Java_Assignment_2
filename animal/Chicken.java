
package animal;

public class Chicken extends Animal {
    private String eggColor;

    public Chicken(String eggColor) {
        super("Chicken");
        this.eggColor = eggColor;
    }


    public String getDetails() {
        return "Type: " + type + ", Egg Color: " + eggColor;
    }
}
