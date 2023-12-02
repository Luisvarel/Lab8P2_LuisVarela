/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

/**
 *
 * @author Luis Andres Varela
 */
public class circuito {

    private int longitud;
    private int cantidad_curvas;
    private String tipo;
    private String locacion;
    private static final long SerialVersionUID = 22L;

    public circuito(int longitud, int cantidad_curvas, String tipo, String locacion) {
        this.longitud = longitud;
        this.cantidad_curvas = cantidad_curvas;
        this.tipo = tipo;
        this.locacion = locacion;
    }

    public circuito() {
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getCantidad_curvas() {
        return cantidad_curvas;
    }

    public void setCantidad_curvas(int cantidad_curvas) {
        this.cantidad_curvas = cantidad_curvas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

}
