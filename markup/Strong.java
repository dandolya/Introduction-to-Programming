package markup;

import java.util.List;

public class Strong extends AbstractText{
	Strong(List list) {
		super.list = list;
		super.s1 = "__";
		super.s2 = "strong";
	}
	
	public void toMarkdown(StringBuilder sb) {
		myToMarkdown(sb);
	}	
	
	public void toHtml(StringBuilder sb) {
		myToHtml(sb);
	}
}