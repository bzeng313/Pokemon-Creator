import java.util.*;

/*
* Class file for Pokemon.
* @author Brian Zeng
* @since April 13, 2017
*/

public class Pokemon{
   private String species = "";
   private String name = "";
   private int number = 0;
   private int hp = 0;
   
   public Pokemon(String species, String name, int number, int hp) throws PokemonException{
      PokemonException pe = new PokemonException();
      if(species.trim().equals("")){
         pe.setMessage("Invalid Pokemon species.");
         throw pe;
      }else{
         this.species = species;
      }
      if(name.equals("")){
         this.name = species;
      }else{
         this.name = name;
      }
      if(number >= 1 && number <= 151){
         this.number = number;
      }else{
         pe.setMessage("Pokemon number should be between 1 and 151.");
         throw pe;
      }
      if(hp >= 0 && hp <= 401){
         this.hp = hp;
      }else{
         pe.setMessage("Pokemon hp should be between 0 and 401.");
         throw pe;
      }
   }
   
   /**
   * Gets species
   * @return String species
   */
   public String getSpecies(){
      return species;
   }
   /**
   * Gets name
   * @return String name
   */
   public String getName(){
      return name;
   }
   /**
   * Gets number
   * @return int number
   */
   public int getNumber(){
      return number;
   }
   /**
   * Gets hp
   * @return int hp
   */
   public int getHP(){
      return hp;
   }
   /**
   * Sets new name
   * @param String newName
   */
   public void setName(String newName){
      this.name = newName;
   }
   /**
   * Sets new hp
   * @param int hp
   */
   public void setHP(int newHP) throws PokemonException{
      this.hp = newHP;
      
   }
   /**
   * toString method
   */
   public String toString(){
      String info = "Species: " + species + "\nName: " + name + "\nNumber: " + number + "\nHP: " + hp;
      return info;
   }
}