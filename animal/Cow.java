
package animal;

public class Cow extends Animal {
    private int milkPerDay;

    public Cow(int milkPerDay) {
        super("Cow");
        this.milkPerDay = milkPerDay;
    }

    public String getDetails() {
        return "Type: " + type + ", Milk per Day: " + milkPerDay + " liters";
    }
}
