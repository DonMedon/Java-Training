package ex3;

import org.example.ex3.Alimento;
import org.example.ex3.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {
    private Animal animal;
    @BeforeEach
    public void setUp() {

        animal = new Animal("Leão", Alimento.CARNE);
    }
    @Test
    public void testComer() {

        assertFalse(animal.comer(Alimento.PEIXE));
        assertTrue(animal.comer(Alimento.CARNE));

        assertTrue(animal.comer(Alimento.PEIXE));
    }
}
