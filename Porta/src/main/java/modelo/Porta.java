package modelo;

public class Porta {
    public boolean aberta;
    public String cor;
    public double altura;
    public double comprimento;
    
    public Porta(double altura, double comprimento){
        this.aberta = false;
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    public void abrir(){
        this.aberta = true;
    }
    public void fechar(){
        this.aberta = false;
    }
        
    public void pintar(String c){
        this.cor = c;
    }

    public boolean estaAberta(){
        return aberta;
    }
    
}
