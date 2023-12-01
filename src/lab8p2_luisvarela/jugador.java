/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Andres Varela
 */
public class jugador implements Serializable {

    private String nombre;
    private String correo;
    private String pais_residencia;
    private Date nacimiento;
    private int saldo;
    private String usuario;
    private String contrasena;
    private ArrayList<carro> c = new ArrayList();
    private static final long SerialVersionUID = 555L;

    public jugador(String nombre, String correo, String pais_residencia, Date nacimiento, String usuario, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais_residencia = pais_residencia;
        this.nacimiento = nacimiento;
        this.saldo = 150000;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais_residencia() {
        return pais_residencia;
    }

    public void setPais_residencia(String pais_residencia) {
        this.pais_residencia = pais_residencia;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario:" + usuario;
    }

}
