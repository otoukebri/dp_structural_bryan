
import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
	List<String> li = new ArrayList<>();
	li.add("sam");li.add("ryio");li.add("caro");
	StringBuilder builder = new StringBuilder();
	    
	Iterator<String> itr = li.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			builder.append(s);
		}
	System.out.println(builder);
		
	}
}
