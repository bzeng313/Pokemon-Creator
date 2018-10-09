import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PokePanel extends JPanel{
   
   //
   private int count = 0;
   private String strHP;
   private String name = "";
   private int HP = 0;
   
   //JLabels
   private JLabel title = new JLabel("Pokemon Creator");
   private JLabel pokeHP = new JLabel("Pokemon HP:");
   private JLabel pokeNickname = new JLabel("Pokemon Nickname:");
   
   
   //JTextFields
   private JTextField enterHP = new JTextField(3);
   private JTextField enterNickname = new JTextField(10);

   //creates sub-panels
   private JPanel top = new JPanel();
   private JPanel center = new JPanel();
   private JPanel bottom = new JPanel();
   
   //drop down-menu for Pokemon
   private Choice pokeChoice = new Choice();
   
   //JButtons
   private JButton bMake = new JButton(" Make Pokemon ");
   private JButton bList = new JButton(" List Pokemon ");
   private JButton bClear = new JButton(" Clear Pokemon List ");
   
   //JTextAreas
   private TextArea createdPokemon = new TextArea();
   private TextArea listPokemon = new TextArea();
   
   //GUIListener
   private GUIListener listener = new GUIListener();
   
   //initializing Pokemon object
   Pokemon newPoke = new Pokemon("empty", "empty", 1, 0);
   
   //Pokemon array
   private ArrayList<Pokemon> pokeArray =  new ArrayList<>();
   
   //Pokemon picture
   private ImageIcon bulbasaur = new ImageIcon("Bulbasaur.png");
   private ImageIcon ivysaur = new ImageIcon("Ivysaur.png");
   private ImageIcon venusaur = new ImageIcon("Venusaur.png");
   private ImageIcon squirtle = new ImageIcon("Squirtle.png");
   private ImageIcon wartortle = new ImageIcon("Wartortle.png");
   private ImageIcon blastoise= new ImageIcon("Blastoise.png");
   private ImageIcon charmander = new ImageIcon("Charmander.png");
   private ImageIcon charmeleon = new ImageIcon("Charmeleon.png");
   private ImageIcon charizard = new ImageIcon("Charizard.png");
   private ImageIcon yellow = new ImageIcon("yellow.png");
   private JLabel picture = new JLabel(yellow);
   
   public PokePanel(){
   
      setLayout(new BorderLayout());//creates border layout
      setPreferredSize(new Dimension (1000, 1000));//sets size of window
      
      //sets background colors of JPanels
      top.setBackground(Color.red);
      center.setBackground(Color.yellow);
      bottom.setBackground(Color.white);
      
      //adds title to top sub-panel
      top.add(title);
      
      //adds choices to drop-down menu
      pokeChoice.add("Choose Pokemon");
      pokeChoice.add("Bulbasaur");
      pokeChoice.add("Ivysaur");
      pokeChoice.add("Venusaur");
      pokeChoice.add("Squirtle");
      pokeChoice.add("Wartortle");
      pokeChoice.add("Blastoise");
      pokeChoice.add("Charmander");
      pokeChoice.add("Charmeleon");
      pokeChoice.add("Charizard");
      //adds drop-down menu to center
      center.add(pokeChoice);
      
      
      //adds text-fields and labels for hp and nickname
      center.add(pokeHP);
      center.add(enterHP);
      center.add(pokeNickname);
      center.add(enterNickname);
      
      
      //add noneditable text area for created Pokemon info
      createdPokemon.setEditable(false);
      center.add(createdPokemon);
      
      //adds picture next to text area of Pokemon
      center.add(picture);
      
      //adds buttons to bottom sub-panel and adds listeners
      bottom.add(bMake);
      bottom.add(bList);
      bottom.add(bClear);
      bMake.addActionListener(listener);
      bList.addActionListener(listener);
      bClear.addActionListener(listener);
      
      //add noneditable text area to list all pokemon in array
      listPokemon.setEditable(false);
      bottom.add(listPokemon);
      
      //adds sub-panels to JPanel
      add("North", top);
      add("Center", center);
      add("South", bottom);
      
   }
   
   
   private class GUIListener implements ActionListener{
   
   /*
   * ActionPerformed method
   * @param event
   */ 
      public void actionPerformed(ActionEvent event){
      
         if(event.getSource() == bList){
            if(count !=0){
               listPokemon.setText("");
               for(int x = 0; x <= count; x++){
                  listPokemon.append(pokeArray.get(x).toString() + "\n\n");
               }
            }
            else if(count == 0){
               listPokemon.setText("You did not create any Pokemon yet.");
            }
         
         }         
         if(event.getSource() == bMake){
            try{
               strHP = enterHP.getText();
               strHP = strHP.trim();
               HP = Integer.parseInt(strHP);
               
               switch(pokeChoice.getSelectedIndex()){
               case 0:
                  createdPokemon.setText("Please choose a Pokemon.");
                  break;
               case 1:
                  newPoke = new Pokemon("Bulbasaur", enterNickname.getText(), 1, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(bulbasaur);
                  count++;
                  break;
               case 2:
                  newPoke = new Pokemon("Ivysaur", enterNickname.getText(), 2, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(ivysaur);
                  count++;
                  break;
               case 3:
                  newPoke = new Pokemon("Venusaur", enterNickname.getText(), 3, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(venusaur);
                  count++;
                  break;
               case 4:
                  newPoke = new Pokemon("Squirtle", enterNickname.getText(), 4, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(squirtle);
                  count++;
                  break;
               case 5:
                  newPoke = new Pokemon("Wartortle", enterNickname.getText(), 5, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(wartortle);
                  count++;
                  break;
               case 6:
                  newPoke = new Pokemon("Blastoise", enterNickname.getText(), 6, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(blastoise);
                  count++;
                  break;
               case 7:
                  newPoke = new Pokemon("Charmander", enterNickname.getText(), 7, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(charmander);
                  count++;
                  break;
               case 8:
                  newPoke = new Pokemon("Charmeleon", enterNickname.getText(), 8, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(charmeleon);
                  count++;
                  break;     
               case 9:
                  newPoke = new Pokemon("Charizard", enterNickname.getText(), 9, HP);
                  pokeArray.add(newPoke);
                  createdPokemon.setText(pokeArray.get(count).toString() + "\n" + "New Pokemon added to list.");
                  picture.setIcon(charizard);
                  count++;
                  break;
            
            }

            }
            catch(NumberFormatException nfe){
               createdPokemon.setText("Enter a valid HP.");
            }catch(PokemonException pe){
               createdPokemon.setText(pe.getMessage());
            }
            
         }
         
         if(event.getSource() == bClear){
            clean();
         }
      
      
      }
   }
   
   private void clean(){
      enterHP.setText("");
      enterNickname.setText("");
      createdPokemon.setText("");
      listPokemon.setText("Pokemon list has been cleared.");
      pokeArray.clear();
      count = 0;
      picture.setIcon(yellow);
      
   }
}