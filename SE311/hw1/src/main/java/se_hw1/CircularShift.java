package se_hw1;

import java.util.ArrayList;
import java.util.List;

public class CircularShift {

	public LineStorage performCircularShift(LineStorage ls) {
		LineStorage newLS = new LineStorage();
		
		for (int i = 0; i < ls.getSize(); i++) {
			List<String> lineList = new ArrayList<String>(ls.getLineAsList(i));
			for (int j = 0; j < lineList.size(); j++) {
				newLS.addLine(buildStringFromList(lineList));
				lineList = shiftArray(lineList);
			}
			
		}
		
		return newLS;
	}
	
	private List<String> shiftArray(List<String> list) {
		String firstWord = list.get(0);
		list.remove(0);
		list.add(firstWord);
		
		return list;
	}
	
	private String buildStringFromList(List<String> list) {
		String line = "";
		
		for(int i = 0; i < list.size(); i++) {
			if(i != 0) {
				line += " ";
			}
			line += list.get(i);
		}
		
		return line;
	}
	
}
