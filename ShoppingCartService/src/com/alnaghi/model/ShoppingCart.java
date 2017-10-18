package com.alnaghi.model;

import java.util.Collection;


public class ShoppingCart {

    public ShoppingCart() {
    }

    public ShoppingCart(int id) {
        // TODO Implement this method
    }

    public int getCartId() {
        // TODO Implement this method.
        return Integer.MIN_VALUE;
    }

    /**
     * Retrieve products that are present in the shopping cart
     * @return products with qty > 0
     */
    public Collection<Product> getProducts() {
        // TODO Implement this method.
        return null;
    }


    /**
     * Adds product to cart
     * @param product if product not yet in cart then quantity is 1 otherwise add 1 to the previous quantity
     */
    public void add(Product product) {
        // TODO Implement this method.
    }


    /**
     * Adds product to cart
     * @param product if product not yet in cart then quantity is based on given quantity otherwise add given
     *        qty to the previous quantity
     * @param qty
     * @throws IllegalArgumentException if quantity is negative
     */
    public void add(Product product, int qty) {
        // TODO Implement this method.





    }

    /**
     * Computes quantity of product stored in the cart
     * @param product the product to be searched for
     * @return the quantity of the product present in shopping cart. If absent return 0
     */
    public int getQuantity(Product product) {
        // TODO Implement this method.
        return Integer.MIN_VALUE;
    }


    /**
     * Removes product from shopping cart
     * @param product to be removed
     */
    public void delete(Product product) {
        // TODO Implement this method.
    }

    /**
     * Sets how many items of a certain product are in a shopping cart
     * @param product if product is in cart, override previous quantity.
     * @param qty if 0 delete product from cart, if product is not in cart then add the product with the quantity.
     * @throws IllegalArgumentException if quantity is negative
     */
    public void setQuantity(Product product, int qty) {
        // TODO Implement this method.








    }
}
