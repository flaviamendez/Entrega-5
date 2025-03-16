package org.ejercicio29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.ejercicio29.Matematicas;


public class MatematicasTest {

    @Test
    public void sumaCero() {
        assertEquals(0, Matematicas.sumaNumeros(0));
    }

    @Test
    public void sumaPositivo() {
        assertEquals(6, Matematicas.sumaNumeros(3)); // 3+2+1+0 = 6
    }

    @Test
    public void sumaNegativo() {
    assertThrows(ArithmeticException.class, () -> Matematicas.sumaNumeros(-1));
}

}
