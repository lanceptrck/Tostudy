package com.alnaghi.model;

import static com.alnaghi.model.Product.EARPHONES;
import static com.alnaghi.model.Product.GAMING_MOUSE;
import static com.alnaghi.model.Product.KEYBOARD;
import static com.alnaghi.model.Product.LAPTOP;
import static com.alnaghi.model.Product.NOTEBOOK;
import static com.alnaghi.model.Product.PHONE;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void add_and_setQuantity_differentProducts_shouldReturnCorrectQuantity() {
        ShoppingCart cart1 = new ShoppingCart(1);
        cart1.add(GAMING_MOUSE);
        cart1.add(EARPHONES);
        cart1.add(GAMING_MOUSE);
        cart1.setQuantity(NOTEBOOK, 4);
        cart1.setQuantity(NOTEBOOK, 1);
        cart1.add(EARPHONES, 3);

        assertEquals(1, cart1.getQuantity(NOTEBOOK));
        assertEquals(2, cart1.getQuantity(GAMING_MOUSE));
        assertEquals(4, cart1.getQuantity(EARPHONES));
        assertEquals(0, cart1.getQuantity(LAPTOP));
    }

    @Test
    public void add_and_setQuantity_differentProducts_shouldReturnCorrectQuantity2() {
        ShoppingCart cart2 = new ShoppingCart(2);
        cart2.add(EARPHONES, 2);
        cart2.add(PHONE, 5);
        cart2.add(NOTEBOOK);
        cart2.add(KEYBOARD);

        assertEquals(2, cart2.getQuantity(EARPHONES));
        assertEquals(1, cart2.getQuantity(NOTEBOOK));
        assertEquals(5, cart2.getQuantity(EARPHONES));
        assertEquals(1, cart2.getQuantity(KEYBOARD));
    }
}
