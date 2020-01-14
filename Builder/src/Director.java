/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 上午12:49
 */
public class Director {
	public Robot createRobotByDirector(StandardRobot robot){
		robot.buildHead();
		robot.buildBody();
		robot.buildHand();
		robot.buildFoot();
		return robot.createRoBot();
	}
}
