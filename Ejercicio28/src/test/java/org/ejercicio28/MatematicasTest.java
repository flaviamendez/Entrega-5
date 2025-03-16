package org.ejercicio28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.ejercicio28.Matematicas;

public class MatematicasTest {

    @Test
    public void testSumaNumeros() {
        assertEquals(15, Matematicas.suma(5));
        assertEquals(0, Matematicas.suma(0));
        assertThrows(ArithmeticException.class, () -> Matematicas.suma(-1));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Matematicas.factorial(5));
        assertEquals(1, Matematicas.factorial(0));
        assertThrows(ArithmeticException.class, () -> Matematicas.factorial(-3));
    }

    @Test
    public void testPotencia() {
        assertEquals(8, Matematicas.calcularPotencia(2, 3));
        assertEquals(1, Matematicas.calcularPotencia(5, 0));
        assertEquals(49, Matematicas.calcularPotencia(7, 2));
    }

    @Test
    public void testSumaElementosLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        assertEquals(15, Matematicas.calcularSumaElementosLista(lista, 0));
    }

    @Test
    public void testMediaAritmetica() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        assertEquals(5.0, Matematicas.calcularMediaAritmetica(lista), 0.01);
    }

    @Test
    public void testDesviacionTipica() {
        int[] lista = {2, 4, 4, 4, 5, 5, 7, 9};
        assertEquals(2.0, Matematicas.calcularDesviacionTipica(lista, 0, 0, 0), 0.01);
    }

    @Test
    public void testSumaPares() {
        assertEquals(30, Matematicas.calcularSumaPares(10));
        assertEquals(6, Matematicas.calcularSumaPares(5));
        assertEquals(2, Matematicas.calcularSumaPares(2));
    }

    @Test
    public void testSumaElementosParesLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        assertEquals(12, Matematicas.calcularSumaElementosParesLista(lista, 0));
    }

    @Test
    public void testObtenerListaPares() {
        int[] lista = {3, 6, 9, 12};
        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(6);
        esperado.add(12);
        assertEquals(esperado, Matematicas.obtenerListaPares(lista, 0));
    }

    @Test
    public void testObtenerListaParesHastaN() {
        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(2);
        esperado.add(4);
        esperado.add(6);
        esperado.add(8);
        esperado.add(10);
        assertEquals(esperado, Matematicas.obtenerListaParesHastaN(10));
    }

    @Test
    public void testProductoEscalar() {
        int[] lista1 = {1, 2, 3};
        int[] lista2 = {4, 5, 6};
        assertEquals(32, Matematicas.calcularProductoEscalar(lista1, lista2, lista1.length - 1));
    }

    @Test
    public void testFibonacci() {
        assertEquals(5, Matematicas.fibonacci(5));
        assertEquals(55, Matematicas.fibonacci(10));
    }

    @Test
    public void testCocienteFibonacci() {
        assertEquals(1.618033, Matematicas.cocienteFibonacci(13, 12), 0.0001);
    }
}
