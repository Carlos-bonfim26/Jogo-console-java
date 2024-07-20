/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoluta;

/**
 *
 * @author carlosbonfim
 */
public class Lutador {
    //atributo
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    private int pontos;
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    //metodo
    public void apresentar(){
        System.out.println(" nascido em " + getNacionalidade() + " pesando " + getPeso() + " medindo " + getAltura() + "e tendo " + getVitoria() + " na carreira, cola pra cá "+ getNome() + "!!!");
    }
    public void status(){
        System.out.println("nome: "+getNome());
        System.out.println("Pontos na Liga: "+ getPontos());
        System.out.println("números na carreira");
        System.out.println("Vitórias: "+ getVitoria());
        System.out.println("empates: "+getEmpate());
        System.out.println("derrotas: "+getDerrota());
    }    
    public void ganharLuta(){
        
      setVitoria(getVitoria() +1);
        setPontos(getPontos() + 3);
    }
     public void perderLuta(){
         setDerrota(getDerrota() + 1);
    }
      public void empatarLuta(){
          setPontos(getPontos() + 1);
          setEmpate(getEmpate() + 1);
    }
     public void classificarCategoria(){
       
         if(getPeso() <  70){
             setCategoria("Frango");
         }
         else if(getPeso() < 85){
             setCategoria("Médio");
         }
         else if(getPeso() <= 100){
             setCategoria("Pesado");
         }
         else{
             setCategoria("Pericles");
         }
      
     }
      
      //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
      
}
