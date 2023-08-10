package markup;

import java.util.List;

public class Emphasis extends AbstractText{
	Emphasis(List list) {
		super.list = list;
		super.s1 = "*";
		super.s2 = "em";
	}
	
	public void toMarkdown(StringBuilder sb) {
		myToMarkdown(sb);
	}
	
	public void toHtml(StringBuilder sb) {
		myToHtml(sb);
	}
}