/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 上午12:51
 */
public class Test {
	public static void main(String[] args) {
		Director director = new Director();
		Robot robotByDirector = director.createRobotByDirector(new DanceRobotBuilder());
		System.out.println(robotByDirector.getHead());
		System.out.println(robotByDirector.getBody());
		System.out.println(robotByDirector.getHand());
		System.out.println(robotByDirector.getFoot());
		System.out.println(robotByDirector);

	}
}
