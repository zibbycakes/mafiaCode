package mafia;

import mafia.Player;

public class Detective extends Player 
{
    public Detective() {    super();    }
    public Detective(String n) {    super(n);   }

    public void nightTime(Player p)
    {
        System.out.println("Detective " + super.getName() + 
        " investigates " + p.getName() + ". Read: " + 
        getInnocence(p)+ ".");
    }

    public String getInnocence(Player p)
    {
        switch(p.getClass().toString())
        {
            case "class mafia.Detective": return "innocent";
            case "class mafia.Player": return "innocent";
            case "class mafia.Mafia": return "guilty";
        }
        return p.getClass().toString();
    }
}