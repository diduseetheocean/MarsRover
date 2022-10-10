package Tests;

import Enums.Controls;
import Enums.Direction;
import Logic.Plateau;
import Logic.Rover;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class RoverTest {

    @Test
    public void testMoveRover_AssertChangedDirection_AssertUnchangedCoords() {
        plateau.dropRover(correctCoords.x, correctCoords.y, Direction.North);
        Rover rover = plateau.rovers.get(0);
        rover.move(Controls.L);
        rover.move(Controls.L);
        Assert.assertEquals(rover.x, correctCoords.x);
        Assert.assertEquals(rover.y, correctCoords.y);
        Assert.assertEquals(rover.currentDirection, Direction.South);
    }

    @Test
    public void testMoveRover_AssertChangedDirection_AssertChangedCoords() {
        plateau.dropRover(correctCoords.x, correctCoords.y, Direction.North);
        Rover rover = plateau.rovers.get(0);
        rover.move(Controls.L);
        rover.move(Controls.L);
        rover.move(Controls.M);
        Assert.assertEquals(rover.x, correctCoords.x);
        Assert.assertEquals(rover.y, correctCoords.y - 1);
        Assert.assertEquals(rover.currentDirection, Direction.South);
    }

    @Test
    public void testMoveRover_AssertIncorrectDirection() {
        plateau.dropRover(correctCoords.x, correctCoords.y, Direction.North);
        Rover rover = plateau.rovers.get(0);
        rover.move(Controls.L);
        Assert.assertNotEquals(rover.currentDirection, Direction.South);
    }

    private final Plateau plateau = new Plateau(5,5);
    private final Point correctCoords =  new Point(3,3);
}