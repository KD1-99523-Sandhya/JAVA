import java.util.ArrayList;
import java.util.List;

public class program3 {
	public static void main(String[] args) {
		List <Integer> ele = new ArrayList<>();
		ele.add(10);
		ele.add(20);
		ele.add(30);
		ele.add(40);
		ele.add(50);
		
		System.out.println("element before replacing:"+ele);
		
		ele.set(1, 60);
		
		System.out.println("element after replacing:"+ele);
		
	}

}
