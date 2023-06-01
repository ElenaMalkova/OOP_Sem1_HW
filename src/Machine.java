import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List<Drink> assortment = new ArrayList<>();
    private double cash = 0;

    public Machine addDrink(Drink drinkItem) {
        assortment.add(drinkItem);
        return this;
    }

    public Drink findDrink (String name) {
        for (Drink drink : assortment) {
            if (name.equals(drink.getDrinkName())){
                return drink;
            }

        }
        return null;
    }

    public Drink sellDrink(String drinkName){
        Drink found = findDrink(drinkName);
        if (found != null) {
            cash = cash + found.getDrinkPrice();
            assortment.remove(found);
        }
        return found;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Сумма в автомате: ").append(cash).append("\n");
        for (Drink drink:assortment) {
            sb.append(drink).append("\n");
        }
        return sb.toString();
    }
}
