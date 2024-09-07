/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systemadepago;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SystemadePago {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         
     
    
 Scanner scanner= new Scanner(System.in);
 PagoFactory pagoFactory= null;
 
 System.out.println("Seleccione el método de pago:");
 System.out.println("1. Pago con Tarjeta de Credito:");
 System.out.println("2. Pago con Paypal");
 int opcion= scanner.nextInt();
 
 switch(opcion){
     case 1:
         pagoFactory = new PagoTarjetaCreditoFactory();
                break;
     case 2: 
         pagoFactory = new PagoPayPalFactory();
                break;
     default:
         System.out.println("Opcion invalida");
         System.exit(0);
         }
 System.out.println("Ingrese el total a Pagar:");
 double monto= scanner.nextDouble();
 
 Pago pago= pagoFactory.crearPago();
 pago.realizarPago(monto);
 scanner.close();
 
 
 
 
 
 
 
    } 
}
