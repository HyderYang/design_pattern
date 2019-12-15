/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/16 上午12:34
 */
public class Test {
	public static void main(String[] args) {
		Phone iphone6 = new Iphone6();
		(new PhoneDecorator(iphone6)).call();

	}
}
