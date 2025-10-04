package ua.ucu;

import ua.ucu.ElfKickStrategy;

public class Elf extends Character {
   public Elf() {
      super(10, 10, new ElfKickStrategy());
   }

   @Override
   public String toString() {
      return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
   }
}

