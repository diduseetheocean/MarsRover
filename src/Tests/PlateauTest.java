package Tests;

import Enums.Direction;
import Logic.Plateau;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PlateauTest {


    @Test
    public void testCheckCoordsInPlateau_AssertSucceed(){
        Assert.assertTrue(plateau.checkCoordsInPlateau(correctCoords.x, correctCoords.y));
    }

    @Test
    public void testCheckCoordsInPlateau_AssertFail(){
        Assert.assertFalse(plateau.checkCoordsInPlateau(incorrectCoords.x, incorrectCoords.y));
    }

    @Test
    public void testDropRover_AssertSucceed() {
        Assert.assertTrue(plateau.dropRover(correctCoords.x, correctCoords.y, Direction.East));
    }

    @Test
    public void testDropRover_AssertFail() {
        Assert.assertFalse(plateau.dropRover(incorrectCoords.x, incorrectCoords.y, Direction.East));
    }

    @Test
    public void testDropRoverCheckRoverList_AssertSucceed() {
        plateau.dropRover(correctCoords.x, correctCoords.y, Direction.East);
        Assert.assertEquals(plateau.rovers.size(), 1);
    }

    @Test
    public void testDropRoverCheckRoverList_AssertFail() {
        plateau.dropRover(incorrectCoords.x, incorrectCoords.y, Direction.East);
        Assert.assertEquals(plateau.rovers.size(), 0);
    }

    private final Plateau plateau = new Plateau(5,5);
    private final Point correctCoords =  new Point(3,3);
    private final Point incorrectCoords =  new Point(-1,3);
}