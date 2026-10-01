import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program2 {
	public static void main(String[] args) {
		List<String> colors= new ArrayList<>();
		colors.add("Red");
		colors.add("yellow");
		colors.add("white");
		colors.add("Black");
		
		System.out.println("colors before sorting:"+colors);
		
		Collections.sort(colors);
		
		System.out.println("colors after sorting:"+ colors);
		
		
		
	}

}
