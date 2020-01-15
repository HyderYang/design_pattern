/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 下午12:11
 */
public class User implements Observer{
	private String name;
	private String message;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		this.message = message;
		this.read();
	}

	public void read() {
		System.out.println(this.name + "收到推送消息: " + this.message);
	}
}
