/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adrian_castilla_examendeentornos;

/**
 *
 * @author adriancastilla
 */
public class Adrian_Castilla_ExamenDeEntornos {
    
    public static double calculoDiferencia(double area1, double area2) {
        double diferencia = area1 - area2;
        return diferencia;
    }
    
    public static void printValues(double areaRectangulo, double areaCirculo, double diferencia) {
        System.out.println("Area cuadrado: " + areaRectangulo);
        
        System.out.println("Area circulo: " + areaCirculo);
        
        System.out.println("Diferencia areas: " + diferencia);
    }
    
    
    
    public static void main(String[] args) {
           ACC_Rectangulo rectangulo1 = new ACC_Rectangulo(3, 3, 4, "verde");
           ACC_Circular circulo1 = new ACC_Circular(3, 3, "naranja");
           
           double areaRectangulo = rectangulo1.calculoAreaRectangulo();
           double areaCirculo = circulo1.calculoAreaCirculo();
           double diferencia = calculoDiferencia(areaRectangulo, areaCirculo);
           
           printValues(areaRectangulo, areaCirculo, diferencia);
        
    }
}
