import java.util.Random;

public class Dado{
    

    public int ThrowDice() {
        Random rand = new Random();
        int valor = rand.nextInt(6) + 1;
        return valor;

    }


}