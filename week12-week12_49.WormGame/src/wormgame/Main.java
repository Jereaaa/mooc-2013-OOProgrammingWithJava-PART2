/*
Tema: Ejecicio final: Juego del gusano
*/
package wormgame;

import javax.swing.SwingUtilities;
import wormgame.domain.*;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        WormGame game = new WormGame(20, 20);

        UserInterface ui = new UserInterface(game, 10);
        SwingUtilities.invokeLater(ui);

        while (ui.getUpdatable() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("The drawing board hasn't been created yet.");
            }
        }

        game.setUpdatable(ui.getUpdatable());
        game.start();
    }
}
