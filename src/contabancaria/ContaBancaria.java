/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author claudinei
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1=new Conta("Claudinei", "5789-4", 0);
        Conta conta2=new Conta("Fábioi", "5792-3", 0);
                      
        conta1.deposito(1000,false);
        conta1.deposito(1000,false);
        conta1.saque(500,false);
        conta1.transferencia(conta2,1000);
        
        System.out.println(conta1);
        System.out.println(conta2);
        
        
        
    }
    
}
