package ua.ucu;

import lombok.Generated;
import ua.ucu.KickStrategy;

public abstract class Character {
   private int power;
   private int hp;
   private KickStrategy kickStrategy;

   public boolean isAlive() {
      return this.hp > 0;
   }

   public void kick(Character enemy) {
      this.kickStrategy.kick(this, enemy);
   }

   @Generated
   public int getPower() {
      return this.power;
   }

   @Generated
   public int getHp() {
      return this.hp;
   }

   @Generated
   public KickStrategy getKickStrategy() {
      return this.kickStrategy;
   }

   @Generated
   public void setPower(int power) {
      this.power = power;
   }

   @Generated
   public void setHp(int hp) {
      this.hp = Math.max(0, hp);
   }

   @Generated
   public void setKickStrategy(KickStrategy kickStrategy) {
      this.kickStrategy = kickStrategy;
   }

   @Generated
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Character)) {
         return false;
      } else {
         Character other = (Character)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getPower() != other.getPower()) {
            return false;
         } else if (this.getHp() != other.getHp()) {
            return false;
         } else {
            Object this$kickStrategy = this.getKickStrategy();
            Object other$kickStrategy = other.getKickStrategy();
            if (this$kickStrategy == null) {
               if (other$kickStrategy == null) {
                  return true;
               }
            } else if (this$kickStrategy.equals(other$kickStrategy)) {
               return true;
            }

            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object other) {
      return other instanceof Character;
   }

   @Generated
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * PRIME + this.getPower();
      result = result * PRIME + this.getHp();
      Object $kickStrategy = this.getKickStrategy();
      result = result * PRIME + ($kickStrategy == null ? 43 : $kickStrategy.hashCode());
      return result;
   }

   @Generated
   public String toString() {
      int var10000 = this.getPower();
      return "Character(power=" + var10000 + ", hp=" + this.getHp() + ", kickStrategy=" + String.valueOf(this.getKickStrategy()) + ")";
   }

   @Generated
   public Character(int power, int hp, KickStrategy kickStrategy) {
      this.power = power;
      this.hp = hp;
      this.kickStrategy = kickStrategy;
   }
}
