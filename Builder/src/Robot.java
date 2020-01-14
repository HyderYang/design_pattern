/**
 * @author Hyder
 * @version 1.0
 * @date 2020/1/15 上午12:40
 */
public class Robot {
	private String head;
	private String body;
	private String hand;
	private String foot;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public Robot(String head, String body, String hand, String foot) {
		this.head = head;
		this.body = body;
		this.hand = hand;
		this.foot = foot;
	}
}
