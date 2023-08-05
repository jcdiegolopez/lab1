import java.util.Scanner;



public class PIG{

    
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores");
        int num = myscan.nextInt();
        Jugador[ ] jugadores = new Jugador[num];
        for( int i = 0; i < jugadores.length; i++ ){
            jugadores[i] = new Jugador();
        }
        Dado d = new Dado();
        boolean finish = false;

        while(!finish){
        int turno = 1;
        for(Jugador player: jugadores){
            System.out.println("Es el turno del jugador "+turno);
            
            while(!player.did20()){
                System.out.println("¿Desea tirar? (sí/no)");
                String value = myscan.next();
                if(value.equals("si")){
                    int v1 = d.ThrowDice();
                    int v2 = d.ThrowDice();
                    if(v1 == 1 || v2 ==1 ){
                        player.setPuntaje(0);
                        player.set0();
                        System.out.println("Uno de sus dados tuvo 1, su puntaje es 0");
                        break;
                    }else{
                        player.setPuntaje(player.getPuntaje() + v1 + v2);
                        System.out.println("Su puntaje es: "+player.getPuntaje() );
                    }
                }else{
                    break;
                }

                if(player.didWin()){
                    System.out.println("Felicidades!, Ha ganado usted Jugador" + turno);
                    finish = true;
                    break;
                }
                
                
            }
            if(finish == true){
                break;}
        turno+=1;   
        }
        
    }
    myscan.close();
    
    }

    



    

    
}