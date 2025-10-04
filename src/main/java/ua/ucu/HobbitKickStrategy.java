package ua.ucu;

import ua.ucu.Character;

public class HobbitKickStrategy extends KickStrategy {
   public HobbitKickStrategy() {
   }

   public void kick(Character main, Character enemy) {
      System.out.println("Cry a lot!");
   }
}
