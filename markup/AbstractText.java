package markup;

import java.util.List;

public abstract class AbstractText {
	List<AbstractText> list;
	String s1, s2;
	
	public abstract void toMarkdown(StringBuilder sb);
	public void myToMarkdown(StringBuilder sb) {
		sb.append(s1);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).toMarkdown(sb);
		}
		sb.append(s1);
	}
	
	public abstract void toHtml(StringBuilder sb);
	public void myToHtml(StringBuilder sb) {
		sb.append("<" + s2 + ">");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).toHtml(sb);
		}
		sb.append("</" + s2 + ">");
	}
}