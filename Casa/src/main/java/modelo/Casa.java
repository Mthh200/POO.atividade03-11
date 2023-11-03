package modelo;

public class Casa {
    public String cor;
    public Porta porta1;
    public Porta porta2;
    
    public Casa(Porta p1, Porta p2){
        this.porta1 = p1;
        this.porta2 = p2;
    }
    
    public void pintar(String c){
        this.cor = c;
    }
    public int quantPortasAbertas(){
        int count = 0;
        if (this.porta1.estaAberta() == true){
            count++;
        }
        if (this.porta2.estaAberta() == true){
            count++;
        }
        
        return count;
    }
    
}
