/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemadepago;

/**
 *
 * @author DELL
 */
public class PagoPayPalFactory extends PagoFactory {
    @Override
    public Pago crearPago() {
        return new PagoPayPal();
    }
}
