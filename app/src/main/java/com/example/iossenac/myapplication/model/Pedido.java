package com.example.iossenac.myapplication.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> listaProdutos;
    private double frete;

    public Pedido() {
        listaProdutos = new ArrayList<>();
        frete = 0;
    }

    public void setFrete(double frete) {
        if(frete < 0) throw new IllegalArgumentException();
        this.frete = frete;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public double getFrete() {
        return frete;
    }

    public void addProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public double getValorTotal(){
        double total = 0;
        for(Produto prod: listaProdutos){
            total+= prod.getPreco();
        }
        return total+frete;
    }
}
