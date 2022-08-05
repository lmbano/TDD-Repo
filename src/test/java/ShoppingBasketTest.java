

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void totalEmptyBaskets(){

        ShoppingBasket basket = buildBasketWithItems();
        assertEquals(0.0 , basket.getTotal(), 0.0);
    }

    @Test
    public void totalOfSingleItem(){

        ShoppingBasket basket = buildBasketWithItems(new Item(100.00, 1));
        assertEquals(100.00,basket.getTotal(),0.0);
    }
    @Test
    public void totalOfTwoItems(){
        ShoppingBasket basket = buildBasketWithItems(new Item(100.0,1), new Item(200.0,1));
        assertEquals(300.0 ,basket.getTotal(),0.0);
    }
    @Test
    public void totalOfItemWithQuantityTwo(){

        ShoppingBasket basket= buildBasketWithItems(new Item(100.00, 2));
        assertEquals(200,basket.getTotal(),0.0);

       }

    private ShoppingBasket buildBasketWithItems(Item... items) {
        return new ShoppingBasket(Arrays.asList(items));
    }
}
