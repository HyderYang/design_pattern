/**
 * 适配器
 * 将不同类型的 国标接口 和 德标接口 适配为 国际标准
 * @author Hyder
 * @version 1.0
 * @date 2019/12/16 上午12:48
 */
public class SocketAdapter implements GJBZSocket{
	private Object socket;

	public SocketAdapter(Object socket) {
		this.socket = socket;
	}

	@Override
	public void charge() {
		if (this.socket instanceof GBSocket){
			((GBSocket) this.socket).charge();
		} else if (this.socket instanceof DBSocket) {
			((DBSocket) this.socket).charge();
		}
	}
}
