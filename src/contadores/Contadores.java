/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contadores;

/**
 *
 * @author EDGAR AIMAR
 */
public class Contadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int contador = 0;
int multiplicacion = 0;

while (contador <= 15){
System.out.println("contador =  " + contador);
multiplicacion += contador*contador;
contador++;
}
System.out.println("multiplicacion =  " + multiplicacion);
    }

}
