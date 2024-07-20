/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogoluta;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author carlosbonfim
 */
public class JogoLuta {

    
    public static void main(String[] args) {
       
        Lutador atleta[] = new Lutador[10];
        
       atleta[0] = new Lutador("Chico Alicate", "Espanha", 32, 1.82f, 90f);
       atleta[1] = new Lutador("Zé Martelo", "Brasil", 29, 1.87f, 90f);
       atleta[2] = new Lutador("Morsa", "Polônia", 40, 1.84f, 100f);
       atleta[3] = new Lutador("Pedro Machado", "Portugal", 26, 1.79f, 90f);
       atleta[4] = new Lutador("João Polvo", "Austrália", 25, 1.90f, 85f);
       atleta[5] = new Lutador("Zé bom de Perna", "França", 27, 1.81f, 85f);
       atleta[6] = new Lutador("Cilindro", "Niger", 29, 1.86f, 88f);
       atleta[7] = new Lutador("Fantasma", "China", 42, 1.75f, 91f);
       atleta[8] = new Lutador("Delatorre Gemeo", "EUA", 31, 1.90f, 98f);
       atleta[9] = new Lutador("Juan Boludo", "Argentino", 24, 1.77f, 85f);
       
      Luta liga = new Luta();
              
       for(int i = 0; i < atleta.length; i++){
       for(int x = 0; x < atleta.length; x++){
       liga.marcarLuta(atleta[i], atleta[x]);
       liga.lutar();
       }
       
       }
     // Ordenar os lutadores por pontos
        Arrays.sort(atleta, Comparator.comparingInt(Lutador::getPontos).reversed());

        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Classificação:");
        for (int i = 0; i < atleta.length; i++) {
            System.out.println((i + 1) + "° - " + atleta[i].getNome() + " " + atleta[i].getPontos() + " Ptns");
        }

 
    }
    
}
