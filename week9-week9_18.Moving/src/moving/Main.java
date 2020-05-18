/*
Tema: Ejercicio
*/

package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.*;
import moving.logic.*;

public class Main {

    public static void main(String[] args) {
        // the things we want to pack
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));
        things.add(new Item("pc", 6));
        things.add(new Item("celphone", 7));
        things.add(new Item("food", 3));
        things.add(new Item("mouse", 3));

        // we create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings(things);

        System.out.println("number of boxes: " + boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: " + box.getVolume() + " dm^3");
        }

    }
}
