/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;


public class CalcularTempo {
    
    
    public CalcularTempo(){
        
        
    }
    
    public void tempoDaFrase(){
         Instant agora = Instant.now();
         JOptionPane.showInputDialog("Escribe a Frase");
         Instant  antes =Instant.now();
         Duration tempo = Duration.between(agora,antes);
        System.out.println("O tempo transcurrido e "+ tempo.getSeconds()+ " sg");
        
        
        
    }
    
    
    public void compararFechas(){
        
        LocalDate ahora = LocalDate.now();
        LocalDate de = LocalDate.of(2003,5,2);
    
       
         Period tiempo = Period.between(ahora,de);
        System.out.println("\n El tiempo que ha transcurrido son "+tiempo+"\n Los años "+tiempo.getYears()+"\n Los meses "
        +tiempo.getMonths()+ " Y los días son "+tiempo.getDays());
    }
    
}
