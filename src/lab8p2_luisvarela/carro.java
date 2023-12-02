/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Luis Andres Varela
 */
public class carro {
    private boolean reconstruido;
    private String marca;
    private String modelo;
    private Color color;
    private int precio;
    private int[] mejora = {0, 0, 0, 0, 0};
    /*
    spoiler posicion 0 precio de la mejora 3500
    side skirts 1 precio de la mejora 1800
    front bumper 2 precio de la mejora 2000
    back bumper 3 precio de la mejora 1500
    esta mejora solo esta disponible en autos reconstruido
    Super builds 4 precio de la mejora 8800
     */
    private String pais;
    private int year_fabricación;
    private int Horsepower;
    private int Velocidad_Punta;
    private int Tiempo;

    public carro(boolean reconstruido, String marca, String modelo, Color color, int precio, String pais, int year_fabricación, int Horsepower, int Velocidad_Punta, int Tiempo) {
        this.reconstruido = reconstruido;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.pais = pais;
        this.year_fabricación = year_fabricación;
        this.Horsepower = Horsepower;
        this.Velocidad_Punta = Velocidad_Punta;
        this.Tiempo = Tiempo;
    }

    public boolean isReconstruido() {
        return reconstruido;
    }

    public void setReconstruido(boolean reconstruido) {
        this.reconstruido = reconstruido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int[] getMejora() {
        return mejora;
    }

    public void setMejora(int[] mejora) {
        this.mejora = mejora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getYear_fabricación() {
        return year_fabricación;
    }

    public void setYear_fabricación(Date year_fabricación) {
        this.year_fabricación = year_fabricación;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int Horsepower) {
        this.Horsepower = Horsepower;
    }

    public int getVelocidad_Punta() {
        return Velocidad_Punta;
    }

    public void setVelocidad_Punta(int Velocidad_Punta) {
        this.Velocidad_Punta = Velocidad_Punta;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }
    
}
