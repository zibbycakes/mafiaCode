package mafia;

import mafia.Player;

public class Game
{
    public static void main(String args[])
    {
        Player p = new Player("George");
        System.out.println(p.getName());

        Detective a = new Detective("Carl");
        Detective b = new Detective("Anthony");

        a.nightTime(b);

        Mafia c = new Mafia("Greasy Pete");

        c.nightTime(p);
        b.nightTime(c);
    }
}