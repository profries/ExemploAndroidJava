package com.example.iossenac.myapplication.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {

    @Test
    public void setFreteOK() {
        double resultadoEsperado = 30;

        Pedido pedido = new Pedido();
        pedido.setFrete(30);

        assertEquals(resultadoEsperado, pedido.getFrete(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFreteExcecao() {
        Pedido pedido = new Pedido();
        pedido.setFrete(-30);
    }

    @Test
    public void addProduto() {
        int tamanhoArrayEsperado = 2;

        Pedido pedido = new Pedido();
        pedido.addProduto(new Produto(1,"p1",10));
        pedido.addProduto(new Produto(2,"p2",20));

        assertEquals(tamanhoArrayEsperado,pedido.getListaProdutos().size(),0);
    }

    @Test
    public void getValorTotal() {
        double valorTotalEsperado = 50;

        Pedido pedido = new Pedido();
        pedido.addProduto(new Produto(1,"p1",5));
        pedido.addProduto(new Produto(2,"p2",10));
        pedido.addProduto(new Produto(3,"p3",15));
        pedido.setFrete(20);

        assertEquals(valorTotalEsperado, pedido.getValorTotal(),0);
    }
}