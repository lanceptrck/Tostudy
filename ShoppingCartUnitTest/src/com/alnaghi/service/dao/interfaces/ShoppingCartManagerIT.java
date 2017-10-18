package com.alnaghi.service.dao.interfaces;

import static com.alnaghi.model.Product.EARPHONES;
import static com.alnaghi.model.Product.GAMING_MOUSE;
import static com.alnaghi.model.Product.KEYBOARD;
import static com.alnaghi.model.Product.LAPTOP;
import static com.alnaghi.model.Product.NOTEBOOK;
import com.alnaghi.model.ShoppingCart;

import java.io.File;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.FileAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class ShoppingCartManagerIT {
    @EJB
    private ShoppingCartManager shoppingCartManager;


    @Before
    public void setUp() throws Exception {
        System.out.println("ATEST" + getPersistenceXML().length());

    }

    public static File getPersistenceXML() {
        ClassLoader classLoader = ShoppingCartManagerIT.class.getClassLoader();
        File file = new File(classLoader.getResource("META-INF/test.persistence.xml").getFile());
        return file;
    }

    @Deployment
    public static Archive<?> createTestArchive() {
        System.out.println("ATEST" + getPersistenceXML());
        return ShrinkWrap.create(WebArchive.class, "ShoppingCart.war").addPackages(true,
                                                                                   "com.alnaghi.nis").addAsResource(new FileAsset(getPersistenceXML()),
                                                                                                                    "META-INF/persistence.xml");
    }

    @Test
    public void findShoppingCartById_WithId1_shouldReturnCart1() {
        ShoppingCart cart1 = shoppingCartManager.findShoppingCartById(2);
        assertEquals(1, cart1.getCartId());
        assertEquals(1, cart1.getQuantity(NOTEBOOK));
        assertEquals(2, cart1.getQuantity(GAMING_MOUSE));
        assertEquals(4, cart1.getQuantity(EARPHONES));
        assertEquals(0, cart1.getQuantity(LAPTOP));
    }

    @Test
    public void findShoppingCartById_WithId2_shouldReturnCart2() {
        ShoppingCart cart2 = shoppingCartManager.findShoppingCartById(2);
        assertEquals(2, cart2.getCartId());
        assertEquals(2, cart2.getQuantity(EARPHONES));
        assertEquals(1, cart2.getQuantity(NOTEBOOK));
        assertEquals(5, cart2.getQuantity(EARPHONES));
        assertEquals(1, cart2.getQuantity(KEYBOARD));
    }
}
