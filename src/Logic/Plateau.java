package Logic;

import Enums.Direction;

import java.util.ArrayList;

public class Plateau {
    public int height;
    public int width;

    public ArrayList<Rover> rovers = new ArrayList();

    public Plateau(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean dropRover(int x, int y, Direction direction) {
        if(checkCoordsInPlateau(x, y)) {
            Rover rover = new Rover(x, y, direction);
            rover.plateau = this;
            rovers.add(rover);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkCoordsInPlateau(int x, int y) {
        return x >= 0 && x < this.width && y >= 0 && y < this.height;
    }
}
