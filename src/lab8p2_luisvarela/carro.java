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
    private Date year_fabricación;
}
