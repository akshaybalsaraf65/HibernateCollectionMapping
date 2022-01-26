import java.util.List;

public class Answer {

	private int id;
	private String answer;
	private String postername;
	private List<String> question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPostername() {
		return postername;
	}
	public void setPostername(String postername) {
		this.postername = postername;
	}
	public Answer(int id, String answer, String postername) {
		super();
		this.id = id;
		this.answer = answer;
		this.postername = postername;
	}
	public Answer() {
		super();
	}
	public List<String> getQuestion() {
		return question;
	}
	public void setQuestion(List<String> question) {
		this.question = question;
	}
	
	
}
