package com.alnaghi.service.dao.interfaces;

import com.alnaghi.model.ShoppingCart;


public interface ShoppingCartManager {
    public void saveShoppingCart(ShoppingCart shoppingCart);

    public ShoppingCart findShoppingCartById(Integer id);
}
