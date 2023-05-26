/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu04
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SaldoInsuficienteException{
        // TODO code application logic here
        int[] arreglo = {23,45,67,89};
        int i;
        /*
        Bloque try que lanza una Excepción y el Bloque Catch la atrapa y 
        te hace saber que es de tipo ArrayIndexOutOfBoundsException
        */
        try{
        for(i = 0; i <= arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
            
        }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println("Esta linea sì es alcanzable"); //se puede escribir
        
        float equis = 5.0f/2; //5/2 se castea porque es un entero entre un entero 5.0 es un double
        System.out.println("Divisiòn = " + equis);
        equis = 998.0f/2; //5/2 se castea porque es un entero entre un entero 5.0 es un double
        System.out.println("Divisiòn = " + equis);
        
        equis = 0.0f/8;
        System.out.println(equis);
        /*
        Bloque try que lanza una Excepción y el Bloque Catch atrapa la Excepción de tipo ArithmeticException
        */
        try{
        equis = 0/0;
        System.out.println(equis);
        }catch(ArithmeticException ex){
            System.out.println("Es" + ex.getMessage());
            ex.printStackTrace();
        }
        /*
        Bloque try que lanza una Excepción y con ayuda de los Bloques catch
        se puede saber de que tipo de Excepción en específico se trata
        */
        try{
            float a = 0/0;
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception: " + ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Exception: " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Ex: " + ex.getMessage());
        }
        
        try{
            float division = division(10,2);
            System.out.println("division metodo= "+division);
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());//imprime la traza
        }catch(ArithmeticException ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        try{
        float divs = division(3,0);
        System.out.println(divs);
        }catch(ArithmeticException ex){
            System.out.println("Exception: "+ ex.getMessage());
        }
        
        System.out.println("Esta es la ùltima linea");
        
        System.out.println("############Cuenta###########");
        //cuando solo se manda a hacer la funcion no la soporta porque no le hemos dicho que hace
        Cuenta cuenta = new Cuenta(100);
        
        try{
            System.out.println(cuenta);
            cuenta.depositar(100);
            System.out.println("$"+ cuenta.getSaldo());
            cuenta.depositar(21000);
            System.out.println("$"+ cuenta.getSaldo());
            cuenta.depositar(1000);
            System.out.println("$"+ cuenta.getSaldo());
            cuenta.retirar(50.0);
            System.out.println("$"+ cuenta.getSaldo());
            cuenta.retirar(50.0);
            System.out.println("$"+ cuenta.getSaldo());
            cuenta.retirar(150.0);
            System.out.println("$"+ cuenta.getSaldo());
            cuenta.retirar(250.0);
            System.out.println("$"+ cuenta.getSaldo());
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
            System.out.println("$"+cuenta.getSaldo());
        }
        
    }
    private static float division(int a, int b) throws ArithmeticException{
            //throw new UnsupportedOperationException("Not supported yet.");
            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return a/b;}
}
