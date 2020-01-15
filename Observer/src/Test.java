/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 下午12:14
 */
public class Test {
	public static void main(String[] args) {

		WechatServer wechatServer = new WechatServer();

		Observer zs = new User("张三");
		Observer ls = new User("李四");
		Observer ww = new User("王五");

		wechatServer.registerObserver(zs);
		wechatServer.registerObserver(ls);
		wechatServer.registerObserver(ww);

		wechatServer.setInformation("开启推送昨天消息");

		System.out.println("----------------------------------------");

		wechatServer.removeObserver(zs);
		wechatServer.setInformation("开始推送今天消息");
	}
}
