package com.example.a20131en20270.javabeginner;

/**
 * Created by 20131en20270 on 13/09/2017.
 */
public class ArCondicionado {
    protected String Marca;
    protected String Modelo;
    protected String Tipo;
    protected int BTU;
    protected int Tensao;
    protected int Corrente;

    public ArCondicionado (String marca, String modelo, String tipo, int BTU, int tensao, int corrente){
        this.Marca = marca;
        this.Modelo = modelo;
        this.Tipo = tipo;
        this.BTU = BTU;
        this.Tensao = tensao;
        this.Corrente = corrente;
    }

    public void setMarca(String marca){
        this.Marca = marca;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public void setBTU(int BTU) {
        this.BTU = BTU;
    }

    public void setTensao(int tensao) {
        this.Tensao = tensao;
    }

    public void setCorrente(int corrente) {
        this.Corrente = corrente;
    }

    public String getMarca(){
        return this.Marca;
    }

}

