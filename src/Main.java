public class Main {


    public static void main(String[] args) {
        Machine menu = new Machine();
        menu.addDrink(new Drink("Эспрессо", 50, 95, 50))
                .addDrink(new Drink("Американо", 150, 95, 70))
                .addDrink(new Drink("Раф", 200, 90, 100))
                .addDrink(new Drink("Латте", 150, 80, 100))
                .addDrink(new Drink("Айриш", 200, 90, 150));

        System.out.println(menu);
        Drink sellDrink = menu.sellDrink("Раф");
        System.out.printf("Продан — %s", sellDrink);
        System.out.printf("\n\nОсталось:\n%s",menu);
    }
}