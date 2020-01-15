
/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 上午1:05
 */
public interface Observerable {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
