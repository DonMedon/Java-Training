package ex9;

import org.example.ex9.GameStore;
import org.example.ex9.VideoGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {

    private GameStore gameStore;
    private VideoGame jogo1;

    @BeforeEach
    public void setUp() {

        gameStore = new GameStore();
        jogo1 = new VideoGame("FIFA", "EA", 40, 60);
    }

    @Test
    public void testAddGameToStock() {

        gameStore.addGameToStock(jogo1);
        assertEquals(1, gameStore.getStock().size());
        assertNotEquals(2, gameStore.getStock().size());
    }

    @Test
    public void testSellGame() {

        gameStore.addGameToStock(jogo1);
        gameStore.sellGame(0);
        assertEquals(0, gameStore.getStock().size());
        assertEquals(1, gameStore.getSales().size());
    }

    @Test
    public void testDisplayStock() {

        assertTrue(gameStore.displayStock());
    }

    @Test
    public void testDisplaySales() {

        assertTrue(gameStore.displaySales());
    }

    @Test
    public void testCalcularLucro() {

        gameStore.addGameToStock(jogo1);
        gameStore.addGameToStock(new VideoGame("GTA", "RockStar", 40, 60));
        gameStore.addGameToStock(new VideoGame("Sonic", "Sony", 40, 60));

        gameStore.sellGame(2);
        gameStore.sellGame(1);
        gameStore.sellGame(0);


        assertEquals(60, gameStore.calcularLucro());

    }
}
