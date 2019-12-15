/**
 * 装饰类
 * @author Hyder
 * @version 1.0
 * @date 2019/12/16 上午12:36
 */
public class PhoneDecorator implements Phone {

	private Phone phone;

	public PhoneDecorator(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void call() {
		System.out.println("彩铃响起来");
		this.phone.call();
	}
}
