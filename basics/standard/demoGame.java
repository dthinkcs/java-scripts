
/**
 * Write a description of demoGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demoGame {
    public static void main(String args[])
    {
        Game game = new Game();
        Game gameCricket = new Cricket();
        Game gameChess = new Chess();
        
        game.type();
        gameCricket.type();
        gameChess.type();
    }
}

class Game
{
    void type()
    {
        System.out.println("indoor & outdoor games");
    }
}

class Cricket extends Game
{
    void type()
    {
        System.out.println("cricket is an outdoor game");
    }
}   

class Chess extends Game
{
    void type()
    {
        System.out.println("chess is an indoor game");
    }
}

