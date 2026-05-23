package template.barista;

public class BeverageTestDrive{
    public static void main(String[] args){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n Making tea ...");
        tea.prepareRecipe();

        System.out.println("\n Making coffee...");
        coffee.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n Making tea...");
        teaHook.prepareRecipe();

        System.out.println("\n Making coffee...");
        coffeeHook.prepareRecipe();
    }

}