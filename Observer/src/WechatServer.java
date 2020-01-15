import java.util.ArrayList;
import java.util.List;

/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 上午1:10
 */
public class WechatServer implements Observerable {

	private List<Observer> list;
	private String message;

	public WechatServer() {
		this.list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
			list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (!list.isEmpty()) {
			list.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		String msg = this.message;
		for (int i = 0; i < this.list.size(); i++) {
			Observer observer = list.get(i);
			observer.update(msg);
		}
	}

	public void setInformation(String information){
		this.message = information;
		System.out.println("消息更新: " + this.message);
		notifyObserver();
	}
}
