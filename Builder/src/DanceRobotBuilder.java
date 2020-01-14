/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 上午12:46
 */
public class DanceRobotBuilder implements StandardRobot {

	Robot robot;

	public DanceRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildHead() {
		this.robot.setHead("头部程序");
	}

	@Override
	public void buildBody() {
		this.robot.setBody("身体程序");
	}

	@Override
	public void buildHand() {
		this.robot.setHand("手臂程序");
	}

	@Override
	public void buildFoot() {
		this.robot.setFoot("足部程序");
	}

	@Override
	public Robot createRoBot() {
		return this.robot;
	}
}
