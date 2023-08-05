

public class Jugador {
    private int puntaje;
    private int s20;
    
    public Jugador(){
        this.puntaje = 0;
        this.s20 = 1;
        
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public boolean didWin(){
        if(this.puntaje >= 100){
            return true;
        }else{
            return false;
        }
    }

    public void set0() {
        this.s20 = 1;
    }

    public boolean did20(){
        
        int val = (int) this.puntaje / 20;
        System.out.println(val+" "+s20);
            if(val == this.s20){
                this.s20+=1;
                return true;
            }else{
                return false;
            }
        }
}
