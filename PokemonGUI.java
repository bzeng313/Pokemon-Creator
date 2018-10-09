import javax.swing.JFrame;
import java.awt.*;
public class PokemonGUI{
   public static void main(String[] args){
      
      JFrame frm = new JFrame("Pokemon GUI");
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new PokePanel());
      frm.pack();
      frm.setVisible(true);
      
      
   }
}