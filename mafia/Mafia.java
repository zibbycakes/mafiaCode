package mafia;

import mafia.Player;

public class Mafia extends Player
{
    public Mafia() {    super();    }
    public Mafia(String n) {    super(n);   }

    public void nightTime(Player p)
    {
        System.out.println("The mafia kills " + p.getName());
    }
}