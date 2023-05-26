/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *  Esta clase hereda de la clase Exception por lo que cuando
 * se recibe alguna excepción el método SaldoInsuficienteException
 * manda un mensaje (parámetro) que hace saber a la clase padre
 * que se atrapo una excepción ya que se mando a llamar primero el método 
 * SaldoInsuficienteException desde la clase Cuenta 
 * @author poo08alu04
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException() {
        super("Excepción por saldo insuficiente");
        //String message = "Excepción por saldo insuficiente";
        //super(message);
    }
    
}
