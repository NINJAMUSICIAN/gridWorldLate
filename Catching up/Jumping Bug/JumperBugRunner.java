import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperBugRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		JumperBug ted = new JumperBug();
		ted.setColor(Color.BLACK);
		world.add(new Location(5, 5), ted);
		world.show();
	}

}
