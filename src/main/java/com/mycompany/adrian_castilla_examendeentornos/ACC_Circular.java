/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adrian_castilla_examendeentornos;

/**
 *
 * @author adriancastilla
 */
public class ACC_Circular {
    int id;
    double radio;
    String color;

    public ACC_Circular(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ACC_Circular{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }
    
    
}
