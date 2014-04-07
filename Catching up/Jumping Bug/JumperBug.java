import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperBug extends Actor{

	private int steps;

	public JumperBug()
	{

	}

	public void act() {
		if (canJump()) {
			jump();
		} else {
			turn();
		}
	}

	public void turn() 
	 { 
	 setDirection(getDirection() + Location.HALF_RIGHT); 
	 }



	public boolean canJump() {
	    Grid<Actor> gr = getGrid();
	    if (gr == null)
	        return false;

	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection());
	    Location second = next.getAdjacentLocation(getDirection());

	    if (!gr.isValid(next))
	        return false;

	    if (!gr.isValid(second))
	    	return false;
	    Actor neighbor = gr.get(second);
	    return (neighbor == null) || (neighbor instanceof Flower);
	}

	public void jump()
	{
		Location here = getLocation();
		Location nextLocation = here.getAdjacentLocation(getDirection());
		Location afterNext = nextLocation.getAdjacentLocation(getDirection());

		moveTo(afterNext);


		// if (canJump(second)) {
		// 	moveTo(second);
		// }
	}

}
