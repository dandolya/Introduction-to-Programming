package markup;

import java.util.List;

public class Paragraph {
	List<AbstractText> paragraph;
 
	Paragraph(List list) {
		paragraph = list;
	}
	
	public void toMarkdown(StringBuilder sb) {
		for (int i = 0; i < paragraph.size(); i++) {
			paragraph.get(i).toMarkdown(sb);
		}
	}
	
	public void toHtml(StringBuilder sb) {
		for (int i = 0; i < paragraph.size(); i++) {
			paragraph.get(i).toHtml(sb);
		}
	}
	
}