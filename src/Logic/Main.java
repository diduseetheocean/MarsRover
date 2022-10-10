package Logic;

import Enums.Controls;
import Enums.Direction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Plateau plateau = new Plateau(5,5);

        // First Logic.Rover
        if(plateau.dropRover(1, 2, Direction.North))
            System.out.println("Logic.Rover successfull dropped.");
        else
            System.out.println("Logic.Rover can't be dropped on these coordinates.");

        Rover currentRover = plateau.rovers.get(0);

        currentRover.move(Controls.L);
        currentRover.move(Controls.M);

        currentRover.move(Controls.L);
        currentRover.move(Controls.M);

        currentRover.move(Controls.L);
        currentRover.move(Controls.M);

        currentRover.move(Controls.L);
        currentRover.move(Controls.M);

        currentRover.move(Controls.M);

        // Second Logic.Rover
        if(plateau.dropRover(3, 3, Direction.East))
            System.out.println("Logic.Rover successfull dropped.");
        else
            System.out.println("Logic.Rover can't be dropped on these coordinates.");

        currentRover = plateau.rovers.get(1);

        currentRover.move(Controls.M);
        currentRover.move(Controls.M);

        currentRover.move(Controls.R);
        currentRover.move(Controls.M);

        currentRover.move(Controls.M);
        currentRover.move(Controls.R);

        currentRover.move(Controls.M);
        currentRover.move(Controls.R);

        currentRover.move(Controls.R);
        currentRover.move(Controls.M);
    }
}

