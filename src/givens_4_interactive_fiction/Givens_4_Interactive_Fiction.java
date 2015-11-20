package givens_4_interactive_fiction;

import java.util.Scanner;

/**
 *
 * @author agivens
 */
public class Givens_4_Interactive_Fiction {

    static String startgame;
    static String stayorelevator;
    static String secondthirdtop;
    static String lookoroutside;
    static String whichdoor;
    static String doorormovement;
    static String buttonorexplore;
    static String lightorno;
    static String wakeleave;
    static String ramoritem;
    static String braveordoor;
    static String forkintheroad;
    static String nextmethod;
    static String squareone;
    static boolean playagain;
    static int chanceleft = 3;
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        playagain = true;
        startup();
        while (playagain) {
            startup();
        } //#while
        while (chanceleft > 0) {
            playagain = true;
        }
    }

    public static void startup() {
        System.out.println("You are stuck in a nightmare. You will only have 3 chances before you are trapped in the bad dream forever. "
                + "Good Luck. Type 'continue' to begin.");
        startgame = userinput.nextLine().toLowerCase();
        if (startgame.contains("c")) {
            startupTwo();
        } else {
            startup();
        }
    } //#method1()

    public static void startupTwo() {
        chanceleft--;
        System.out.println("You find yourself in the middle of a rotting, multi floored building. Where are you?"
                + " How did you get here? What do you do now? You notice there is an elevator in front of you. "
                + "Do you stay on this floor, maybe explore a little, or go into the elevator, hope it works, and pick another floor?");
        System.out.println("Type 'stay' to stay on ground floor. Type 'elevator' to try the elevator.");
        stayorelevator = userinput.nextLine().toLowerCase();
        if (stayorelevator.contains("e")) {
            newFloor();
        } else {
            groundFloor();
        }
    } //#method2()

    static void groundFloor() {
        System.out.println("You decide to stay on the bottom floor. You can either look around or go outside. Which do you choose?");
        System.out.println("Type 'out' to leave the building. Type 'explore' to look around the ground floor.");
        lookoroutside = userinput.nextLine().toLowerCase();
        if (lookoroutside.contains("out")) {
            goOutside();
        } else {
            stayInside();
        } //#method3()
    }

    static void newFloor() {
        System.out.println("What floor do you choose?");
        System.out.println("Type 'second' to go to the second floor. Type 'third' to try the third floor. Type ‘fourth’ to attempt to travel to the top floor.");
        secondthirdtop = userinput.nextLine().toLowerCase();
        if (secondthirdtop.contains("sec")) {
            floorTwo();
        } else if (secondthirdtop.contains("third")) {
            floorThree();
        } else {
            topFloor();
        }
    } //#method4()

    static void stayInside() {
        System.out.println("Deciding to stay inside, you take a second to really look at your surroundings."
                + "You notice that the all windows are boarded up. Walking over to uncover the closest window, "
                + "you fall through the floor and everything goes dark. BAD END");
        gameOver();
    } //#method5()

    static void goOutside() {
        System.out.println("You, being a curious person, decide to venture outside the building."
                + " When you open the door, you see nothing but a plain, scattered with trees."
                + " You walk farther and farther away from the building until it is far in the distance."
                + " You wander the plain until you eventually meet your demise. BAD END");
        gameOver();
    }

    public static void gameOver() {
        System.out.println(" ");
        System.out.println("Your nightmare has gotten the best of you.");
        System.out.println("You have " + chanceleft + " more chances left.");
        System.out.println(" ");
        if (chanceleft > 0) {
            startupTwo();
        } else {
            finalGameOver();
        }
    }

    static void floorTwo() {
        System.out.println("The second floor is a dark hallway with flickering lights. "
                + "The lights provide enough light to see three doors. Two, to your left and right, respectively."
                + " And another door at the end of the hall. The doors have numbers spray painted onto them."
                + " One is to your left, two is at the end of the hall, and three is to your right. Which door do you choose?");
        System.out.println("Type 'one', 'two', or 'three'.");
        whichdoor = userinput.nextLine().toLowerCase();
        if (whichdoor.contains("one")) {
            stairwayDoorLight();
        } else if (whichdoor.contains("two")) {
            doorNumberTwo();
        } else {
            doorNumberThree();
        }
    }

    static void floorThree() {
        System.out.println("You arrive on the third floor. Even with the lights flickering,"
                + " you see something move at the end of the hall out of the corner of your eye."
                + " You continue to survey the floor and you notice a door to the left of the elevator."
                + " What do you do?");
        System.out.println("Type 'door' to check out the door next to the elevator. Type 'movement' to investigate the end of the hall.");
        doorormovement = userinput.nextLine().toLowerCase();
        if (doorormovement.contains("d")) {
            stairwayDoorLight();
        } else {
            exploreMovement();
        }

    }

    static void topFloor() {
        System.out.println("You soon arrive on the top floor, you are immediately blinded. "
                + "Do you explore the floor, feeling your way across, or do you hit a random button in the elevator and travel to a new floor?");
        System.out.println("Type 'button' to take you chances with the elevator. Type 'explore' to feel around the floor.");
        buttonorexplore = userinput.nextLine().toLowerCase();
        if (buttonorexplore.contains("b")) {
            randomButton();
        } else {
            exploreFloor();
        }
    }

    static void stairwayDoorLight() {
        System.out.println("The door you chose turns out to be the stairway door. You descend down the "
                + "steps cautiously. You make it to the bottom in one piece. At the bottom of the stairs,"
                + " you find a dirt tunnel. The tunnel reminds you of an old mine shaft. It's dark inside"
                + " and you can't see farther than your nose when you step inside. You remember this "
                + "is a dream and pull out a flashlight. You turn it on and continue.");
        System.out.println("Type 'next' to continue down the tunnel.");
        nextmethod = userinput.nextLine().toLowerCase();
        if (nextmethod.contains("ne")) {
            forkInRoad();
        }
    }

    static void doorNumberTwo() {
        System.out.println("You discover this building is, in fact, an old apartment complex."
                + "The door you have chosen is an old furnished apartment. You feel the wall"
                + " next to the door for a light switch. You find one and, surprise, the lights still work."
                + " You see a cat, staring up at you. You decide that you have nowhere to go, so "
                + "you'll stay with the cat in the apartment. The two of you live the rest of your days "
                + "in the apartment, whose pantry was stocked full of non-perishable food. You may "
                + "have lost some of your sanity along the way, but you lived, right?");
        System.out.println("You turned your nightmare into an okay dream. You wake up safe and sound in your bed "
                + "in the morning. You woke up, so it's good enough. OKAY END");
    }

    static void doorNumberThree() {
        System.out.println("You open door three and feel the wall for a light switch. You flip it on"
                + " and discover, you are not alone in the room. A man lays on the couch, sleeping. "
                + "Do you wake the man, to see if he can shed some light on the situation, or do you leave quietly "
                + "and leave to explore another door?");
        System.out.println("Type 'wake up' to bother the sleeping man. Type 'leave now' to leave.");
        wakeleave = userinput.nextLine().toLowerCase();
        if (wakeleave.contains("leave")) {
            floorTwo();
        } else {
            botherMan();
        }
    }

    static void exploreMovement() {
        System.out.println("You creep down the hall. The movement turns out to be a squirrel. You stare "
                + "at the squirrel for a little while, before it leaps at your face. BAD END");
        gameOver();
    }

    static void randomButton() {
        System.out.println("You fumble for a button. Finding one, you slam your hand down on the button. "
                + "Suddenly, the elevator descends downwards at a rapid pace. The elevator feels like it's free falling. "
                + "Then all at once, the elevator jerks to a stop. You hear the 'ding' that accompanies "
                + "the opening of the elevator doors. You decide to explore the floor you've arrived on. "
                + "You inch along the wall, looking for a door. You find the only door at the end of the hall."
                + " You think you can ram it down if you put all your weight into it. Do you ram the door down "
                + "with your shoulder, or do you find something else to ram the door down with?");
        System.out.println("Type 'ram' to ram the boarded up door and probably dislocate your shoulder."
                + "Type 'noodle arms' to find soemthing else to knock the door down with.");
        ramoritem = userinput.nextLine().toLowerCase();
        if (ramoritem.contains("ram")) {
            ramDoor();
        } else {
            findObject();
        }
    }

    static void exploreFloor() {
        System.out.println("You feel the walls to the left and right of the elevator. There's a door "
                + "to the left. Do you continue scoping out the floor or investigate the door?");
        System.out.println("Type 'keep going' to continue exploring the floor. Type 'door' to"
                + " find out what's behind the door.");
        braveordoor = userinput.nextLine().toLowerCase();
        if (braveordoor.contains("ke")) {
            fallOffRoof();
        } else {
            stairwayDoorBlind();
        }
    }

    static void botherMan() {
        System.out.println("You shake the man awake. When his eyes focus on you, he smiles a demented smile."
                + "That's the last thing you see before the world goes dark. BAD END");
        gameOver();
    }

    static void ramDoor() {
        System.out.println("You succeed in breaking the door down. As it turns out, you do dislocated your shoulder."
                + " Inside the door is a rabid dog. The dog attacks you and, because you have nothing to defend yourself "
                + "with, you do not survive the encounter. BAD END");
        gameOver();
    }

    static void findObject() {
        System.out.println("You feel around and find a beam that must have fallen. You pick it up. You "
                + "dive inside the doorway just in time. The doorway collapses behind you. You defend yourself "
                + "from a rabid dog. You slowly starve, since there is nothing in the room. BAD END");
        gameOver();
    }

    static void fallOffRoof() {
        System.out.println("You walk around aimlessly, feeling for the wall. You don't find a wall, instead "
                + "you fall of the building. The top floor of the building was the roof. BAD END");
        gameOver();
    }

    static void stairwayDoorBlind() {
        System.out.println("You feel along the left wall. "
                + "It feels like dirt. Eventually, you reach a dead end. You remember the sensation of falling. "
                + "You don't remember anything else after that. BAD END");
        gameOver();
    }

    static void forkInRoad() {
        System.out.println("Eventually, you come to a fork in the road. Which path do you take?");
        System.out.println("Type 'left' or 'right' to take the left or right tunnel.");
        forkintheroad = userinput.nextLine().toLowerCase();
        if (forkintheroad.contains("le")) {
            toTheLeft();
        } else {
            toTheRight();
        }
    }

    static void toTheLeft() {
        System.out.println("You choose to take the left pathway. You walk for hours. At the end, when you are too weak "
                + "to catch yourself, you fall into a pit and break your neck. BAD END");
        gameOver();
    }

    static void toTheRight() {
        System.out.println("You choose to take the right pathway. You walk for hours. At the end, "
                + "you find a metal door. At last, the nightmare is over. You wake up safe, in your bed."
                + " This was all just a nightmare. GOOD END");
    } //#win #forthewin

    static void finalGameOver() {
        playagain = false;
        System.out.println("Your three chances have all been used. You couldn't conquer your nightmare.");
    } //#lose #fortheloss
}
