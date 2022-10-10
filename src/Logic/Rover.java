package Logic;

import Enums.Controls;
import Enums.Direction;

public class Rover {
    public int x;
    public int y;
    public Plateau plateau;
    public Direction currentDirection;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.currentDirection = direction;
    }

    public void move(Controls control) {
        String startPosition = getCurrentPosition();
        switch (control) {
            case L:
                turnLeft();
                break;
            case R:
                turnRight();
                break;
            case M:
                moveForward();
                break;
        }
        String endPosition = getCurrentPosition();
        System.out.println("Start: " + startPosition + " | End: " + endPosition);
    }

    private String getCurrentPosition() {
        return x + ", " + y + ", " + currentDirection;
    }

    private void turnLeft() {
        switch (currentDirection) {
            case North: currentDirection = Direction.West;
                break;
            case East: currentDirection = Direction.North;
                break;
            case South: currentDirection = Direction.East;
                break;
            case West: currentDirection = Direction.South;
                break;
        }
    }

    private void turnRight() {
        switch (currentDirection) {
            case North: currentDirection = Direction.East;
                break;
            case East: currentDirection = Direction.South;
                break;
            case South: currentDirection = Direction.West;
                break;
            case West: currentDirection = Direction.North;
                break;
        }
    }

    private void moveForward() {
        switch(currentDirection) {
            case North:
                moveIfPossible(x, y + 1);
                break;
            case East:
                moveIfPossible(x + 1, y);
                break;
            case South:
                moveIfPossible(x, y - 1);
                break;
            case West:
                moveIfPossible(x - 1, y);
                break;
        }
    }

    private void moveIfPossible(int x, int y) {
        if(plateau.checkCoordsInPlateau(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Fail to move in direction: " + currentDirection);
        }
    }
}
