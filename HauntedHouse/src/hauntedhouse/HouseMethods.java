//********************************************************************************
// PantherID:  5857745 & 4041939
// CLASS: COP 2210 – [Fall 2015]
// ASSIGNMENT # 4
// DATE: [11/18/15]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package hauntedhouse;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class HouseMethods {
    //Variable stores user's name
    String userName;
    //Option for dining room, living room, or upstairs
    String choice1;
    //Options within choice1 rooms like next room, go back, or object
    String choice2;
    //Options within choice2 rooms like next room, go back, or object
    String choice3;
    //Options within choice2 rooms like next room, go back, or object
    String choice4;
    //Helps to ensure users can't leave until explore atleast ONE room
    boolean roomCount = false;
    //Helps to switch properly between bedroom 1, bedroom 2, & the upstairs bathroom
    boolean bedroomCount;
    
    //Front door interaction
    void DiningRoom() {
        choice2 = JOptionPane.showInputDialog(null, userName + ", you enter the dining room, noticing a strange, unlit candelabra on an antique dining table.\nYou also notice the entry to the kitchen.\n\n" 
                + userName + ", Enter one option: kitchen, candelabra, or go back");
            
            if (choice2.equalsIgnoreCase("kitchen"))
            {
                Kitchen();       
            }
            
            else if (choice2.equalsIgnoreCase("candelabra"))
            {
                JOptionPane.showMessageDialog(null, "As you walk closer the candles begins to light up by themselves, \nglowing brighter and brighter until suddenly everything goes black.\n\nTHE END!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("candelabra.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice2.equalsIgnoreCase("go back")) 
            {
                roomCount = true;
                FrontDoor();
            }
            else{
                DiningRoom();
            }
        
    }
    
    //Kitchen interaction
    void Kitchen() {
        choice3 = JOptionPane.showInputDialog(null, userName + ", you enter the kitchen hearing a cabinet creak open. You notice the fridge is slightly open and the light is off.\nThere is also pantry in the corner that seems to have a strange feeling coming from it...\nEnter one option: cabinet, fridge, pantry, or go back");
            if (choice3.equalsIgnoreCase("pantry"))
            {
                Pantry();
            }
            else if (choice3.equalsIgnoreCase("go back")) 
            {
                DiningRoom();
            }    
            //Chance to escape unharmed
            else if (choice3.equalsIgnoreCase("fridge")) 
            {
                JOptionPane.showMessageDialog(null, "You open the fridge where you find freshly cooked soul food.\nYou grab some amd dig in!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("fridge.png"));
                JOptionPane.showMessageDialog(null, "", "Yum", JOptionPane.OK_OPTION, icon2);
                
                Kitchen();
            }
            else if (choice3.equalsIgnoreCase("cabinet")) 
            {
                JOptionPane.showMessageDialog(null, "You open the cabinet, the dishes and glasses start flying at you as soon as you open the door.\nYou get hit in the head and feel yourself start moving towards a light.\n\nTHE END");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("cabinet.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                
                System.exit(0);
            }
            else
            {
                Kitchen();
            }
    }
    
    //Pantry interaction
    void Pantry() {
        choice4 = JOptionPane.showInputDialog(null, userName + ", you open the door to the pantry on the shelf you see a strange old recipe box, and to your left you see an equally old broom!\nEnter one option: box, broom, or go back");
            if (choice4.equalsIgnoreCase("box")) 
            {
                JOptionPane.showMessageDialog(null, "You open it up and a recipe for chocolate devils food cake appears out of no where!\nJust then the cake starts to growl, you hear it calling your name '" + userName + "!!!!!' The cake then leaps up at you and eats you in a single bite.\n\n THE END!!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("box.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                
                System.exit(0);
            }
            if (choice4.equalsIgnoreCase("go back")) 
            {
                Kitchen();
            }
            //Chance to escape unharmed
            else if (choice4.equalsIgnoreCase("broom")) 
            {
                JOptionPane.showMessageDialog(null, "Just as you touch the broom it springs to life.\nYou try to hold on tightly as you're suddenly dragged through the entire downstairs.\nThe broom then drags you upstairs where stops in the hallway and goes lifeless!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("broom.png"));
                JOptionPane.showMessageDialog(null, "", "Broom Ride", JOptionPane.OK_OPTION, icon2);
                
                UpStairs();
                
            }   
            else
            {
                Pantry();
            }
    }    
   
    //Living room interaction
    void LivingRoom() {
        choice2 = JOptionPane.showInputDialog(null, userName + ", you enter the living room and notice a strange chest in the corner of the room.\nYou also notice the entry to the bathroom.\n\n" 
                + userName + ", Enter one option: bathroom, chest, or go back");
        
            if (choice2.equalsIgnoreCase("bathroom")) 
            {

            }
            else if (choice2.equalsIgnoreCase("chest")) 
            {
                JOptionPane.showMessageDialog(null, userName + ", as you open the chest a ghost escapes and scares you to death.");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("chest.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice2.equalsIgnoreCase("go back")) 
            {
                roomCount = true;
                FrontDoor();
            }
            else
            {
                LivingRoom();
            }
    }  
    
    //Downstairs bathroom interaction
    void DownBath() {
        choice3 = JOptionPane.showInputDialog(null, userName + ", as you walk in the bathroom you see a leaky shower and notice something strange about the foggy mirror.\nEnter one option: shower, mirror, or go back");
            if (choice3.equalsIgnoreCase("shower")) 
            {
                JOptionPane.showMessageDialog(null, "You open the shower curtains when suddenly the room steams up and you feel fingers touching the back of your neck\n\nTHE END!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("shower.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice3.equalsIgnoreCase("mirror"))
            {
                JOptionPane.showMessageDialog(null, "When you look at the mirror you see a bloody face looking back at you.\nYou hear a shriek: '" + userName + "I am youuuuu from the fuuturre!!!!'\nYou then die of fright.\n\n THE END!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("mirror.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice3.equalsIgnoreCase("go back")) 
            {
                LivingRoom();
            }
            else {
                DownBath();
            }
    }
    
    //Upstairs interaction
    void UpStairs() {
        choice2 = JOptionPane.showInputDialog(null, userName + ", as you walk up the steps in a hallway you see three different rooms.\nThere are two bedrooms and a master bedroom down the hall.\nEnter one option: bedroom1, bedroom2, master, or go back");
            if (choice2.equalsIgnoreCase("bedroom1")) 
            {
                BedroomOne();
            }
            else if (choice2.equalsIgnoreCase("bedroom2")) 
            {
                BedroomTwo();
            } 
            else if (choice2.equalsIgnoreCase("master")) 
            {
                MasterBed();
            } 
            else if (choice2.equalsIgnoreCase("go back")) 
            {
              roomCount = true;
              FrontDoor();
            }
            else 
            {
                UpStairs();
            }
    }
    
    //Master bedroom interaction
    void MasterBed(){
        choice3 = JOptionPane.showInputDialog(null, userName + ", as you enter the master bedroom you see an intricate jewelry box and an entry to the master bathroom.\nEnter one option: jewelry, bathroom, or go back");
        
        //Chance to escape unharmed
        if (choice3.equalsIgnoreCase("jewelry")) 
            {
                JOptionPane.showMessageDialog(null, "When you walk in the master bedroom you see a jewelry box.\nWhen you open it you see loads of expensive jewels.\nExcitedly, You fill your pockets with as much as you can hold.");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("jewelry.png"));
                JOptionPane.showMessageDialog(null, "", "Master Bedroom", JOptionPane.OK_OPTION, icon2);

                MasterBed();
            }
            else if(choice3.equalsIgnoreCase("bathroom"))
            {
                MasterBath();
            } 
            else if (choice3.equalsIgnoreCase("go back"))
            {
                UpStairs();
            }
            else
            {
                MasterBed();
            }
    }        
    
    //Master bathroom interaction
    void MasterBath() {
        choice4 = JOptionPane.showInputDialog(null, userName + "As you walk into the bathroom you see a strange oil lamp and a noisy shower.\nEnter one option: lamp, shower, or go back");
            if (choice4.equalsIgnoreCase("shower")) 
            {
                JOptionPane.showMessageDialog(null, "Suddenly you hear singing in the shower, but no one is there.You take a step back, confused.\nAs you walk back you slip on something and fall, hitting your head.\n\nTHE END!!!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("shower2.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            } 
            else if (choice3.equalsIgnoreCase("lamp")) 
            {
                JOptionPane.showMessageDialog(null, "You grab the lamp and begin to rub it, but suddenly you find yourself being sucked into the lamp.\n\nTHE END");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("lamp.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice4.equalsIgnoreCase("go back")) 
            {
                MasterBed();
            }
            else
            {
                MasterBath();
            }
    }
    
    //Bedroom 1 interaction
    void BedroomOne() {
        choice3 = JOptionPane.showInputDialog(null, userName + ", when you walk in the room there is a wooden chair rocking by itself while wind comes from an open window.\nThere is also an entry to bathroom.\nEnter one option: chair, window, bathroom, or hallway");
            if (choice3.equalsIgnoreCase("chair")) 
            {
                JOptionPane.showMessageDialog(null, "As you go closer to the chair you see a strange figure.\nNext thing you know wake up in a daze in the hallway.");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("chair.png"));
                JOptionPane.showMessageDialog(null, "", "Explore", JOptionPane.OK_OPTION, icon2);
                UpStairs();
            }
            else if (choice3.equalsIgnoreCase("window"))
            {
                JOptionPane.showMessageDialog(null, "You walk up to the window and look outside.\nYou see two children playing outside and in a blink of the eye, they're gone."
                        + "\nSuddenly, you feel a push and you're head first towards the lawn.\n\nTHE END!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("window.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice3.equalsIgnoreCase("bathroom"))
            {
                bedroomCount = true;
                UpBath();
            }
            
            else if (choice3.equalsIgnoreCase("hallway")) 
            {
                UpStairs();
            }
            else 
            {
                BedroomOne();
            }
    }
    
    //Bedroom 2 interaction
    void BedroomTwo(){
        choice3 = JOptionPane.showInputDialog(null, userName + ", when you walk in the room you see a dresser with a drawer slightly open.\nThere is also a doll house in the corner of the room\nYou see a door leading to the bathroom.\nEnter one option: dresser, dollhouse, bathroom, or hallway");
            if (choice3.equalsIgnoreCase("dresser")) 
            {
                JOptionPane.showMessageDialog(null, "You open the dresser draw and ghost pops up and scares you to death.\n\nTHE END!!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("dresser.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
            } 
            else if (choice3.equalsIgnoreCase("dollhouse")) 
            {
                JOptionPane.showMessageDialog(null, "You look inside the doll house and the dolls start to dance on their own\nSuddenly you find yourself doll sized and inside the house.\n\nTHE END!!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("dollhouse.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
            } 
            else if (choice3.equalsIgnoreCase("bathroom"))
            { 
                bedroomCount = false;
                UpBath();
            }
            else if (choice3.equalsIgnoreCase("hallway")) 
            {
                UpStairs();
            }       
            else 
            {
                BedroomTwo();
            }
    }
    
    //Upstairs bathroom interaction
    void UpBath() {
        choice4 = JOptionPane.showInputDialog(null, userName + "As you walk into the bathroom you see a strange mirror and a leaking shower.\nYou also notice a door leading to the next bedroom.\nEnter one option: mirror, shower, bedroom, or go back");
            if (choice3.equalsIgnoreCase("shower")) 
            {
                JOptionPane.showMessageDialog(null, "You open the shower curtains when suddenly the room steams up and you feel fingers touching the back of your neck\n\nTHE END!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("shower.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice3.equalsIgnoreCase("mirror"))
            {
                JOptionPane.showMessageDialog(null, "When you look at the mirror you see a bloody face looking back at you.\nYou hear a shriek: '" + userName + "I am youuuuu from the fuuturre!!!!'\nYou then die of fright.\n\n THE END!");
                ImageIcon icon2 = new ImageIcon(getClass().getResource("mirror.png"));
                JOptionPane.showMessageDialog(null, "", "Game Over!", JOptionPane.OK_OPTION, icon2);
                System.exit(0);
            }
            else if (choice4.equalsIgnoreCase("go back")) 
            {
                while(bedroomCount == true) 
                {
                    BedroomOne();
                }
                while(bedroomCount == false)
                {
                    BedroomTwo();
                }
            }
            else if (choice4.equalsIgnoreCase("bedroom"))
            {
                while(bedroomCount == true) 
                {
                    BedroomTwo();
                }
                while(bedroomCount == false)
                {
                    BedroomOne();
                }
            }
            else 
            {
                UpBath();
            }
    }
    
    //Front door interaction
    void FrontDoor() {    
        
        while (roomCount == false) 
        {
            HouseStart();
            choice1 = JOptionPane.showInputDialog(null, userName + ", you are currently at the front door.\nYou can either go to the Living Room, Dining Room, or Upstairs.\n\nEnter one option: living room, dining room, or upstairs");
                while (choice1.equalsIgnoreCase("dining room")) 
                {
                    DiningRoom(); 
                }
                while (choice1.equalsIgnoreCase("living room")) 
                {
                    LivingRoom();
                }
                while (choice1.equalsIgnoreCase("upstairs")) 
                {
                    UpStairs();
                }
        }
        while (roomCount == true) 
        {
            
            choice1 = JOptionPane.showInputDialog(null, userName + ", you are currently at the front door.\nYou can either go to the Living Room, Dining Room, Upstairs, or leave through the front door.\n\nEnter one option: living room, dining room, upstairs, or leave");
            while (choice1.equalsIgnoreCase("dining room")) 
            {
                DiningRoom(); 
            }
            while (choice1.equalsIgnoreCase("living room")) 
            {
                LivingRoom();
            }
            while (choice1.equalsIgnoreCase("upstairs")) 
            {
                UpStairs();
            }
            while (choice1.equalsIgnoreCase("leave")) 
            {
            System.exit(0);
            }
        } 
    }
    
    //Starts the dialog & prompts user for name
    void HouseStart() {
        userName = JOptionPane.showInputDialog(null, "Welcome to the Haunted House!\nWhat's your name?");
        JOptionPane.showMessageDialog(null, "Welcome, " + userName + ". Tread carefully on this gloomy night...\n"
                + "As you walk into the house you hear a mysterious voice echoing through the house,\n'" + userName + " has entered the front dooooor mwahhahahaha!'");
        ImageIcon icon = new ImageIcon(getClass().getResource("map.jpg"));
        JOptionPane.showMessageDialog(null, "", "Front Door", JOptionPane.OK_OPTION, icon);
        

    }
}
