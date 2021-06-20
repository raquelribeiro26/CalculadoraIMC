
package calculoimc;

import java.text.DecimalFormat;
import java.util.Scanner;

//Calculo bruto do IMC
public class CalculoImc {

        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o peso: ");
            double peso = leitor.nextDouble();
            System.out.println("Digite a altura: ");
            double altura = leitor.nextDouble();
            double imc ;
            
            imc = peso / Math.pow(altura, 2);
            DecimalFormat f = new DecimalFormat("#.##");
            
            System.out.println("O seu IMC é: "  + f.format(imc));
            
            
            //Enquadramento do IMC e mensagem ao usuário
            if     (imc<17) {
            System.out.println (" Cuidado! Voce esta muito abaixo do peso ideal.");}
     
            else if (imc<18.5) {
                System.out.println ("Cuidado! Voce esta abaixo do peso ideal.");}
            
            else if (imc <25) {
            System.out.println ("PARABENS! Voce esta no seu peso ideal!");}
                      
            else if (imc<30) {
            System.out.println ("Voce esta com um ligeiro sobrepeso.");}
            
            else if (imc<35){
            System.out.println ("Cuidado! Voce esta com obesidade grau 1.");}
            
            else if (imc <40) {
            System.out.println("Cuidado! Voce esta com obesidade grau 2.");}
           
           else {
            System.out.println ("Cuidado! Voce esta com obesidade grau 3.");}
                                          
            
            
            
        
                  
    }
    
}
