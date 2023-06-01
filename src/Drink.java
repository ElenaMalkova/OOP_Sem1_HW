public class Drink {
    private String drinkName;
    private double drinkPrice;
    private double drinkVol;
    private double drinkTemp;

    public Drink(String drinkName,  double drinkVol, double drinkTemp, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkVol = drinkVol;
        this.drinkTemp = drinkTemp;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public double getDrinkVol() {
        return drinkVol;
    }

    public double getDrinkTemp() {
        return drinkTemp;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f мл), %.0fC\tЦена: %.2f руб.", drinkName, drinkVol, drinkTemp, drinkPrice);
    }
}

