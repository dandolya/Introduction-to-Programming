package markup;

public class Text extends AbstractText{
	String text;	
	
	Text(String text) {
		this.text = text;
	}
	public void toMarkdown(StringBuilder sb) {
		sb.append(text);
	}
	
	public void toHtml(StringBuilder sb) {
		sb.append(text);
	}
}