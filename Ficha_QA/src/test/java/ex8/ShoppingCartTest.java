package ex8;

import org.example.ex8.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart carrinho;

    @BeforeEach
    public void setUp() {

        carrinho = new ShoppingCart("23");
    }
    @Test
    public void testAddItem() {
        carrinho.addItem("Twix");
        assertTrue(carrinho.addItem("Twix"));
    }
    @Test
    public void testRemoveItem() {
        carrinho.addItem("Twix");
        assertTrue(carrinho.removeItem("Twix"));
    }
    @Test
    public void testContainsItem() {
        carrinho.addItem("Twix");
        assertTrue(carrinho.containsItem("Twix"));
        assertFalse(carrinho.containsItem("Kit-Kat"));
    }
    @Test
    public void testItemCount() {

        assertEquals(0, carrinho.getItemCount());
        carrinho.addItem("Twix");
        assertEquals(1, carrinho.getItemCount());
    }
    @Test
    public void testClearCart() {

        carrinho.addItem("Twix");
        assertTrue(carrinho.clearCart());
        assertEquals(0, carrinho.getItemCount());
    }
}

