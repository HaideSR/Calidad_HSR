/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_tdd;

/**
 *
 * @author Haide
 */
public class Tarea_TDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int fibonacci(int num1){
        int f = 0;
        int suma = 0;
        int t1 = 1;
        int t2;
        for(int i = 1; i <= num1; i++){
            t2 = f;
            f = t1 + f;
            t1 = t2;
            suma = suma + t1;
        }
        return suma;
    }
}
