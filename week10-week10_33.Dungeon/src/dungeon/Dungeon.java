package dungeon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Dungeon {
    private int height;
    private int lenght;
    private int vampires;
    private int moves;
    private boolean vmapiresMove;
    private List<Vampire> listVampires;
    private Player player;

    public Dungeon(int lenght, int height, int vampires, int moves, boolean vmapiresMove) {
        if (lenght == height) {
            throw new IllegalArgumentException("Error: Lenght and height have to be different. Its a rectangle");
        }
        this.height = height;
        this.lenght = lenght;
        this.vampires = vampires;
        this.moves = moves;
        this.vmapiresMove = vmapiresMove;
        this.player = new Player();
        this.listVampires = new ArrayList<Vampire>();
        fillDungOfVampires();
    }

    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }

    private void fillDungOfVampires(){
        for (int i = 0; i < this.vampires; i++) {
            this.listVampires.add(new Vampire());
        }
    }
    
    public boolean isPositionEmpty(int x, int y){
        for (Vampire vampire : this.listVampires) {
            if (vampire.getPosX() == x && vampire.getPosY() == y) {
                return false;
            }
        }
        return true;
    } 
    
    public void run(){
        
    }
}