/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adrian_castilla_examendeentornos;

/**
 *
 * @author adriancastilla
 */
public class ACC_Rectangulo {
    int id;
    double ladoA;
    double ladoB;
    String color;
    
    public ACC_Rectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ACC_Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + '}';
    }
        
    
    
}
