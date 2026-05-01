package factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("chicago style cheese pizza");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("chicago style veggie pizza");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("chicago style clam pizza");
        }else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}