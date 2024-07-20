/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoluta;

import java.util.Random;
import java.util.Timer;



/**
 *
 * @author carlosbonfim
 */
public class Luta {
    //atributo
    private Lutador desafiado;

    private Lutador desafiante;
    private int rounds;

    private boolean aprovada;
    //metodo
    public void marcarLuta(Lutador l1, Lutador l2){
        l1.classificarCategoria();
        l2.classificarCategoria();
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        
            setDesafiado(l1);
            setDesafiante(l2);
            setAprovada(true);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
            
    }
    public void lutar(){
      
        Random aleatorio = new Random();
        if(isAprovada()){
            System.out.println("Desafiado:");
            getDesafiado().apresentar();
            System.out.println("Desafiante:");
            getDesafiante().apresentar();
            
         int vencedor = aleatorio.nextInt(5);
            
        if(vencedor == 0 || vencedor == 1){
            System.out.println(getDesafiado().getNome()+ " vence " + getDesafiante().getNome());
            getDesafiado().ganharLuta();
            
            getDesafiante().perderLuta();
        } else if(vencedor == 2 || vencedor == 3){
              System.out.println(getDesafiante().getNome()+ " vence " + getDesafiado().getNome());
            getDesafiante().ganharLuta();
            getDesafiado().perderLuta();
        } else{
            System.out.println("empate!");
            getDesafiado().empatarLuta();
            getDesafiante().empatarLuta();
        }
            
        
}
        else{
            System.out.println("Não tem Luta");
        }

    }
//get e set

  
    
    

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
