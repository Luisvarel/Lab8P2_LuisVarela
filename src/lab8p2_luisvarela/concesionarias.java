/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

import java.util.ArrayList;

/**
 *
 * @author Luis Andres Varela
 */
public class concesionarias {
    private String nombre;
    private String locación;
    private ArrayList<carro>c=new ArrayList();

    public concesionarias(String nombre, String locación) {
        this.nombre = nombre;
        this.locación = locación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocación() {
        return locación;
    }

    public void setLocación(String locación) {
        this.locación = locación;
    }
}
