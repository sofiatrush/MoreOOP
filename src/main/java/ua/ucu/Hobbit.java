package ua.ucu;

import ua.ucu.HobbitKickStrategy;

public class Hobbit extends Character {
   public Hobbit() {
      super(0, 3, new HobbitKickStrategy());
   }

   @Override
   public String toString() {
      return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
   }
}
