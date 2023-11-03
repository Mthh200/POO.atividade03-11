package modelo;

public class Pessoa {
    public String nome;
    public int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazAniversario(){
        this.idade++;
    }
}
