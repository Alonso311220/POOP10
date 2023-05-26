/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import static java.lang.System.exit;

/**
 * En está clase se guardan los valores del saldo en la cuenta, por lo que
 * se puede depositar y se puede retirar saldo de la cuenta
 * @author poo08alu04
 */
public class Cuenta {
    private double saldo;
    private int cont;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /*
    Este método deposita un monto en la cuenta
    */
    public void depositar(double monto){
        if(monto >= 20000.00)
        {
            System.out.println("No se puede depositar más de $20000");
        }
        else
        {
        System.out.println("Depositando... $" + monto);
        saldo += monto;
        }
    }
    /*
    Esta función te avisa sobre que lanza una excepción de saldo insuficiente, 
    que se lanzará si el saldo es menor que el monto, así mismo, se puede 
    decir que manda a llamar al método SaldoInsuficienteException
    */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando... $");
        if( saldo > monto){
            if( cont != 3)
            {
                saldo -= monto;
                cont = 1+cont;
            }
            else{
                System.out.println("Ya no puedes realizar más retiros");
                exit(0);
            }
        }
        else{
            throw new SaldoInsuficienteException();
        }
        
    }
    /*
    Sobreescritura de las variables de la clase Cuenta 
    */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
