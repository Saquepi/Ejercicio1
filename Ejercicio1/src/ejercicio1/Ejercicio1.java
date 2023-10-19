/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int employeeCount = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de empleados"));
        double totalFinal;
        double totalSFM = 0;
        double totalIVM = 0;
        
        for (int i = 0; i < employeeCount; i++) {
           double tempWage = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el salario del empleado número "+(i+1)));
           double tempSEM = tempWage*0.0925;
           double tempIVM = tempWage*0.0508;
           
           totalSFM = totalSFM + tempSEM;
           totalIVM = totalIVM + tempIVM;
        }
        totalFinal = totalIVM + totalSFM;
        
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + totalFinal + " por concepto de SEM y IVM");
    }
    
}
