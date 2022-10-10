# Mars Rover

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. The rovers must
navigate this plateau (which is curiously rectangular) so that their on-board cameras can get
a complete view of the surrounding terrain to send back to Earth.
A rover's position and location is represented by a combination of x and y co-ordinates and a
letter that represents one of the four cardinal compass points. The plateau is divided up into
a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is
in the bottom left corner and facing North.
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L',
'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without
moving from its current spot. 'M' means move forward one grid point, and maintain the same
heading.

## Example of 3x3 Mars plateau grid with coordinates
0,2 1,2 2,2 <br>
0,1 1,1 2,1 <br>
0,0 1,0 2,0 <br>

## 1. We have to define the Mars plateau
The constructor should be the upper-right bounds of the plateau (3, 3 in the example),
the lower-left coordinates are assumed to be 0,0. The boundaries are specified by
two digits for the up-right corner in the first command from the control center.
## 2. We have to deploy rovers
Multiple rovers can be deployed on the Mars plateau. The deployment process just
specifies the initial x, y position of the rover (landing) as well as the direction it is
facing.
## 3. We should be able to move the rovers over the plateau
using the letters L, R, and M. After each command, the rover should return the start,
the end position, and his direction to the control center. The control center should see
all current positions of all mars rovers
We have to make sure that no rover can leave the boundaries of the Mars plateau. If the
control center sends an illegal command, the rover should not move.

## Example:

### Input
5 5 <br>
1 2 N <br>
LMLMLMLMM <br>
3 3 E <br>
MMRMMRMRRM <br>

### Output
1 3 N <br>
4 1 E <br>