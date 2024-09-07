/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemadepago;

/**
 *
 * @author DELL
 */
public class PagoTarjetaCredito implements Pago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con Tarjeta de Crédito.");
    }
}