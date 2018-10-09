/**
* Exception for Pokemon class.
* @author Brian Zeng
* @since April 18, 2017
*/

public class PokemonException extends RuntimeException{

   private String message = "";
   
   public PokemonException(){
   }
   
   public String getMessage(){
      return this.message;
   }
   
   public void setMessage(String message){
      this.message = message;
   }
}