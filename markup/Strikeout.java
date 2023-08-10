package markup;

import java.util.List;

public class Strikeout extends AbstractText{
	Strikeout(List list) {
		super.list = list;
		super.s1 = "~";
		super.s2 = "s";
	}
	
	public void toMarkdown(StringBuilder sb) {
		myToMarkdown(sb);
	}
	
	public void toHtml(StringBuilder sb) {
		myToHtml(sb);
	}
}