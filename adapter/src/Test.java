/**
 * 不同类型对象可以通过适配模式在一起工作
 * @author Hyder
 * @version 1.0
 * @date 2019/12/16 上午12:42
 */
public class Test {
	public static void main(String[] args) {

		SocketAdapter socketAdapter = new SocketAdapter(new GBSocketImpl());
		socketAdapter.charge();

		System.out.println("=============");

		SocketAdapter socketAdapter1 = new SocketAdapter(new DBSocketImpl());
		socketAdapter1.charge();
	}
}
